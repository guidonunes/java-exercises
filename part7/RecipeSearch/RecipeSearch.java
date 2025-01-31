package part7.RecipeSearch;


i
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        System.out.println("");

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        System.out.println("");

        System.out.print("Enter command: ");
        String command = scanner.nextLine();

        if (command.equals("stop")) {
            System.out.println("Bye!");
            return;
        }

        if (command.equals("list")) {
            try(Scanner read = new Scanner(Paths.get(file))) {
                while(read.hasNextLine()) {
                    String name = read.nextLine().trim();

                    if(name.isEmpty()) {
                        continue;
                    }

                    if(read.hasNextLine()) {
                        String time = read.nextLine().trim();
                        System.out.println(name + ", cooking time: " + time);

                        while(read.hasNextLine()) {
                            String nextLine = read.nextLine().trim();
                            if(nextLine.isEmpty()) {
                                break;
                            }
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }




    }
}
