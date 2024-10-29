
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammet Canlı
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();

                System.out.println("Translation:");
                String translation = this.scanner.nextLine();

                dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String search = this.scanner.nextLine();
                if ((this.dict.translate(search) == null)) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Translation: " + this.dict.translate(search));
                }
            } else {
                System.out.println("Unknown command");
            }
        }

    }

}
