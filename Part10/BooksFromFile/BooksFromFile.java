package Part10.BooksFromFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Book> books = readBooks("books.txt");
        books.forEach(System.out::println);


    }
    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(parts -> new Book (
                            parts[0].trim(),
                            Integer.parseInt(parts[1].trim()),
                            Integer.parseInt(parts[2].trim()),
                            parts[3].trim()
                    ))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return List.of();
        }
    }
}
