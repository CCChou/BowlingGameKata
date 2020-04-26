package dennis.kata.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testAllZero() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    private void rollMany(int num, int pins) {
        for (int i = 0; i < num; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void testAllOne() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }
}
