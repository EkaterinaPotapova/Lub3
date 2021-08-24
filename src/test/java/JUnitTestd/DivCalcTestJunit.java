package JUnitTestd;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * JUnit test for Calculator.
 */
public class DivCalcTestJunit {
    private Calculator calculator;//Объявили переменную

   @Before
   public void setUp(){
       calculator=new Calculator();//Создали объект, который будем проверять
   }

    @Test
    public void divTestJunit(){
        long result=calculator.div(6,7);
        org.junit.Assert.assertEquals("error div result",0,result);//проверяем результат целочисленного
        // деления
    }

    @After
    public void clearOblect(){
        calculator=null;//удалили объект
    }
}
