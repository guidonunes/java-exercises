package part3;


import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }

        int index = 0;
        while (index < numbers.size()) {
            int number = numbers.get(index);
            System.out.println(number);
            index++;
        }
        scanner.close();
    }
}
