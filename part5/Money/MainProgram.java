package part5.Money;


public class MainProgram {

  public static void main(String[] args) {
      // test your class here
      Money a = new Money(10,0);
      Money b = new Money(7,40);
      Money c = new Money(5, 0);


      System.out.println("The A balance is: " + a);
      System.out.println("The B balance is: " + b);
      System.out.println("The C balance is: " + c);
      System.out.println("");

      Money d = a.minus(b);

      System.out.println(d);
  }
}
