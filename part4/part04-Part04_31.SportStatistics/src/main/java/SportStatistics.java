
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int loses = 0;

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                String[] splitString = fileScanner.nextLine().split(",");

                if (splitString.equals("")) {
                    continue;
                }

                String team1 = splitString[0];
                String team2 = splitString[1];

                int score1 = Integer.valueOf(splitString[2]);
                int score2 = Integer.valueOf(splitString[3]);

                if (team.equals(team1)) {
                    games++;
                    if (score1 > score2) {
                        wins++;
                    } else {
                        loses++;
                    }
                } else if (team.equals(team2)) {
                    games++;
                    if (score2 > score1) {
                        wins++;
                    } else {
                        loses++;
                    }
                }

            }

            System.out.println("Games: " + games);

            System.out.println("Wins: " + wins);

            System.out.println("Losses: " + loses);

        }
    }

}
