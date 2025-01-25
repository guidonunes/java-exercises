package part6.TodoList;

import java.util.Scanner;


public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();

            if(input.equals("stop")) {
                break;
            }

            if(input.equals("add")) {
                System.out.print("To add: ");
                String item = scanner.nextLine();
                this.list.add(item);
            } else if(input.equals("list")) {
                this.list.print();
            } else if(input.equals("remove")) {
                System.out.println("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                this.list.remove(index);
            } else {
                System.out.println("Unknown command");
                continue;
            }
        }
    }
}
