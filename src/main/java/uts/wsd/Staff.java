/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 *
 * @Created on : Aug 11, 2018, 9:34:31 PM
   @Author     : Declan Schillert, Ash Wan, Bec Helou, Brooklyn Ciba, Jamie Chan, Jarrod Watts
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "staff", namespace = "http://www.uts.edu.au/31284/wsd-staffs")
public class Staff implements Serializable {

    @XmlElement(name = "ID")
    private String ID;
    @XmlElement(name = "email")
    private String email;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "password")
    private String password;

    public Staff(String ID, String name, String email,String password) {
        this.name = name;
        this.email = email;
        this.password = password;     
        this.ID = ID;
    }

    public Staff() { }
    
    public void updateDetails(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean matchID(String ID){
        return this.ID.equals(ID.trim());
    }
    
    public boolean matchPassword(String password){
        return this.password.equals(password.trim());
    }
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}//end class
