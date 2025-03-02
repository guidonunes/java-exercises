package Part10.Literature;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;



public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> booksList = new ArrayList<>();

        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            booksList.add(new Book(input, age));


        }

        System.out.println("");
        System.out.println(booksList.size() + " books in total.");
        System.out.println("Books: ");

        Collections.sort(booksList);
        booksList.stream().forEach(b -> System.out.println(b));

    }

}
