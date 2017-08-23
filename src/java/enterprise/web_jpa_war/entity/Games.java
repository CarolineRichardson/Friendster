/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 13487992
 */
@Entity
@Table(name = "Games")
public class Games implements Serializable {

    @Id
    @Column(name = "GN")
    private int gn;
    
    @Column(name = "Name")
    private String name;
    
   

    /**
     * Creates a new instance of Person
     */
    public Games() {
    }

    public Games(String name) {
      
        this.name = name;
    }

    public int getGn() { //changed to cap ID
        return this.gn;
    }
    
    public String getName()
    {
        return this.name;
    }


    }

