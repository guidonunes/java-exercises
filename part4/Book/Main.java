package part4.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if(title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));

        }

        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();

        for (Book book : books) {
            if (input.equals("name")) {
                System.out.println(book.getTitle());
            } else if (input.equals("everything")) {
                System.out.println(book);
            } else {
                System.out.println("No match");
                break;
            }
        }
        scanner.close();
    }
}
