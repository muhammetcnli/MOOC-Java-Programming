
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            String[] pieces = word.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                if (!pieces[i].equals("")) {
                    System.out.println(pieces[i]);
                }
            }
        }
    }
}