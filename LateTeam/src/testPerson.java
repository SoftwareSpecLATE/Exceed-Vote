

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testPerson.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testPerson
{
    /**
     * Default constructor for test class testPerson
     */
    public testPerson()
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
    public void teststudent()
    {
        Vote vote2 = new Vote();
        assertEquals("student", vote2.getType());
    }
}

