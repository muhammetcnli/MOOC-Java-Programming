
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(1.0 * sum / count);
                }
                break;
            }
            if (input > 0) {
                count++;
                sum = sum + input;
            }

        }

    }
}
