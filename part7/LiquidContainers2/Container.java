package part7.LiquidContainers2;


public class Container {
  private int volume;

  public Container() {
      this.volume = 0;
  }


  public int contains() {
      return this.volume;
  }

  public void add(int amount) {
      if(amount >= 0 && this.volume + amount <= 100) {
          this.volume += amount;
      } else {
          this.volume = 100;
      }
  }

  public void remove(int amount) {
      if(amount >= 0) {
          if(amount > this.volume) {
              amount = this.volume;
          }
          this.volume -= amount;
      }
  }

  @Override
  public String toString() {
      return this.volume + "/100";
  }
}
