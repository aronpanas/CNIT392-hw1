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
public class Hit extends Song{
   @Id @GeneratedValue String tracknumber;

    public Hit(String tracknumber, String title, String length, String genre, int year) {
        super(title, length, genre, year);
        this.tracknumber = tracknumber;
    }

    public String getTracknumber() {
        return tracknumber;
    }

    public void setTracknumber(String tracknumber) {
        this.tracknumber = tracknumber;
    }
   
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.tracknumber, this.title, this.length, this.genre, this.year);
    
}
