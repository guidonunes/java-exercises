package part7.GradeStatistics;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into
        // multiple classes.

        GradeRegister register = new GradeRegister();
        UserInterface user = new UserInterface(register, scanner);

        user.start();
    }
}
