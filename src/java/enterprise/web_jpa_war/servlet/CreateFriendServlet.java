/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.FriendsRequest;
import enterprise.web_jpa_war.entity.FriendsRequestFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

/**
 *
 * @author 13487992
 */
@WebServlet(name = "CreateFriendServlet", urlPatterns = {"/CreateFriend"})
public class CreateFriendServlet extends HttpServlet {
    
   @EJB
   FriendsRequestFacade friendFacade;

    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException {
       

            
            String userID_ = (String) request.getParameter("yourUsername");
            String userID2_  = (String) request.getParameter("friendsUsername");
            
            int userID = Integer.parseInt(userID_);
            int userID2 = Integer.parseInt(userID2_);

            //Creates friendrequest instance
            FriendsRequest fr_req = new FriendsRequest(userID2, userID);
            
            //begin a transaction
            friendFacade.create(fr_req);
            
       try {
           
            //forward to ListFriends
           request.getRequestDispatcher("ListFriends.jsp").forward(request, response);
       } catch (IOException ex) {
           Logger.getLogger(CreateFriendServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        return "Short description";
    }
    // </editor-fold>
}
