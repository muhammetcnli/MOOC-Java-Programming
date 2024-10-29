
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Box implements Packable{
    
    private ArrayList<Packable> box;
    private double max;
    
    public Box(double max){
        this.box = new ArrayList<>();
        this.max = max;
    }
    
    @Override
    public double weight(){
        
        double sum = 0;
        for(Packable e: box){
            sum += e.weight();
        }
        return (double) sum;
    }
    
    public void add(Packable pack){
        if(this.weight()+ pack.weight() <= max){
            
            box.add(pack);
        }
    }
    
    @Override
    public String toString(){
        
        return ("Box: " + box.size() + " items, total weight " + this.weight() + " kg");
    }
    
}
