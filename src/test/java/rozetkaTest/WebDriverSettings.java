package rozetkaTest;

import com.google.common.io.Resources;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class WebDriverSettings {
    protected ChromeDriver chromeDriver;
    protected FirefoxDriver geckoDriver;

    @Before
    public void setUp () throws IOException {
        System.setProperty("webdriver.chrome.driver", Resources.getResource("chromedriver").getPath());
//        System.setProperty("webdriver.chrome.driver", "/home/nataliiamoroz/G29Project/rozetka/src/main/resources/chromedriver");

        //System.setProperty("webdriver.gecko.driver", getClass().getClassLoader().getResource("geckodriver").getPath());
        chromeDriver = new ChromeDriver();
        //geckoDriver = new FirefoxDriver();
    }

    @After
    public void close(){
        chromeDriver.close();
//        geckoDriver.quit();
    }

}
