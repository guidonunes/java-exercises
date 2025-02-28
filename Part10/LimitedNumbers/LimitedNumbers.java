package Part10.LimitedNumbers;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        System.out.println("Type a number: ");

        while(true) {
            Integer input = Integer.valueOf(scanner.nextLine());

                if(input < 0) {
                    break;
                }

                inputs.add(input);
            }

        inputs.stream()
                .filter(value -> value > 1 && value <= 5)
                .forEach(value -> System.out.println(value));
    }
}
