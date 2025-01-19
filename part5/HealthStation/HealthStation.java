package part5.HealthStation;


public class HealthStation {
  private int weighingsCount;

  public HealthStation() {
      this.weighingsCount = 0;
  }


  public int weigh(Person person) {
      this.weighingsCount++;
      return person.getWeight();

  }

  public void feed(Person person) {
      person.setWeight(person.getWeight() + 1);
  }

  public int weighings() {
      return this.weighingsCount;
  }

}
