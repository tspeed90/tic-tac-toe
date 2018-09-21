import java.util.Scanner;

public class TicTacToe {
    String player1 = "X";
    String player2 = "O";
    int currentPlayer;
    String[] currentBoard = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.newGame();
  }

  public void newGame() {
    currentPlayer = 2;
    System.out.println("Ready for a game of Tic Tac Toe?");
    
    System.out.println("Player " + currentPlayer + ", choose a square for your move.");

    Scanner sc = new Scanner(System.in);
    int playerMove = sc.nextInt();

    currentBoard[playerMove - 1] = currentPlayer == 1 ? player1 : player2;
    printBoard();
  }

    public void printBoard() {
    System.out.println(currentBoard[0]  + "|" + currentBoard[1] + "|" + currentBoard[2]);
    System.out.println(currentBoard[3]  + "|" + currentBoard[4] + "|" + currentBoard[5]);
    System.out.println(currentBoard[6]  + "|" + currentBoard[7] + "|" + currentBoard[8]);
  }
}
