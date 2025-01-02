package part2;

public class Smallest {

  public static int smallest(int number1, int number2) {
      int smallest = 0;
      if (number1 < number2){
          smallest = number1;
      } else {
          smallest = number2;
      }
      return smallest;
  }

  public static void main(String[] args) {
      int result = smallest(2, 7);
      System.out.println("Smallest: " + result);
  }
}
