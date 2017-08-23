/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.FriendsRequest;
import enterprise.web_jpa_war.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 13487992
 */
@WebServlet(name = "ListFriends", urlPatterns = {"/ListFriends"})
public class ListFriends extends HttpServlet {
    
    @PersistenceUnit
    private EntityManagerFactory emf;
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        assert emf != null;  //Make sure injection went through correctly.
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            
            
            String yourID = (String)request.getParameter("yourID");

            int y_id = Integer.parseInt(yourID);
          

            List friends = em.createQuery("Select f from FriendsRequest f where f.sender = :fID").setParameter("fID", y_id).getResultList();
            
            List users = null;
            
            for (Object friend : friends) //go through the friends list
            {
                FriendsRequest f = (FriendsRequest) friend; //get the friend object at location i
                int f_receive_id = f.getReceiver(); //get the receiever id of this friend object
                users = em.createQuery("Select u from User u where u.id = :fr").setParameter("fr", f_receive_id).getResultList(); 
            }
            
            request.setAttribute("friendList",friends);
            request.setAttribute("friendsList_2", users);
            
            //Forward to the jsp page for rendering
            
            request.getRequestDispatcher("ListFriends.jsp").forward(request, response);
        } catch (Exception ex) {
            throw new ServletException(ex);
        } finally {
            //close the em to release any resources held up by the persistebce provider
            if(em != null) {
                em.close();
            }
        }
      
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "ListPerson servlet";
    }
    // </editor-fold>
}
