package Part9.TacoBox;

public class CustomTacoBox implements TacoBox {
  private int tacos;

  public CustomTacoBox(int tacos) {
      this.tacos = tacos;
  }

  public void setTacos(int tacos) {
      this.tacos = tacos;
  }

  @Override
  public int tacosRemaining() {
      return this.tacos;
  }

  @Override
  public void eat() {
      this.tacos -= 1;

      if(this.tacos <= 0) {
          this.tacos = 0;
      }
  }

  @Override
  public String toString() {
      return "Total tacos left: " + this.tacos;
  }

}
