
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
        User user5 = new User(“01”, “Joe Shmoe”, “23 University Street”);
        User user5 = new User(“02”, “Rick James”, “135 Alley Road”);
        User user5 = new User(“03”, “John Doe”, “1234 Main Street”);
        User user5 = new User(“04”, “Jane Doe”, “4334 State Street”);
                         User(“05”, “Emma Kang”, “430 W Wood Street”);
                         Business(“4321”);
                         Business(“5678”);
                         Business(“6969”);
                         Business(“1010”);
                         Hit(“7rings”,”Ariana Grande”, “2019”, “pop”,”3:04”, “1”);
                         Hit(“Liquid Swords”, “GZA”, “1992”, 4:32, “1”);
                         Hit(“Gangnam Style”, “2012”,”k-pop”,”4:15”, “5”);
                         Single(“Thank u, Next”, “Ariana Grande”, “2019”, “pop”, “3:27”);
                         Album(“1234567890”);
                         Album(“0123456789”);
                         Album(“9012345678”);
                         Album(“8901234567”);
                         Album(“7890123456”);

        
        
        em.close();
        emf.close();
    }
    
}
