/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author 13487992
 */

@Entity
@Table(name = "Friends Request")
@NamedQueries({
    @NamedQuery(name = "FriendsRequest.findBySender", query = "SELECT f FROM FriendsRequest f WHERE f.sender = :sender")})

public class FriendsRequest implements Serializable {

    @Id
    @Column(name = "ID")
    private int id;
    
    @Column(name = "Sender")
    private int sender;
    
    @Column(name = "Receiver")
    private int receiver;
    
   

    /**
     * Creates a new instance of FriendsRequest
     */
    public FriendsRequest() {
    }

    public FriendsRequest(int UserID2, int UserID) {
      
        this.receiver = UserID2;
        this.sender = UserID;
        

    }

    public int getReceiver() {
        return this.receiver;
    }

     public int getSender() {
        return this.sender;
    }

     public int getID()
     {
         return this.id;
     }
}
