package part4.Debt;

public class Main {

  public static void main(String[] args) {
      // Test your Debt class here
      Debt mortgage = new Debt(40000, 1.10);
      mortgage.printBalance();

      mortgage.waitOneYear();
      mortgage.printBalance();

      int years = 0;

      while (years < 3) {
          mortgage.waitOneYear();
          years = years + 1;
      }

      mortgage.printBalance();
  }
}
