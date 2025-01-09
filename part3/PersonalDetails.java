package part3;

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        int sum = 0;
        int count = 0;


        while(true) {
            String input = scanner.nextLine();

            if (input.equals("")){
                break;
            }

            String[] parts = input.split(",");
            String name = String.valueOf(parts[0]);


            if (name.length() > longest.length()) {
                longest = name;
            }

            int year = Integer.valueOf(parts[1]);
            sum += year;
            count++;
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0 * sum/count));

        scanner.close();

    }
}
