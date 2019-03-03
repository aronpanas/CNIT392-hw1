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
public class Single extends Song{

    public Single(String title, String length, String genre, int year) {
        super(title, length, genre, year);
    }
    
     @Override
    public String toString() {
        return String.format("(%d, %d)", this.title, this.length, this.genre, this.year);
    
}
