
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
public class Stack {
    
    private ArrayList<String> list ;
    
    public Stack(){
        this.list = new ArrayList<>();
        
    }
    
    public boolean isEmpty(){
        if(this.list.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.list.add(value);
        
    }
    public ArrayList<String> values(){
        return this.list;
    }
    
    public String take(){
        
        String removed = this.list.get(list.size() -1);
        this.list.remove(removed);
        return removed;
    }
    
}
