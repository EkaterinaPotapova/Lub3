package TestsNGTests;


import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseTestClass{


    @Test(dataProvider = "valuesForSum", groups = { "correctTests" })
    public void sumTest(long a,long b, long expValue){
        long result=calculator.sum(a,b);
        Assert.assertEquals(result, expValue , "error sum result");

    }

    @DataProvider(name = "valuesForSum")
    public Object[][] valuesForSum(){
        return new Object[][] {
        {9,11,20},
        {10,10,20},
        {10,-6,4},
        {0,-6,-6},
        {-3,-6,-9}
        };
    }
    @Test(dataProvider = "valuesForSumIncorrect", groups = { "inCorrectTests" })
    public void sumTestNeg(long a,long b, long expValue){
        long result=calculator.sum(a,b);
        Assert.assertNotEquals(result, expValue , "error sum result");

    }

    @DataProvider(name = "valuesForSumIncorrect")
    public Object[][] valuesForSumIncorrect(){
        return new Object[][] {
                {9,1,20},
                {10,10,40},
                {10,0,0},
                {0,-6,6},
                {-3,-6,1}
        };
    }

}
