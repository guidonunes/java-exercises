package Part10.RegularExpressions;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);
        Checker word = new Checker();


        while(true) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }

            if(word.isDayOfWeek(input)) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }

            if(word.allVowels(input)) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }

            if(word.timeOfDay(input)) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }
        }

        scanner.close();
    }


}
