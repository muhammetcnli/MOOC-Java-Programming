
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> map;

    public StorageFacility() {
        this.map = new HashMap<>();
    }

    public void add(String unit, String item) {

        this.map.putIfAbsent(unit, new ArrayList<>());

        this.map.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {

        ArrayList<String> emptyList = new ArrayList<>();

        return this.map.getOrDefault(storageUnit, emptyList);
    }

    public void remove(String storageUnit, String item) {

        this.map.get(storageUnit).remove(item);

        if (this.map.get(storageUnit).isEmpty()) {
            this.map.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {

        ArrayList<String> names = new ArrayList<>();

        for (String e : map.keySet()) {
            if (!(map.get(e).isEmpty())) {
                names.add(e);
            }
        }

        return names;
    }

}
