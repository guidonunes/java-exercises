package Part10.Customer;

public class Customer {
  private String name;
  private String address;
  private String email;


  public Customer(String name, String address, String email) {
      this.name = name;
      this.address = address;
      this.email = email;
  }

  public String getName() {
      return this.name;
  }

  public String getAddress() {
      return this.address;
  }

  public String getEmail() {
      return this.email;
  }

  public String toString(){
      return "Name: " + this.name + "\n" +
             "Address: " + this.address + "\n" +
             "Email: " + this.email;
  }
}
