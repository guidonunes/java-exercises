import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String file = scanner.nextLine();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try(Scanner read = new Scanner(Paths.get(file))) {
            while(read.hasNextLine()) {
                String row = read.nextLine();
                list.add(Integer.valueOf(row));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int count = 0;
        for(int value : list) {
            if(lowerBound <= value && value <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);
        scanner.close();
    }
}
