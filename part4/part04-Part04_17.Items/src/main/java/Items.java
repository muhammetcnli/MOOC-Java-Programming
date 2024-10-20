
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            
            items.add(new Item(input));
            
            if(input.isEmpty()){
                for(Item e: items){
                    System.out.println(e);
                }
                break;
            }
            
        } 
        

    }
}
