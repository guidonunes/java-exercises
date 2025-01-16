import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();


        try(Scanner read = new Scanner(Paths.get(file))) {
            while(read.hasNextLine()) {
                String line = read.nextLine();
                list.add(line);
            }

        } catch (Exception e) {

            System.out.println("Reading the file " + file + " failed.");
            return;
        }
        scanner.close();

         while(true) {
            if(searchedFor.isEmpty()) {
                return;
            }

            if (!(list.contains(searchedFor))) {
                System.out.println("Not found.");
                return;
            } else {
                System.out.println("Found!");
                return;
            }
        }
    }
}
