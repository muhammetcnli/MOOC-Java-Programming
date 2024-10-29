
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());
        int index = 0;
        while (list.contains(search)) {
            System.out.println(search + " is at index " + (list.indexOf(search) + index));
            list.remove(list.indexOf(search));
            index++;
        }

        // implement here finding the indices of a number
    }
}
