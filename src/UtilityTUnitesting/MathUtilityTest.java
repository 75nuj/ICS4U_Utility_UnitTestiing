package UtilityTUnitesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import UtilityTUnitesting.MathUtility;

public class MathUtilityTest {
    @Test
    public void addTest1() {
        assertEquals(0, MathUtility.add(0, 0));
    }

    @Test
    public void addTest2() {
        assertEquals(0, MathUtility.subtraction(4, 4));
    }

    
}