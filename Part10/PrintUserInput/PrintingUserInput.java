package Part10.PrintUserInput;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Type something...");

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("")) {
                break;
            }

            inputs.add(input);
        }

        inputs.forEach(System.out::println);

    }
}
