package TestsNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * IsNegativeCalcTest for testing calculator.isNegative method.
 */
public class IsNegativeCalcTest extends BaseTestClass{

    @Test
    public void isNegativeNegTest(){
        boolean result=calculator.isNegative(-3);
        Assert.assertTrue(result, "error in defining negative");
    }

    @Test
    public void isNegativePosTest(){
        boolean result=calculator.isNegative(3);
        Assert.assertFalse(result, "error in defining negative");
    }

    @Test
    public void isNegativeZeroTest() {
        boolean result=calculator.isNegative(0);
        Assert.assertFalse(result, "error in defining negative");
    }
}
