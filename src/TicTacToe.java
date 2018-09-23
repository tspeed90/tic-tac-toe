import java.util.Scanner;

public class TicTacToe {
    String player1 = "X";
    String player2 = "O";
    int currentPlayer;
    String[] currentBoard = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.newGame();
    
    while(!game.checkForWin()) {
      game.getPlayerMove();
      game.printBoard();
    }
  }

  public void newGame() {
    currentPlayer = 1;
    System.out.println("Ready for a game of Tic Tac Toe?");
    printBoard();
  }

  public void printBoard() {
    System.out.println(currentBoard[0]  + "|" + currentBoard[1] + "|" + currentBoard[2]);
    System.out.println(currentBoard[3]  + "|" + currentBoard[4] + "|" + currentBoard[5]);
    System.out.println(currentBoard[6]  + "|" + currentBoard[7] + "|" + currentBoard[8]);
  }
  public void getPlayerMove() {
    System.out.println("Player " + currentPlayer + ", choose a square for your move.");

    Scanner sc = new Scanner(System.in);
    int playerMove = sc.nextInt();

    currentBoard[playerMove - 1] = currentPlayer == 1 ? player1 : player2;    
    currentPlayer = currentPlayer == 1 ? 2 : 1;
  }

  public boolean checkLine(int a, int b, int c) {
    return (currentBoard[a] == currentBoard[b] && currentBoard[b] == currentBoard[c] && currentBoard[a] != " ");
  }

  public boolean checkForWin() {
    return checkLine(0, 1, 2) || checkLine(3, 4, 5) ||checkLine(6, 7, 8) || checkLine(0, 3, 6) 
    || checkLine(1, 4, 7) || checkLine(2, 5, 8) || checkLine(0, 4, 8) || checkLine(2, 4, 6);
  }

}
