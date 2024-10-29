
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstCont = 0;
        int secondCont = 0;

        boolean loop = true;

        try {
            while (loop) {

                System.out.println("First: " + firstCont + "/100");
                System.out.println("Second: " + secondCont + "/100");

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
                        if (valueInput <= 0) {
                            return;
                        }

                        if (firstCont + valueInput <= 100) {
                            firstCont += valueInput;
                        } else if (firstCont + valueInput > 100) {
                            firstCont = 100;
                        }
                        break;

                    case "move":
                        if (valueInput <= 0 || firstCont == 0) {
                            return;
                        }

                        if (firstCont - valueInput < 0) {
                            valueInput = firstCont;
                        }

                        if (valueInput >= 100) {
                            firstCont = 0;
                            secondCont = 100;
                            
                        } else if(secondCont + valueInput <= 100){
                            secondCont += valueInput;
                            firstCont -= valueInput;
                        } else if(valueInput + secondCont > 100 && valueInput + firstCont > 100){
                            
                            secondCont = 100;
                            firstCont = 0;
                        }
                        break;
                    case "remove":
                        
                        
                        if(secondCont - valueInput < 0 || valueInput > 100){
                            secondCont = 0;
                        } else{
                            secondCont -= valueInput;
                        }
                        break;
                        
                        
                        
                    default:
                        System.out.println("Unknown command");

                }
            }

        } catch(IndexOutOfBoundsException Error){
            System.out.println("There was an Error reading input: " + Error.getMessage());
        }
    }

}
