class Player {
  public int roll() {
    Die dice1 = new Die();
    Die dice2 = new Die();
    return dice1.diceRoll() + dice2.diceRoll();
  }
}
