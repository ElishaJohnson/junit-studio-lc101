package test;

import org.junit.Test;

import static main.BonusBinarySearch.binarySearch;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    public int[] sortedNumbers = {0, 1, 5, 7, 11, 13};

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void findsNumber() {
        assertEquals(binarySearch(sortedNumbers, 7), 3);
    }

    @Test
    public void respondsCorrectlyIfNotFound() {
        assertEquals(binarySearch(sortedNumbers, 6), -1);
    }
}
