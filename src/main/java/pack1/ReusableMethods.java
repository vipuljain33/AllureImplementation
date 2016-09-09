package pack1;



import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



/**
 * Created by vipuljain on 9/5/2016.
 */
public class ReusableMethods {

    @Step("Step 1")
    public static void method1()
    {
        System.out.println("Inside method 1");
    }

    @Step("Step 2")
    public static void method2()
    {
        System.out.println("Inside method 1");
    }

    @Step("Step 3")
    public static void method3()
    {
        System.out.println("Inside method 1");
    }

    @Attachment(value = "Attaching Log Text", type = "text/plain")
    public static byte[] saveTextLog()
    {
        /*String file = "C:\\Users\\vipuljain\\Desktop\\LogText.txt";
        return file;*/
        try {


            Path path = Paths.get("C:\\Users\\vipuljain\\Desktop\\LogText.txt");
            byte[] data = Files.readAllBytes(path);
            return data;
        }catch (Exception e)
        {

        }
        return null;

    }

    @Attachment(value = "Attaching Image", type = "image/png")
    public static byte[] saveImage()
    {

        try {


            Path path = Paths.get("C:\\Users\\vipuljain\\Pictures\\Saved Pictures\\42-bicycle-png-image.png");
            byte[] data = Files.readAllBytes(path);
            return data;
        }catch (Exception e)
        {

        }
        return null;
    }




}
