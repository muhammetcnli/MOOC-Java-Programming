
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            String[] pieces = word.split(" ");
            System.out.println(pieces[pieces.length-1]);
        }
        
    }
}
