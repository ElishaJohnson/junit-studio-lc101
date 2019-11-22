package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_Class = new BalancedBrackets();

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }

    @Test
    public void wrongOrderedBracketsReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }

    @Test
    public void longImbalancedStringReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("LaunchCode[0][[7]"));
    }

    @Test
    public void longBalancedStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode[[0, 5], [3, 4]]]"));
    }
}
