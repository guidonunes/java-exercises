package part6.JokeManager;

import java.util.Scanner;;

public class UserInterface {
  private JokeManager manager;
  private Scanner scanner;


  public UserInterface(JokeManager manager, Scanner scanner) {
      this.manager = manager;
      this.scanner = scanner;
  }

  public void start() {
      while(true) {
          System.out.println("Commands: ");
          System.out.println("1 - add a joke");
          System.out.println("2 - draw a joke");
          System.out.println("3 - list jokes");
          System.out.println("X - stop");

          String command = scanner.nextLine();

          if(command.equals("X")) {
              break;
          }

          if (command.equals("1")) {
              System.out.println("Write the joke to be added:");
              String joke = scanner.nextLine();
              this.manager.addJoke(joke);
          } else if (command.equals("2")) {
              System.out.println("Drawing a joke.");
              String joke = this.manager.drawJoke();
              System.out.println(joke);
          } else if(command.equals("3")) {
              System.out.println("Printing the jokes.");
              this.manager.printJokes();
          } else {
              System.out.println("Unknown command");
              continue;
          }
      }
  }
}
