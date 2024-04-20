package cn.edu.jnu.x2021153018;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test20Zeros()  {
        repeatedRoll(0, 20);
        assertEquals(0, game.score());
    }
    @Test
    public void test20Ones()  {
        repeatedRoll(1,20);
        assertEquals(20,game.score());
    }
    @Test
    public void testASpare()
    {
        rollASpare();
        game.roll(0);
        game.roll(1);
        game.roll(9);
        repeatedRoll(0,16);
        assertEquals(12,game.score());
    }
    @Test
    public void testAStrike()
    {
        rollAStrike();
        game.roll(10);
        game.roll(1);
        game.roll(1);
        repeatedRoll(0,14);
        assertEquals(35,game.score());
    }

    @Test
    public void testFullStrike()
    {
        repeatedRoll(10,12);
        assertEquals(300,game.score());
    }

    private void rollAStrike() {
        game.roll(10);
    }

    private void rollASpare() {
        game.roll(2);
    }

    private void repeatedRoll(int pin, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }
}