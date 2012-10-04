

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testScoreBox.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testScoreBox
{
    /**
     * Default constructor for test class testScoreBox
     */
    public testScoreBox()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void keepscore()
    {
        ScoreBox scoreBox1 = new ScoreBox();
        scoreBox1.addScore(3);
        assertEquals(1, scoreBox1.getScoreteam(3));
        scoreBox1.addScore(4);
        assertEquals(1, scoreBox1.getScoreteam(4));
        scoreBox1.addScore(5);
        assertEquals(1, scoreBox1.getScoreteam(5));
    }
}

