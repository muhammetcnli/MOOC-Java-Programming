
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldest = "";
        int max = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length == 1) {
                oldest = parts[0];
            } else {
                if (Integer.valueOf(parts[1]) > max) {
                    max = Integer.valueOf(parts[1]);
                    oldest = parts[0];
                } else{
                    continue;
                }
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
