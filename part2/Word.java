package part2;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quote = word();
        System.out.println(quote);
        scanner.close();
    }

    public static String word() {
        return "May the Force be with you.";
    }

}
