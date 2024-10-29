
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> map;
    
    public DictionaryOfManyTranslations(){
        
        this.map = new HashMap<>();
    }
    
    public void add(String word, String translation){
        
        this.map.putIfAbsent(word, new ArrayList<String>());
        
        this.map.get(word).add(translation);
        
        
    }
    
    public ArrayList<String> translate(String word){
        
        ArrayList<String> emptyList = new ArrayList<>();
        
        return this.map.getOrDefault(word, emptyList);
    }
    
    public void remove(String word){
        
        this.map.remove(word);
    }
    
}
