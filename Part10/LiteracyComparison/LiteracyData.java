package Part10.LiteracyComparison;

public class LiteracyData implements Comparable<LiteracyData> {
  private String country;
  private int year;
  private String gender;
  private double literacyRate;

  public LiteracyData(String country, int year, String gender, double literacyRate) {
      this.country = country;
      this.year = year;
      this.gender = gender;
      this.literacyRate = literacyRate;
  }

  public double getLiteracyRate() {
      return literacyRate;
  }

  @Override
  public String toString() {
      return country + " (" + year + "), " + gender + ", " + literacyRate;

  }

  @Override
  public int compareTo(LiteracyData other) {
      return Double.compare(this.literacyRate, other.literacyRate);
  }
}
