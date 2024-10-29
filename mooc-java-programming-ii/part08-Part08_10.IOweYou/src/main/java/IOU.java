
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
public class IOU {

    private HashMap<String, Double> owed;

    public IOU() {
        this.owed = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        if (toWhom != null) {
            owed.put(toWhom, amount);
        }

    }

    public double howMuchDoIOweTo(String toWhom) {
        return owed.getOrDefault(toWhom, 0.0);
    }

}
