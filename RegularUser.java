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
public class RegularUser extends User
{
    private String VATnumber;

    public RegularUser(String name, String address, String VATnumber) 
    {
        super(name, address);
        this.VATnumber = VATnumber;
    }
    
    public String purchaseAlbum()
    {
        
    }
    
    public String purchaseSong()
    {
        
    }
    @Override
    public String toString() {
        return String.format("(%d, %d)");
    }
}
