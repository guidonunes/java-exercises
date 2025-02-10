package PersonAndSubclasses;

public class Teacher extends Person {

  private int sallary;

  public Teacher(String name, String address, int sallary) {
      super(name, address);
      this.sallary = sallary;
  }

  public int getSallary() {
      return sallary;
  }

  @Override
  public String toString() {
      return super.getName() + "\n  " + super.getAddress() + "\n " + " salary " + this.sallary + " euro/month";
  }
}
