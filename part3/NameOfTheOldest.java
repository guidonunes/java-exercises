package part3;


import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eldest = 0;
        String name = "";

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] parts = input.split(",");

            int age = Integer.valueOf(parts[1]);

            if (age > eldest) {
                eldest = age;
                name = parts[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
        scanner.close();
    }
}
