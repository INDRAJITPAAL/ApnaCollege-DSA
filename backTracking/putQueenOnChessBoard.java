package backTracking;

public class putQueenOnChessBoard {

  public static void nQuenProb(char board[][], int i) {
    // base case and printing final board
    if (i == board.length) {
      System.out.println("-----chess board------");
      printBoard(board);
      return;
    }
    // puting value on this
    for (int j = 0; j < board.length; j++) {
      board[j][i] = 'Q';
      nQuenProb(board, i + 1);
      board[j][i] = 'x';
    }
  }

  // board printing
  public static void printBoard(char board[][]) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  // board replacing with X dot value means blank
  public static void dots(char board[][]) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = 'x';
      }
    }
  }

  public static void main(String[] args) {
    int n = 2;
    // board making n*n grid
    char[][] board = new char[n][n];

    dots(board);
    nQuenProb(board, 0);

  }
}
