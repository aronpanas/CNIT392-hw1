/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Stephen
 */
@Entity
public class User implements Serializable
{
    @Id private int userid;

    private String name, address;
    private int ID;

    public User(int setID, String setName, String setAddress) 
    {
        ID = setID;
        this.name = setName;
        this.address = setAddress;
    }
    
    public int getid()
    {
        return userid;
    }
    
    public void setID(int setID)
    {
        userid = setID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String setName)
    {
        this.name = setName;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String setAddress)
    {
        this.address = setAddress;
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.name, this.address);
    }
}
