package hw1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
Artist artist1 = new Artist("Ariana Grande", "06/23/1993","docs.google.com");
Artist artist2 = new Artist("PSY","12/31/1977","purdue.edu");
Artist artist3 = new Artist("GZA", "2/9/1975", "36chambersdojo.com");
Song song1 = new Song("7rings","3:04","pop",2019);
Song song2 = new Song("Thank u, Next","3:27","pop",2019);
Song song3 = new Song("Liquid Swords","4:32","GZA",1992);
Song song4 = new Song("Living in the World Today","4:23","GZA",1992);
Song song5 = new Song("Gangnam Style","4:15","k-pop",2012);
User user1 = new User("01", "Joe Shmoe", "23 University Street");
User user2 = new User("02", "Rick James", "135 Alley Road");
User user3 = new User("03", "John Doe", "1234 Main Street");
User user4 = new User("04", "Jane Doe", "4334 State Street");
User user5 = new User("05", "Emma Kang", "430 W Wood Street");
Business business1 = new Business("4321");
Business business2 = new Business("5678");
Business business3 = new Business("6969");
Business business4 = new Business("1010");
Hit hit1 = new Hit("7rings","Ariana Grande", "2019", "pop","3:04", "1");
Hit hit2 = new Hit("Liquid Swords", "GZA", "1992", "4:32", "1");
Hit hit3 = new Hit("Gangnam Style", "2012","k-pop","4:15", "5");
Single single1 = new Single("Thank u, Next", "Ariana Grande", "2019", "pop", "3:27");
Album album1 = new Album("1234567890”);
Album album2 = new Album("0123456789");
Album album3 = new Album("9012345678”);
Album album4 = new Album("8901234567”);
Album album5 = new Album("7890123456");


        Query q1 = em.createQuery("SELECT artistname, URL FROM ARTIST1 WHERE artistname = “Ariana Grande");
        Query q2 = em.createQuery("SELECT COUNT(name) FROM USER");
        Query q3 = em.createQuery("SELECT artist.artistname, COUNT(title) FROM SONG INNER JOIN artist ON song.artistname = artist.artistname WHERE artistname = “Ariana Grande HAVING artist.artistname");

        em.close();
        emf.close();
    }
    
}
