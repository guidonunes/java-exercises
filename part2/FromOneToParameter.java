package part2;

public class FromOneToParameter {

  public static void main(String[] args) {
      printUntilNumber(2);

  }

  public static void printUntilNumber(int number) {
      int i = 0;
      int count = 1;

      while (i < number){
          System.out.println(count);
          i += 1;
          count ++;
      }
  }
}
