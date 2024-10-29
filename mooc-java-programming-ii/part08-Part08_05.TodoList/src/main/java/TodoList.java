
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

    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        todoList.add(task);
    }

    public void print() {
        int iter = 1;
        for (String task : todoList) {
            System.out.println(iter + ": " + task);
            iter++;
        }
    }

    public void remove(int number) {

        todoList.remove(number - 1);

    }

}
