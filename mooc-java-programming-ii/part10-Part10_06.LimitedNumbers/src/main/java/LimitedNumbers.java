
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {

                list.stream()
                        .filter(i -> i <= 5)
                        .forEach(num -> System.out.println(num + ""));

                break;

            }

            list.add(input);
        }
    }
}
