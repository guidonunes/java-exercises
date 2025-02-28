package Part10.Weighting;



public class Main {

  public static void main(String[] args) {
      // Use this main program for testing your classes!
              // Create items
      Item item1 = new Item("Book", 2);
      Item item2 = new Item("Laptop", 5);
      Item item3 = new Item("Water Bottle", 1);

      // Create a suitcase and add items
      Suitcase suitcase = new Suitcase(10);
      suitcase.addItem(item1);
      suitcase.addItem(item2);
      suitcase.addItem(item3);

      // Create a hold and add the suitcase
      Hold hold = new Hold(20);
      hold.addSuitcase(suitcase);

      // Print items in the hold
      hold.printItems();

      // Print total weight of the hold
      System.out.println("Total weight: " + hold.totalWeight() + " kg");
  }

}
