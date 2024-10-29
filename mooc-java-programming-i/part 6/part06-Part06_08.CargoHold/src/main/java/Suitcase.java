
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
public class Suitcase {

    private ArrayList<Item> list;
    private int maxWeight;
    private int sum = 0;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;

        this.list = new ArrayList<>();

        for (Item iter : list) {
            this.sum = sum + iter.getWeight();
        }
    }

    public void addItem(Item item) {

        if ((sum + item.getWeight() <= maxWeight)) {
            this.sum = this.sum + item.getWeight();
            list.add(item);
        }

    }

    public String toString() {
        if (list.size() == 1) {
            return list.size() + " item (" + this.sum + " kg)";
        } else if (list.size() == 0) {
            return "no items (0 kg)";
        } else {
            return list.size() + " items (" + this.sum + " kg)";
        }
    }

    public void printItems() {
        for (Item item : list) {
            System.out.println(item.toString());
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : list) {
            total = total + item.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if(list.isEmpty()){
            return null;
        }
        Item heaviest = list.get(0);
        int iter = 0;
        for (Item item : list) {

            if (item.getWeight() > heaviest.getWeight()) {
                if (heaviest.getName() == item.getName()) {
                    continue;
                }

                heaviest = item;
            }

        }
        
        return heaviest;
    }
    
    
}
