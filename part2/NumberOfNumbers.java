package part2;

import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number:");

            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0 || number > 0) {

                count = count + 1;
                scanner.close();
            }
        }

        System.out.println("Number of numbers: " + count);

    }
}
