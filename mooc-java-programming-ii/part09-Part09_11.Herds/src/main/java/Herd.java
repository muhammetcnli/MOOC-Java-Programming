
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Herd implements Movable{
    private List<Movable> herdList;
    
    public Herd(){
        this.herdList = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herdList.add(movable);
    }
    
    public String toString(){
        String newString = "";
        for(Movable e: herdList){
            
            newString += e.toString().trim() + "\n";
        }
        
        return newString;
    }
    
    public void move(int dx, int dy){
        for(Movable e: herdList){
            e.move(dx, dy);
        }
    }
}
