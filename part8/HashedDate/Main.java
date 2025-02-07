package HashedDate;

public class Main {

  public static void main(String[] args) {
      // make test programs here
      SimpleDate date1 = new SimpleDate(1, 1, 1900);
      SimpleDate date2 = new SimpleDate(1, 1, 2100);
      SimpleDate date3 = new SimpleDate(31, 12, 2000);
      SimpleDate date4 = new SimpleDate(1, 1, 2000);

      System.out.println(date1.hashCode()); // Hash for 1.1.1900
      System.out.println(date2.hashCode()); // Hash for 1.1.2100
      System.out.println(date3.hashCode()); // Hash for 31.12.2000
      System.out.println(date4.hashCode()); // Hash for 1.1.2000
  }
}
