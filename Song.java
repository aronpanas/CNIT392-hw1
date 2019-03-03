package hw1;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Aron
 */
@Entity
public class Song implements Serializable
{
    @Id @GeneratedValue
       
    private String artistName;
    private String title;
    private String year;
    private String genre;
    private String length;
    
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

   
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.artistName, this.title, this.genre, this.year, this.length);
    }
    
}
