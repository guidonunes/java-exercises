package part4.Product;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilherme
 */
public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String initialName, double initialPrice, int initialQuantity) {
      this.name = initialName;
      this.price = initialPrice;
      this.quantity = initialQuantity;
  }

  public void printProduct() {
      System.out.println(this.name + ", " + this.price + ", " + this.quantity + " pcs");
  }
}
