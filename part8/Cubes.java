
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {

            String input = scanner.nextLine();


            if (input.equals("end")) {
                System.out.println("Bye!");
                break;
            }

            int number = Integer.valueOf(input);

            if (number > 0) {
                number = number * number * number;
                System.out.println(number);
                continue;
            } else {
                number = -1;
                System.out.println(number);
                continue;
            }

        }
        scanner.close();

    }
}
