package part5.ItemsList;

public class Product {
  private String identifier;
  private String name;


  public Product(String identifier, String name) {
      this.identifier = identifier;
      this.name = name;

  }

  public String getIdentifier() {
      return this.identifier;
  }

  public String getName() {
      return this.name;
  }



  public boolean equals(Object compared) {
      if(this == compared) {
          return true;
      }

      if(!(compared instanceof Product)) {
          return false;
      }

      Product comparedProduct = (Product) compared;

      if(this.identifier.equals(comparedProduct.identifier)) {
          return true;
      }
      return false;
  }

  @Override
  public String toString() {
      return this.identifier + ": " + this.name;
  }
}
