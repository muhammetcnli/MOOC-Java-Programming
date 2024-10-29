
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class UserInterface {
    
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan){
        this.scan = scan;
        this.list = list;
    }
    
    public void start(){
        boolean shouldLoop = true;
        while(shouldLoop){
            
            System.out.println("Command: ");
            String command = scan.nextLine();
            switch(command){
                case "stop":
                    shouldLoop = false;
                    break;
                case "add":
                    System.out.println("To add:");
                    String add = scan.nextLine();
                    list.add(add);
                    
                    break;
                    
                case "list":
                    list.print();
                    
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int index = Integer.valueOf(scan.nextLine());
                    list.remove(index );
                    
                    break;
                   
            }
                            
                    
            
        }
    }
    
}
