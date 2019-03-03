/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg392database;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Stephen
 */
@Entity
public class BusinessUser extends User
{
    private String VATnumber;

    public BusinessUser(String name, String address, String VATnumber) 
    {
        super(name, address);
        this.VATnumber = VATnumber;
    }
    
    public String getVAT()
    {
        return VATnumber;
    }
    
    public void setVAT(String setVAT)
    {
        this.VATnumber = setVAT;
    }
    
    public String postHit()
    {
        
    }
    
    public String postSong()
    {
        
    }
    
    
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.VATnumber);
    }
}
