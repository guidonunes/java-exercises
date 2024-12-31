
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;


        while (true) {

            int num = Integer.valueOf(scanner.nextLine());

            if (num % 2 == 0) {
                even++;
            }

            if (num % 2 != 0 && num != -1) {
                odd++;
            }

            if (num != -1) {
                sum += num;
                count++;
                continue;
            } else {
                System.out.println("Thx!Bye!");
                break;
            }
        }

        double avg = (double) sum/count;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
