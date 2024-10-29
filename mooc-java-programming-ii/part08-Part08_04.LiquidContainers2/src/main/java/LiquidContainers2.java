
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstCont = new Container();
        Container secondCont = new Container();

        boolean loop = true;

        
            while (loop) {

                System.out.println("First: " + firstCont);
                System.out.println("Second: " + secondCont);

                String input = scan.nextLine();
                if (input.toLowerCase().equals("quit")) {

                    loop = false;
                    break;
                }

                String[] stringInput = input.split(" ");

                String command = stringInput[0];
                int valueInput = Integer.valueOf(stringInput[1]);

                switch (command.toLowerCase()) {
                    case "add":
                        firstCont.add(valueInput);
                        break;
                    case "remove":
                        secondCont.remove(valueInput);
                        break;

                    case "move":

                        if (valueInput < 0 || firstCont.contains() == 0) {
                            return;
                        }

                        if (firstCont.contains() - valueInput < 0) {
                            valueInput = firstCont.contains();
                        }

                        firstCont.remove(valueInput);
                        secondCont.add(valueInput);

                        break;
                    default:
                        System.out.println("Unknown command");
                        
                }
            }

        }
    }


