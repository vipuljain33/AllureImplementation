package pack1;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;
import static org.hamcrest.MatcherAssert.*;


/**
 * Created by vipuljain on 9/5/2016.
 */

@Title("This is demo test suite")
@Description("Testing only stubs")
public class DemoTest {


    public void beforeMethod()
    {
        System.out.println("Inside Before Method");
    }


    @Title("First test")
    @Description("First Test case description")
    @Test
    public void fun1()
    {
        System.out.println("Inside fun1");
        ReusableMethods.method1();
        ReusableMethods.method2();
        ReusableMethods.method3();
        ReusableMethods.saveTextLog();
        ReusableMethods.saveImage();


    }

    @Title("Second Test")
    @Description("Second Test case description")
    @Test
    public void fun2()
    {
        System.out.println("Inside fun2");
        Logger logger = LoggerFactory.getLogger(DemoTest.class);
        final String message = "Hello Logging";
        logger.info(message);
        logger.trace(message);




    }

    @Test
    public void fun3()
    {
        Assert.assertEquals(true, false);

    }

    @Test
    public void fun4()
    {

        Assert.assertEquals(true, false);
    }

    @Test
    public void fun5()
    {
        try {


            Integer.valueOf("12yuyu");
        }catch (Exception e)
        {
            if(e != null)
            {
                Assert.fail("This string cant be converted to number");
            }
        }
    }






}
