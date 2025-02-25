package Part9.Animals;

public abstract class Animal {
  private String name; // Private field

  public Animal(String name) {
      this.name = name;
  }

  public void eat() {
      System.out.println(name + " eats");
  }

  public void sleep() {
      System.out.println(name + " sleeps");
  }

  public String getName() {
      return name;
  }
}
