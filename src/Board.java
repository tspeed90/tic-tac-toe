

public class Board {
  private String[] currentBoard;

  public void resetBoard() {
    this.currentBoard = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "};
  }

  public void printBoard() {
    System.out.println(currentBoard[0]  + "|" + currentBoard[1] + "|" + currentBoard[2]);
    System.out.println(currentBoard[3]  + "|" + currentBoard[4] + "|" + currentBoard[5]);
    System.out.println(currentBoard[6]  + "|" + currentBoard[7] + "|" + currentBoard[8]);
  }

  public void set(int position, String symbol) {
    currentBoard[position - 1] = symbol;
  }

  public String get(int position) {
    return currentBoard[position - 1];
  } 

  public boolean isSpotFree(int position) {
    return currentBoard[position - 1] == " ";
  }
}