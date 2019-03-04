package hw1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
        
        
         em.getTransaction().begin();
        Artist artist1 = new Artist("Ariana Grande", "06/23/1993","docs.google.com");
        Artist artist2 = new Artist("PSY","12/31/1977","purdue.edu");
        Artist artist3 = new Artist("GZA", "2/9/1975", "36chambersdojo.com");
        Song song1 = new Song("7rings","3:04","pop",2019);
        Song song2 = new Song("Thank u, Next","3:27","pop",2019);
        Song song3 = new Song("Liquid Swords","4:32","GZA",1992);
        Song song4 = new Song("Living in the World Today","4:23","GZA",1992);
        Song song5 = new Song("Gangnam Style","4:15","k-pop",2012);
        User user1 = new User(01, "Joe Shmoe", "23 University Street");
        User user2 = new User(02, "Rick James", "135 Alley Road");
        User user3 = new User(03, "John Doe", "1234 Main Street");
        User user4 = new User(04, "Jane Doe", "4334 State Street");
        User user5 = new User(05, "Emma Kang", "430 W Wood Street");
        BusinessUser business1 = new BusinessUser(01, "Joe Shmoe", "23 University Street", "4321");
        BusinessUser business2 = new BusinessUser(03, "John Doe", "1234 Main Street", "5678");
        BusinessUser business3 = new BusinessUser(04, "Jane Doe", "4334 State Street", "6969");
        RegularUser regular1 = new RegularUser(02, "Rick James", "135 Alley Road");
        //String tracknumber, String title, String length, String genre, int year
        Hit hit1 = new Hit("1", "7rings", "3:04", "pop", 2019);
        Hit hit2 = new Hit("1", "Liquid Swords", "4:32", "rap", 1992);
        Hit hit3 = new Hit("5", "Gangnam Style","4:15","k-pop", 2012);
        Single single1 = new Single("Thank u, Next", "3:27", "pop",2019);
        Album album1 = new Album("1234567890");
        Album album2 = new Album("0123456789");
        Album album3 = new Album("9012345678");
        Album album4 = new Album("8901234567");
        Album album5 = new Album("7890123456");
        em.getTransaction().commit();

        Query q1 = em.createQuery("SELECT artistname, URL FROM ARTIST1 WHERE artistname = “Ariana Grande");
        Query q2 = em.createQuery("SELECT COUNT(name) FROM USER");
        Query q3 = em.createQuery("SELECT artist.artistname, COUNT(title) FROM SONG INNER JOIN artist ON song.artistname = artist.artistname WHERE artistname = “Ariana Grande HAVING artist.artistname");
        Query q4 = em.createQuery("UPDATE ARTIST SET artistname = “Ariana G” WHERE artistname = “Ariana Grande”");
        Query q5 = em.createQuery("UPDATE USER SET address = “13820 Guild Avenue” WHERE name = “Rick James");
        Query q6 = em.createQuery("UPDATE ARTIST SET URL = “newsite.gov” WHERE artistname = “PSY");
       
        System.out.println("Find website of Ariana Grande: " + artist1.getURL());
        System.out.println("The number of users on the site: " + );
        System.out.println("Count the number of songs of 'Ariana Grande': " + );
        System.out.println("Ariana Grande wants to change her name to Ariana G: " + );
        System.out.println("Rick James wants to update their address: " + );
        System.out.println("PSY wants to change his URL to a shortened one: " + );
        
        
        em.close();
        emf.close();
    }
    
}
