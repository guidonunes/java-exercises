package Part10.Literature;


public class Book implements Comparable<Book> {
  private String name;
  private int age;

  public Book(String name, int age) {
      this.name = name;
      this.age = age;
  }

  public String getName() {
      return this.name;
  }

  public int getAge() {
      return this.age;
  }

  @Override
  public String toString() {
      return this.name + " (recommended for " + this.age + " year-olds or older)";
  }

  @Override
  public int compareTo(Book book) {
      if(this.age == book.getAge()) {
          return this.name.compareTo(book.getName());
      }
      return this.age - book.getAge();
  }

}
