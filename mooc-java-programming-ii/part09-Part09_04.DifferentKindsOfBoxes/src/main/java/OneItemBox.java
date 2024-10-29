
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
public class OneItemBox extends Box {

    private ArrayList<Item> oneItemBox;

    public OneItemBox() {
        this.oneItemBox = new ArrayList<>();
    }

    public void add(Item item) {
        if (oneItemBox.size() == 0) {
            oneItemBox.add(item);
        }

    }

    public boolean isInBox(Item item) {

        return oneItemBox.contains(item);
    }

}
