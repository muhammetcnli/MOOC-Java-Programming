
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> box;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }

    public int currentAmount() {
        int sum = 0;

        for (Item e : box) {

            sum += e.getWeight();
        }

        return sum;

    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.capacity) {
            this.box.add(item);
        }

    }
    
    public boolean isInBox(Item item){
        
        return box.contains(item);
    }

}
