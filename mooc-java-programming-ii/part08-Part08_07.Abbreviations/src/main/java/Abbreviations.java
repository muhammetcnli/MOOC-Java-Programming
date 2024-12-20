
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
public class Abbreviations {

    private HashMap<String, String> map;

    public Abbreviations() {

        this.map = new HashMap<>();

    }

    public void addAbbreviation(String abbreviation, String explanation) {

            
        map.put(abbreviation, explanation);
        
    }

    
    public boolean hasAbbreviation(String abbreviation){
        
        if(map.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        return this.map.get(cleanString(abbreviation));
    }
    
    public String cleanString(String strToClean) {

        if (strToClean == null) {
            return "";
        }

        return strToClean.toLowerCase().trim();

    }
}
