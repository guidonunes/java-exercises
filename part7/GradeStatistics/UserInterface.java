package part7.GradeStatistics;

import java.util.Scanner;

public class UserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        averageOfPoints();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops: ");
        while(true) {

            String input = scanner.nextLine();


            int points = Integer.valueOf(input);

            if (points == -1){
                break;
            }

            if (points < 0 || points > 100) {
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void averageOfPoints() {

        System.out.println("Point average (all): " + register.averageOfPoints());
    }
}
