
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here

        Timer t = new Timer();
        int i = 0;
        while (i < 365350) {
            t.advance();
        }
        System.out.println(t);
    }
}

