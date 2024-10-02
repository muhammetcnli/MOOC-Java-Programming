
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
              
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }  
        
        
    }   

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        if (size > 0) {
            for (int i = 1; i <= size; i++) {
                printSpaces(size - i);
                printStars(i);
                System.out.println("");

            }
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // width will be 2*height - 1
        int spaces = height - 1;
        for(int stars = 1; stars<= 2*height -1; stars = stars + 2){
            printSpaces(spaces);
            printStars(stars);
            
            spaces = spaces -1;
            System.out.println("");
        }
        printSpaces(height-2);
        System.out.println("***");
        printSpaces(height-2);
        System.out.println("***");

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
