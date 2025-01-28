package part7.LiquidContainers2;

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts.length == 1) {
                if (parts[0].equals("quit")) {
                    break;
                }
            } else if (parts.length == 2) {
                try {
                    String command = parts[0];
                    int amount = Integer.parseInt(parts[1]);
                    switch (command) {
                        case "add":
                            firstContainer.add(amount);
                            break;
                        case "move":
                            if (amount >= 0) {
                                int transferableAmount = Math.min(amount, firstContainer.contains());
                                firstContainer.remove(transferableAmount);
                                secondContainer.add(transferableAmount);
                            }
                            break;
                        case "remove":
                            if (amount >= 0) {
                                secondContainer.remove(amount);
                            }
                            break;
                        default:
                            System.out.println("Unknown command!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid amount. Please enter a valid number.");
                }
            } else {
                System.out.println("Invalid input. Please use the format: command number.");
            }
        }

        scan.close();
    }
}
