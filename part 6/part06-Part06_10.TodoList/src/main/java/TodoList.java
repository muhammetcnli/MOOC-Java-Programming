
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
public class TodoList {

    private ArrayList<String> list;

    public TodoList() {

        this.list = new ArrayList<>();
    }

    public void add(String task) {

        list.add(task);
    }

    public void print() {

        for (String exer : list) {
            System.out.println(list.indexOf(exer) + 1 + ": " + exer);
        }

    }

    public void remove(int number) {

        list.remove(number - 1);
    }

}
