
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate e : map.keySet()) {
            if (e.equals(licensePlate)) {

                return false;
            }

        }
        map.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        
        return map.getOrDefault(licensePlate, null);
    }
    
    
    
    public boolean remove(LicensePlate licensePlate){
        
        if (!map.containsKey(licensePlate)) {

            return false;
        }
        
        map.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        
        for(LicensePlate e: map.keySet()){
            System.out.println(e);
            
        }
    }
    
    public void printOwners(){
        
        ArrayList<String> owners = new ArrayList<>();
        
        for(String e: map.values()){
            if(!owners.contains(e)){
                
                owners.add(e);
            }
        }
        
        for(String owner: owners){
            System.out.println(owner);
        }
    }

}
