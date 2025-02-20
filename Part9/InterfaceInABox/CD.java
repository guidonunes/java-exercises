package Part9.InterfaceInABox;


public class CD implements Packable {
  private final String author;
  private final String name;
  private final int year;
  private final double weight;

  public CD (String author, String name, int year) {
      this.author = author;
      this.name = name;
      this.year = year;
      this.weight = 0.1;
  }

  @Override
  public double weight() {
      return weight;
  }

  public String toString() {
      return this.author + ": " + this.name + " (" + this.year + ")";

  }
}
