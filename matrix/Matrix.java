public class Matrix {

  private int[][] matrix;
  private int size;

  private static final String YELLOW = "\u001B[33m";
  private static final String RESET = "\u001B[0m";

  public Matrix(int size) {
    this.size = size;
    matrix = new int[size][size];
    System.out.println("Matrix created with dimensions: " + size + " x " + size);
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void populateMatrix() {
    int count = 1;

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        matrix[row][col] = count++;
      }
    }
  }

  public void printMatrix() {
    System.out.println();

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {

        boolean onDiagonal = (row + col == size - 1);

        if (onDiagonal) {
          System.out.print(YELLOW + matrix[row][col] + RESET + "\t");
        } else {
          System.out.print(matrix[row][col] + "\t");
        }
      }

      System.out.println();
    }

    System.out.println();
  }

  public void flipMatrix() {
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {

        if (row + col == size - 1) {
          continue;
        }

        if (row + col < size - 1) {
          int targetRow = size - row - 1;
          int targetCol = size - col - 1;

          swap(row, col, targetRow, targetCol);
        }
      }
    }
  }
}
