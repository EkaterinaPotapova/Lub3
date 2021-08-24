package JUnitTestd;

import static org.junit.Assert.assertTrue;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class DivCalcTestJunit {
    private Calculator calculator;//Объявили переменную

   /**
     * Rigorous Test :-)
     */

   @Before
   public void setUp(){
       calculator=new Calculator();//Создали объект, который будем проверять
   }

    @Test
    public void divTest()
    {
        long result=calculator.div(6,7);
        org.junit.Assert.assertEquals("error sum long",0,result);


    }

    @After
    public void clearOblect(){
        calculator=null;
    }


}
