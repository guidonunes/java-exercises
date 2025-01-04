package part3;


import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }



        System.out.println(list.get(2));
        scanner.close();
    }
}
