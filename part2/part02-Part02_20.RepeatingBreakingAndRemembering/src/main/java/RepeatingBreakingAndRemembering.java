
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx!Bye!");
                break;
            } else {
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                count++;
                sum = sum + number;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        double average = 1.0 * sum / count;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
