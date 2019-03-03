
import java.io.Serializable;
import javax.persistence.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 강민경
 */
public class Song implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String title;
    private String length;
    private String genre;
    private int year;

    public Song(String title, String length, String genre, int year) {
        this.title = title;
        this.length = length;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
