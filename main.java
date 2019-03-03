
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
/**
 *
 * @author 강민경
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/p2.odb");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().commit();
        
        Song song1 = new Song("7rings","3:04","pop",2019);
        Song song2 = new Song("Thank u, Next","3:27","pop",2019);
        Song song3 = new Song("Liquid Swords","4:32","GZA",1992);
        Song song4 = new Song("Living in the World Today","4:23","GZA",1992);
        Song song5 = new Song("Gangnam Style","4:15","k-pop",2012);
        
        em.close();
        emf.close();
    }
    
}
