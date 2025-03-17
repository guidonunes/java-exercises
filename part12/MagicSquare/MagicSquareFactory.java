package part12.MagicSquare;

public class MagicSquareFactory {

  public MagicSquare createMagicSquare(int size) {
      if (size % 2 == 0) {
          throw new IllegalArgumentException("Size must be an odd number.");
      }

      MagicSquare square = new MagicSquare(size);

      int row = 0; // Start at the top row
      int col = size / 2; // Start at the middle column
      int num = 1; // Start with the number 1

      // Fill the magic square
      while (num <= size * size) {
          // Place the current number in the current cell
          square.placeValue(col, row, num);

          // Move up and right
          int nextRow = row - 1;
          int nextCol = col + 1;

          // Handle wrapping around the edges
          if (nextRow < 0) {
              nextRow = size - 1; // Wrap to the bottom row
          }
          if (nextCol >= size) {
              nextCol = 0; // Wrap to the leftmost column
          }

          // If the target cell is already occupied, move down instead
          if (square.readValue(nextCol, nextRow) != 0) {
              nextRow = row + 1;
              nextCol = col;
          }

          // Update the current position
          row = nextRow;
          col = nextCol;

          // Increment the number
          num++;
      }

      return square;
  }
}
