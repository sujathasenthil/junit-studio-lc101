package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_Class;

    @Before
    public void createBracketObject() {
        BalancedBrackets test_Class = new BalancedBrackets();
    }

    //TODO: add tests here
    //Testcase1:
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    //Testcase2:
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //Testcase3:
    @Test
    public void stringWithBalancedBrackets() {
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }
    //Testcase4:
    @Test
    public void stringWithBalancedBracketInBtwn() {
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
    }
    //Testcase5:
    @Test
    public void stringWithBalncedBracketAtStart() {
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }
    //Testcase6:
    @Test
    public void stringWithOnlyOpeningBracket() {
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
    }
    //TestCase7:
    @Test
    public void stringWithOnlyClosingBracket() {
        assertFalse(test_Class.hasBalancedBrackets("LaunchCode]"));
    }
    //TestCase8:
    @Test
    public void unOrderedBracketsBtwnString() {
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }
    //TestCase9:
    @Test
    public void unorderedBrackets() {
       assertFalse(test_Class.hasBalancedBrackets("]["));
    }
    //TestCase10 & 11:
    @Test
    public void singleBracket() {
        assertFalse(test_Class.hasBalancedBrackets("["));
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }
    //TestCase 12 & 13:
    @Test
    public void missingBracketPair() {
        assertFalse(test_Class.hasBalancedBrackets("sd]dsf[gadg"));
        assertFalse(test_Class.hasBalancedBrackets("[sdfssd]dsf["));
    }



}