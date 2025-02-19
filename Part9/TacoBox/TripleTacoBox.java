package Part9.TacoBox;

public class TripleTacoBox implements TacoBox {
  private int tacos;

  public TripleTacoBox() {
      this.tacos = 3;
  }

  public int tacosRemaining() {
      return this.tacos;
  }

  public void eat() {
      this.tacos -= 1;

      if(this.tacos <= 0) {
          this.tacos = 0;
      }
  }

  public String toString() {
      return "Total tacos left: " + this.tacos;
  }
}
