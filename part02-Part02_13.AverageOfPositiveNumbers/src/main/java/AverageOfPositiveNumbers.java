
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        while (true) {
            System.out.println();
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                count++;
                sum = 1.0 * sum + number;
                continue;
            }
        }
        if (count == 0 && sum == 0) {
            System.out.println("Cannot calculate the average");

        } else {
            double average = sum / count;
            System.out.println(average);
        }
    }
}
