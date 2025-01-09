package part4.YourFirstAccount;
public class YourFirstAccount {

  public static void main(String[] args) {
      Account nineAccount = new Account("Janine's account", 100.00);

      System.out.println(nineAccount);

      nineAccount.deposit(20);

      System.out.println(nineAccount);

  }
}
