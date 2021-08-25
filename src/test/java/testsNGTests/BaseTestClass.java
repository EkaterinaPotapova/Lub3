package testsNGTests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * BaseTestClass for Preconditions and Postconditions.
 */
public class BaseTestClass {

    protected Calculator calculator;//Объявили переменную

    @BeforeClass(groups = { "base" })//помечен для группой base, для включения предусловий и постусловий в прогон кейсов
    public void setUp(){
        calculator=new Calculator();//Создали объект, который будем проверять
    }

    @AfterClass(groups = { "base" })
    public void clearOblect(){
        calculator=null;//Удалили объект, который будем проверять
    }
}
