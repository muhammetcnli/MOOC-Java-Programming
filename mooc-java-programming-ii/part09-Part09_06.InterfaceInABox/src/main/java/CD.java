/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class CD implements Packable{
    
    private String artist;
    private String name;
    private int year;
    private double weight;
    
    public CD(String artist, String name, int year){
        this.weight = 0.1;
        this.artist = artist;
        this.year= year;
        this.name = name;
    }
    
    @Override
    public double weight() {
        
        return weight;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ')';
    }
    
    
    
}
