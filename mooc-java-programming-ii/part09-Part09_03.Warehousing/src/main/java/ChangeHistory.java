
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
public class ChangeHistory {
    
    private ArrayList<Double> historyList;
    
    public ChangeHistory(){
        this.historyList = new ArrayList<>();
    }
    
    public void add(double status){
        
        historyList.add(status);
    }
    
    public void clear(){
        historyList.clear();
    }
    
    public String toString(){
        
        return historyList.toString();
    }
    
    
    public double maxValue(){
        
        if(this.historyList.isEmpty()){
            return 0.0;
        }
        double biggest = 0.0;
        for(Double change: historyList){
            if(change > biggest){
                biggest = change;
            }
        }
        return biggest;
    }
    
    public double minValue(){
        if(this.historyList.isEmpty()){
            return 0.0;
        }
        
        double smallest = historyList.get(0);
        for(Double change: historyList){
            if(change < smallest){
                smallest = change;
            }
        }
        return smallest;
        
    }
    
    public double average(){
        if(this.historyList.isEmpty()){
            return 0.0;
        }
        
        double sum = 0.0;
        int count = 0;
        
        for(double e: historyList){
            sum += e;
            count++;
        }
        
        return 1.0* sum / count;
    }
    
    
}
