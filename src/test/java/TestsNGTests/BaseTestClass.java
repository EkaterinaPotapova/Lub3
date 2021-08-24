package TestsNGTests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestClass {

    protected Calculator calculator;//Объявили переменную

    @BeforeClass(groups = { "base" })
    public void setUp(){
        calculator=new Calculator();//Создали объект, который будем проверять
    }

    @AfterClass(groups = { "base" })
    public void clearOblect(){
        calculator=null;
    }
}
