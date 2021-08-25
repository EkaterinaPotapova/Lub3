package testsNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * DivCalcTest for testing calculator.div method.
 */
public class DivCalcTest extends BaseTestClass {

    @Test
    public void divTest(){
        long result=calculator.div(6,2);
        Assert.assertEquals(result, 3 , "error div result");//проверяем целочисленное деление
    }

    @Test
    public void divZeroTest() {
        try {
            long result = calculator.div(6, 0);
            Assert.fail();//если калькулятор допускает деление на ноль, то тест не пройден
        } catch (NumberFormatException e) { //если поймали Exception то проверяем Message
            System.out.println(e.getMessage());
            Assert.assertEquals(e.getMessage(),"Attempt to divide by zero","Wrong error message");
            //Если Message = "Attempt to divide by zero" то тест пройден
        }
    }
}
