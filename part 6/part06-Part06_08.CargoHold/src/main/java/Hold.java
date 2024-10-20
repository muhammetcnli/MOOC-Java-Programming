
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
public class Hold {

    private int maximumWeight;

    private ArrayList<Suitcase> holdCases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;

        holdCases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if (weightOfSuitcases() + suitcase.totalWeight() <= maximumWeight) {
            holdCases.add(suitcase);
        }
    }

    public int weightOfSuitcases() {
        int weight = 0;

        for (Suitcase e : holdCases) {
            weight += e.totalWeight();
        }
        return weight;
    }

    public String toString() {
        int suitcaseCount = 0;
        int sumWeight = 0;
        for (Suitcase cas : holdCases) {
            suitcaseCount++;
            sumWeight = sumWeight + cas.totalWeight();
        }

        return suitcaseCount + " suitcases (" + sumWeight + " kg)";
    }

    public void printItems() {

        for (Suitcase cas : holdCases) {
            cas.printItems();
        }
    }
}
