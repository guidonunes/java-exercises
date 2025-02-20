package Part9.InterfaceInABox;


public class Book implements Packable {
  private String author;
  private final String name;
  private final double weight;

  public Book(String author, String name, double weight) {
      this.author = author;
      this.name = name;
      this.weight = weight;
  }

  @Override
  public double weight() {
      return this.weight;
  }

  public String getName() {
      return name;
  }

  public String toString() {
      return  this.author + ": " + this.name;
  }
}
