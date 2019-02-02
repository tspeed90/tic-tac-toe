import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe {
  String player1 = "X";
  String player2 = "O";
  int currentPlayer;
  Board board = new Board();
 

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.newGame();
    
    while(!game.checkForWin()) {
      game.getPlayerMove();
      game.board.printBoard();
    } 

    game.announceWinner();
  }

  public void newGame() {
    currentPlayer = 1;
    board.resetBoard();
    System.out.println("Ready for a game of Tic Tac Toe?");
    board.printBoard();
  }

  

  public void getPlayerMove() {
    int playerMove;
    do {
      System.out.println("Player " + currentPlayer + ", choose a square for your move.");
      Scanner sc = new Scanner(System.in);
      try {
        playerMove = sc.nextInt();
      } catch (InputMismatchException e) {
        sc.next();
        System.out.println("Please enter a number between 1 and 9.");
        playerMove = sc.nextInt();
      }
      if (!board.isSpotFree(playerMove)) {
        System.out.println("Sorry, someone has chosen that square. Please choose again.");
      }
    } while (!board.isSpotFree(playerMove));

    board.set(playerMove, currentPlayer == 1 ? player1 : player2);
    if (!checkForWin()) {
      currentPlayer = currentPlayer == 1 ? 2 : 1;
    } 
  }

  public boolean checkLine(int a, int b, int c) {
    return (board.get(a) == board.get(b) && board.get(b) == board.get(c) && !board.isSpotFree(a));
  }

  public boolean checkForWin() {
    return checkLine(1, 2, 3) || checkLine(4, 5, 6) || checkLine(7, 8, 9) || checkLine(1, 4, 7) 
        || checkLine(2, 5, 8) || checkLine(3, 6, 9) || checkLine(1, 5, 9) || checkLine(3, 5, 7);
  }

  public void announceWinner() {
    if (checkForWin()) {
      System.out.println("Player " + currentPlayer + " wins!");
    }
  } 

}
