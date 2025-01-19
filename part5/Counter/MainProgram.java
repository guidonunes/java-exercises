package part5.Counter;


public class MainProgram {

  public static void main(String[] args) {
      Counter counter = new Counter(0);
      counter.increase();
      counter.increase(100);
      counter.decrease(99);

      System.out.println(counter.value());
  }
}
