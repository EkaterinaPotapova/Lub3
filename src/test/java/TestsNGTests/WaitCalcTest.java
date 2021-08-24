package TestsNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * WaitCalcTest for testing calculator.wait(ms) method. Contains positive and negative tests.
 */
public class WaitCalcTest extends BaseTestClass {

    @Test
    public void waitCalcTest()  {

        synchronized(calculator){
            try {
                long m = System.currentTimeMillis();
                calculator.wait(10);
                long result =System.currentTimeMillis() - m;//если wait прошел, высчитываем сколько он длился
                Assert.assertEquals(result, 10 , "wrong time period");//проверяем
            } catch (InterruptedException e) {
                e.printStackTrace();
                Assert.fail();//если возникнет InterruptedException то тест не пройден
            }
        }
    }
}
