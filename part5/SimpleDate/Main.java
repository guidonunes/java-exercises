package part5.SimpleDate;


public class Main {

  public static void main(String[] args) {
      // you can write code here to try out your program
      Person first = new Person("Leevy", new SimpleDate(1,1,2017), 70, 10);
      Person second = new Person("Leevy", new SimpleDate(1,1,2017), 70, 10);

      if (first.equals(second)) {
          System.out.println("Is this quite correct?");
      }


  }
}
