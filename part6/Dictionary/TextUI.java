package part6.Dictionary;


import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String word = scanner.nextLine();

            if(word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if(word.equals("add")) {

                System.out.println("Word:");
                String input = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(input, translation);

            } else if(word.equals("search")) {
                System.out.print("To be translated: ");
                String input = scanner.nextLine();

                String translation = this.dictionary.translate(input);

                if (translation == null) {
                    System.out.println("Word " + input + " was not found!");
                } else {
                    System.out.println("Translation: " + translation);
                }

            } else {
                System.out.println("Unknown command");
                continue;
            }
        }
    }
}
