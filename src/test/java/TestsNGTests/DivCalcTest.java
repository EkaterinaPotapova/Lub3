package TestsNGTests;

import org.testng.Assert;

import org.testng.annotations.Test;

public class DivCalcTest extends BaseTestClass {


    @Test
    public void divTest(){
        long result=calculator.div(6,7);
        Assert.assertEquals(result, 0 , "error div result");

    }


}
