import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Main {

    static WebDriver driver;
    final int waitForResposeTime = 4;

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilja\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @After
    public void tearDown(){
//        driver.close();
    }

}