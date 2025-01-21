
public class SimpleDate {

  private int day;
  private int month;
  private int year;

  public SimpleDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
  }

  public void advance() {

      this.day += 1;

      while (this.day > 30) {
          this.day -= 30;
          this.month++;

          if(this.month > 12) {
              this.month = 1;
              this.year++;
          }
      }
  }

  public void advance(int howManyDays) {

      this.day += howManyDays;

      while (this.day > 30) {
          this.day -= 30;
          this.month++;

          if(this.month > 12) {
              this.month = 1;
              this.year++;
          }
      }
  }

  public SimpleDate afterNumberOfDays(int days) {
      SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

      newDate.day += days;

          while (newDate.day > 30) {
              newDate.day -= 30;
              newDate.month++;

          if(newDate.month > 12) {
              newDate.month = 1;
              newDate.year++;
          }
      }


      return newDate;
  }

  @Override
  public String toString() {
      return this.day + "." + this.month + "." + this.year;
  }

  public boolean before(SimpleDate compared) {
      if (this.year < compared.year) {
          return true;
      }

      if (this.year == compared.year && this.month < compared.month) {
          return true;
      }

      if (this.year == compared.year && this.month == compared.month &&
               this.day < compared.day) {
          return true;
      }

      return false;
  }

}
