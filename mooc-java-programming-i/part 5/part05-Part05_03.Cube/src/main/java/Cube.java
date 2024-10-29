/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Cube {

    int edgeLength;

    public Cube(int edgeLenth) {
        this.edgeLength = edgeLenth;
    }
    
    public int volume(){
        int volume = this.edgeLength * this.edgeLength *this.edgeLength;
        return volume;
    }
    
    public String toString(){
        return "he length of the edge is " + this.edgeLength + " and the volume " + volume();
    }

}
