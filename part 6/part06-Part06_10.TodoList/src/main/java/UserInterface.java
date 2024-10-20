
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
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scan = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command: ");
            String command = this.scan.nextLine();
            
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                System.out.println("To add:");
                String add = this.scan.nextLine();
                
                list.add(add);
            } else if(command.equals("list")){
                
                list.print();
            } else if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(this.scan.nextLine());
                
                list.remove(remove );
            }
            
        }
        
    }
    
}
