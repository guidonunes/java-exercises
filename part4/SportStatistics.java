
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String input = scan.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;

        try(Scanner read = new Scanner(Paths.get(file))) {
            while(read.hasNextLine()) {

                String line = read.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];

                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                if (input.equals(homeTeam) || input.equals(visitingTeam)) {
                    count++;
                }

                if(input.equals(homeTeam) && homePoints < visitingPoints) {
                    losses ++;
                } else if (input.equals(homeTeam) && homePoints > visitingPoints) {
                    wins ++;
                } else if (input.equals(visitingTeam) && homePoints < visitingPoints) {
                    wins++;
                } else if (input.equals(visitingTeam) && homePoints > visitingPoints) {
                    losses++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        scan.close();
    }

}
