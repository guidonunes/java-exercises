package part12.ArrayAsString;

public class Program {

  public static void main(String[] args) {
      // Test your method here

      int rows = 2;
      int columns = 3;
      int[][]matrix = new int[rows][columns];

      matrix[0][1] = 5;
      matrix[1][0] = 3;
      matrix[1][2] = 7;
      System.out.println(arrayAsString(matrix));

      int[][] matrix2 = {
          {3, 2, 7, 6},
          {2, 4, 1, 0},
          {3, 2, 1, 0}
      };

      System.out.println(arrayAsString(matrix2));
  }

  public static String arrayAsString(int[][] array) {
      StringBuilder sb = new StringBuilder();

      // Iterate through each row
      for (int i = 0; i < array.length; i++) {
          // Iterate through each column in the current row
          for (int j = 0; j < array[i].length; j++) {
              sb.append(array[i][j]); // Append the current element
          }
          sb.append("\n"); // Add a newline after each row
      }

      return sb.toString(); // Convert StringBuilder to String and return

  }
}
