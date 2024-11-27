
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalance;
    
    public Warehouse(){
        this.prices = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        stockBalance.put(product, stock);
        
    }
    
    public int price(String product){
        return prices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return stockBalance.getOrDefault(product, 0);
        
    }
    
    public boolean take(String product){
        if (this.stock(product) > 0){
        this.stockBalance.put(product, stockBalance.get(product) - 1);
        return true;}
        
        return false;
    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<>();
        
        for(String key : this.prices.keySet()){
            set.add(key);
        }
        return set;
    }
    
    
}
