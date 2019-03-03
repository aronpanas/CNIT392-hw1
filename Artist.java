package hw1;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Aron
 */
@Entity
public class Artist implements Serializable
{
    @Id @GeneratedValue
       
    private String artistName;
    private String birthdate;
    private String URL;
    
    public Artist(String artistName, String birthdate, String URL) {
        this.artistName = artistName;
        this.birthdate = birthdate;
        this.URL = URL;
    }
    
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.artistName, this.birthdate, this.URL);
    }
    
}
