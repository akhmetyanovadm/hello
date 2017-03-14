package Hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {
    private Hello math;

@Before
public void init() { math = new Hello(); }
@After
public void tearDown() { math = null; }

@Test
public void calls() {
    assertEquals(0, math.getCalls());

    math.factorial(1);
    assertEquals(1, math.getCalls());

    math.factorial(1);
    assertEquals(2, math.getCalls());
}

@Test
public void factorial() {
    assertTrue(math.factorial(0) == 1);
    assertTrue(math.factorial(1) == 1);
    assertTrue(math.factorial(5) == 120);
    
}

@Test(expected = IllegalArgumentException.class)
public void factorialNegative() {
    math.factorial(-1);
}


}


