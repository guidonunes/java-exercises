package Part9.OnlineShop;


public class Item {
  private final String product;
  private int qty;
  private final int unitPrice;


  public Item(String product, int qty, int unitPrice) {
      this.product = product;
      this.qty = qty;
      this.unitPrice = unitPrice;
  }

  public int price() {
      int total = this.qty * this.unitPrice;
      return total;
  }

  public void increaseQuantity() {
      this.qty += 1;
  }


  @Override
  public String toString() {
      return this.product + ": " + this.qty;
  }
}
