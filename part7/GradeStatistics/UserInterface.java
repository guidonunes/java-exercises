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

    public void printGradeDistribution() {
      int grade = 5;
      while (grade >= 0) {
          int stars = register.numberOfGrades(grade);
          System.out.print(grade + ": ");
          printsStars(stars);
          System.out.println("");

          grade = grade - 1;
      }

    }

    public static void printsStars(int stars) {
      while (stars > 0) {
          System.out.print("*");
          stars--;
      }
    }

    public void averageOfPoints() {
        System.out.println("Point average (all): " + register.averageOfPoints());
    }

    public void passingGrade() {
      System.out.println("Point average (passing): " + register.passingGrade());
  }

    public void passPercentage() {
      System.out.println("Pass percentage: " + register.passPercentage());
  }
}
