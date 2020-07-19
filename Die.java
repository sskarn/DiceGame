import java.util.Random;
class Die {
    Random randomNum = new Random();
    public int diceRoll() {
        int diceResult = 0;
        diceResult = randomNum.nextInt(6) + 1;
        return diceResult;
    }
}
