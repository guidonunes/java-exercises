package part3;


public class ArrayPrinter {

  public static void main(String[] args) {
      // You can test your method here
      int[] array = {5, 1, 3, 4, 2};
      printNeatly(array);
  }

  public static void printNeatly(int[] array) {
      int index = 0;
      while (index < array.length) {
          if (index == array.length-1) {
              System.out.println(array[index]);
          } else {
              System.out.print(array[index] + ", ");
          }
          index++;
      }
  }
}
