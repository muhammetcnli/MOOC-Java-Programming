
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammet Canlı
 */
public class ShoppingCart {

    private Map<String, Item> map;

    public ShoppingCart() {
        this.map = new HashMap<>();
    }

    public void add(String product, int price) {
        if (map.keySet().contains(product)) {

            increaseQuantity(product);
        } else {

            map.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Item e : map.values()) {
            totalPrice += e.price();
        }

        return totalPrice;

    }

    public void increaseQuantity(String product) {

        this.map.get(product).increaseQuantity();

    }
    
    public void print(){
        for(String e: map.keySet()){
            System.out.println(map.get(e).toString());
        }
    }
}
