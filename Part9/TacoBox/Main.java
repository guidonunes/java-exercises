package Part9.TacoBox;

public class Main {

  public static void main(String[] args) {
      // Test your code here!
      CustomTacoBox myBox = new CustomTacoBox(4);
      System.out.println(myBox);
      myBox.eat();
      System.out.println(myBox);
      myBox.eat();
      myBox.eat();
      myBox.eat();
      myBox.eat();
      System.out.println(myBox);

  }
}
