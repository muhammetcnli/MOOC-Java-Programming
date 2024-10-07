
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("end")) {
                break;
            }
            
            strings.add(string);

        }
        
        System.out.println(strings.size());
        
    }
}
