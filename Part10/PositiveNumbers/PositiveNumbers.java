package Part10.PositiveNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class PositiveNumbers {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<Integer> inputs = new ArrayList<>();

      System.out.println("Type some numbers:");
      while(true) {
          String row = scanner.nextLine();
          if(row.equals("end")) {
              break;
          }

          inputs.add(Integer.parseInt(row));
      }

      List<Integer> positiveNumbers = positive(inputs);
      positiveNumbers.forEach(System.out::println);
  }

  public static List<Integer> positive(List<Integer> numbers) {
      return numbers.stream()
              .filter(value -> value > 0)
              .collect(Collectors.toList());
  }
}
