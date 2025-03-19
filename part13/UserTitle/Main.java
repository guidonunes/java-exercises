package title;

import javafx.application.Application;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a title:");
        String input = scanner.nextLine();
        scanner.close();

        Application.launch(UserTitle.class, input);

    }

}
