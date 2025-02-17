package Warehouse;


public class ProductWarehouseWithHistory extends ProductWarehouse {
  private ChangeHistory changeHistory;

  public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
      super(productName, capacity);
      this.changeHistory = new ChangeHistory();
      setInitialBalance(initialBalance);
  }

  public void setInitialBalance(double balance) {
      super.addToWarehouse(balance);
      this.changeHistory.add(balance);
  }

  public String history() {
      return this.changeHistory.toString();
  }

  public void addToWarehouse(double amount) {
      super.addToWarehouse(amount);
      this.changeHistory.add(getBalance());
  }

  public double takeFromWarehouse(double amount) {
      double taken = super.takeFromWarehouse(amount);
      this.changeHistory.add(getBalance());
      return taken;
  }

  public void printAnalysis() {
    System.out.println("Product: " + getName() + "\n" +
                       "History: " + history() + "\n" +
                       "Largest amount of product: " + changeHistory.maxValue() + "\n" +
                       "Smallest amount of product: " + changeHistory.minValue() + "\n" +
                       "Average: " + changeHistory.average());
  }
}
