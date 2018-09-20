public class TicTacToe {
    String player1 = "X";
    String player2 = "O";
    int currentPlayer;

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.newGame();
  }

  public void newGame() {
    System.out.println("Ready for a game of Tic Tac Toe?");
    System.out.println(" "  + "|" + " " + "|" + " ");
    System.out.println(" "  + "|" + " " + "|" + " ");
    System.out.println(" "  + "|" + " " + "|" + " ");
  }
}
