package part5.PaymentCard;


public class PaymentTerminal {


  private double money;  // amount of cash
  private int affordableMeals; // number of sold affordable meals
  private int heartyMeals;  // number of sold hearty meals


  public PaymentTerminal() {
      // register initially has 1000 euros of money
      this.money = 1000.0;
      this.affordableMeals = 0;
      this.heartyMeals = 0;
  }

  public double eatAffordably(double payment) {

      if (payment < 2.50) {
          return payment;
     } else {
          this.money += 2.50;
          this.affordableMeals++;
          return payment -= 2.50;
      }

  }

  public double eatHeartily(double payment) {
      if (payment < 4.30) {
          return payment;
     } else {
          this.money += 4.30;
          this.heartyMeals++;
          return payment -= 4.30;
      }
  }

  public boolean eatAffordably(PaymentCard card) {
      double moneyLeft = card.balance();

      if(moneyLeft >= 2.50) {
          this.affordableMeals++;
          card.takeMoney(2.50);

          return true;
      } else {
          return false;
      }
  }

  public boolean eatHeartily(PaymentCard card) {
      double moneyLeft = card.balance();

      if(moneyLeft >= 4.30) {
          this.heartyMeals++;
          card.takeMoney(4.30);

          return true;
      } else {
          return false;
      }
  }

  public void addMoneyToCard(PaymentCard card, double sum) {
      if(sum > 0) {
          card.addMoney(sum);
          this.money += sum;
      }

  }

  @Override
  public String toString() {
      return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
  }
}
