package backTracking;

public class nQueen {

  public static void printBoard(char board[][]) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void nQuenProb(char board[][], int i) {
//    base case and printing final board
    if (i == board.length) {
      printBoard(board);
      System.out.println("-----n queen board ------");
      return;
    }
    //puting value on this
    for (int j = 0; j < board.length; j++) {
      board[j][i] = 'Q';
      nQuenProb(board, i + 1);
      board[j][i] = '.';
    }
  }

  public static void main(String[] args) {
    int n = 2;
    // board making n*n grid
    char[][] board = new char[n][n];
    // board replacing with . dot value means blank
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = '.';
      }
    }
    nQuenProb(board, 0);
    // System.out.println(Arrays.deepToString(board).replace("],","],\n"));

  }
}
