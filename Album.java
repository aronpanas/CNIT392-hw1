package hw1;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Aron
 */
@Entity
public class Album implements Serializable
{
    @Id @GeneratedValue
       
    private String albumNumber;
    
    public String getAlbumNumber() {
        return albumNumber;
    }

    public void setalbumNumber(String artistName) {
        this.albumNumber = artistName;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.albumNumber);
    }
    
}
