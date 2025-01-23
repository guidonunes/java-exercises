package part6.Package;


public class Main {

  public static void main(String[] args) {
      Gift gift = new Gift("Lego", 1);
      Gift gift2 = new Gift("Playstation 5", 2);

      Package gifts = new Package();

      System.out.println("Gift: " + gift);
      System.out.println("Gift's name: " + gift.getName());
      System.out.println("Gift's weight: " + gift.getWeight());

      System.out.println("");

      System.out.println("Gift: " + gift2);
      System.out.println("Gift's name: " + gift2.getName());
      System.out.println("Gift's weight: " + gift2.getWeight());

      System.out.println("");

      gifts.addGift(gift2);
      gifts.addGift(gift);

      System.out.println("The total weight is: " + gifts.totalWeight());


  }
}
