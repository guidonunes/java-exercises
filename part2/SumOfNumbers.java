package part2;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0 || number > 0) {
                count = count + number;
            }

            if (number == 0) {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + count);
        scanner.close();
    }
}
