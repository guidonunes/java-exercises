package part7.RecipeSearch;


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
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");

        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                System.out.println("Bye!");
                break;
            }

            try (Scanner read = new Scanner(Paths.get(file))) {
                if (command.equals("list")) {
                    while (read.hasNextLine()) {
                        String name = read.nextLine().trim();

                        if (name.isEmpty()) {
                            continue;
                        }

                        String time = read.nextLine().trim();
                        String recipe = name + ", cooking time: " + time;

                        System.out.println(recipe);


                        while (read.hasNextLine()) {
                            String nextLine = read.nextLine().trim();
                            if (nextLine.isEmpty()) {
                                break;
                            }
                        }
                    }
                } else if (command.equals("find name")) {
                    System.out.print("Searched word: ");
                    String word = scanner.nextLine().trim();

                    boolean found = false;

                    while (read.hasNextLine()) {
                        String name = read.nextLine().trim();

                        if (name.isEmpty()) {
                            continue;
                        }

                        String time = read.nextLine().trim();
                        String recipe = name + ", cooking time: " + time;


                        if (name.contains(word)) {
                            System.out.println(recipe);
                            found = true;
                        }


                        while (read.hasNextLine()) {
                            String nextLine = read.nextLine().trim();
                            if (nextLine.isEmpty()) {
                                break;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("Not found");
                    }
                } else if (command.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    Integer number = Integer.valueOf(scanner.nextLine());

                    boolean found = false;

                    while (read.hasNextLine()) {
                        String name = read.nextLine().trim();

                        if (name.isEmpty()) {
                            continue;
                        }

                        String time = read.nextLine().trim();
                        String recipe = name + ", cooking time: " + time;

                        if (number >= Integer.parseInt(time)) {
                            System.out.println(recipe);
                            found = true;
                        }

                        while (read.hasNextLine()) {
                            String nextLine = read.nextLine().trim();
                            if (nextLine.isEmpty()) {
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
