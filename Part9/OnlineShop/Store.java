package Part9.OnlineShop;

import java.util.Scanner;

public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for(String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            // Add code here that adds the product to the cart,
            if (!(this.warehouse.stock(product) == 0)){
                int unitPrice = this.warehouse.price(product);
                cart.add(product, unitPrice);
                this.warehouse.take(product);

            } else {
                System.out.println("Product not available");
            }


            // If there is any in the warehouse, and reduces the stock in the warehouse
            // Don't touch any of the other code!
        }

        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());

    }
}
