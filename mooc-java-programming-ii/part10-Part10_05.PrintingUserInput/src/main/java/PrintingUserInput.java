
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                
                list.stream()
                        .forEach(word -> System.out.println(word));
                
                break;
            }
            
            list.add(input);
        }
        
    }
}
