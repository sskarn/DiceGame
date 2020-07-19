class Main {
  public static void main(String[] args) {
    int player1Points = 0, player2Points = 0;
    Player player1 = new Player();
    Player player2 = new Player();
    for (int i = 1; i < 11; i++) {
        player1Points += player1.roll();
        player2Points += player2.roll();
        System.out.println("Turn " + i + ": " + "Player 1 has " + player1Points + " points");
        System.out.println("Turn " + i + ": " + "Player 2 has " + player2Points + " points");
    }
    if (player1Points > player2Points) {
        System.out.println("Player 1 Wins!");
        } else if (player2Points > player1Points) {
            System.out.println("Player 2 Wins!");
            } else if (player1Points == player2Points) {
                System.out.println("It's a Tie!");
            }
  }
}
