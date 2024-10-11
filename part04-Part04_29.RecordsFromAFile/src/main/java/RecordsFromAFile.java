
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String[] splitString = fileScanner.nextLine().split(",");

                if (splitString.equals("")) {
                    continue;
                }

                String name = splitString[0];

                int age = Integer.valueOf(splitString[1]);

                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else{
                    System.out.println(name + ", age: " + age + " year");
                }

            }
        }
    }
}
