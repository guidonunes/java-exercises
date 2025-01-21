package part5.ItemsList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if(identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if(name.isEmpty()) {
                break;
            }

            Product product = new Product(identifier, name);
            if(products.contains(product)) {
                System.out.println("Already in the list");
                continue;
            }

            products.add(product);
        }

        for(Product product : products) {
            System.out.println(product);
        }
    }
}
