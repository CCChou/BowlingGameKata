package dennis.kata.bowlinggame;

public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int index = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[index] + rolls[index + 1] == 10) {  // spare
                score += 10;
                score += rolls[index + 2];
            } else {
                score += rolls[index] + rolls[index + 1];
            }
            index += 2;
        }
        return score;
    }
}
