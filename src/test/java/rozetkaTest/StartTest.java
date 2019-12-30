package rozetkaTest;

        import enums.Categories;
        import enums.Subcategories;
        import io.qameta.allure.Description;
        import io.qameta.allure.Issue;
        import io.qameta.allure.Severity;
        import io.qameta.allure.SeverityLevel;
        import org.junit.Assert;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.interactions.Action;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import pages.MainPage;

public class StartTest extends WebDriverSettings{

    @Test
    public void startChromePage() throws InterruptedException {

        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.manage().window().maximize();

        String  currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://rozetka.com.ua/"));
        MainPage mainPage = new MainPage(chromeDriver);
        Thread.sleep(3000);
        mainPage.hoverCategory(Categories.CHILD_ITEMS);


    }

    @Test
    public void printCategory() throws InterruptedException {
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.manage().window().maximize();

        String  currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://rozetka.com.ua/"));
        Thread.sleep(3000);
        MainPage mainPage = new MainPage(chromeDriver);
        mainPage.printCategory();


    }

    @Test
    public void chooseCategory() throws InterruptedException {
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.manage().window().maximize();
        String  currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://rozetka.com.ua/"));
        Thread.sleep(3000);
        MainPage mainPage = new MainPage(chromeDriver);
        mainPage.chooseCategory(Categories.ITEMS_FOR_BUSINESS);
        Thread.sleep(3000);
    }

    @Issue(value = "issue-445")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Вывести список подкатегорий")
    @Test
    public void printSubcategory() throws InterruptedException {
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.manage().window().maximize();
        MainPage mainPage = new MainPage(chromeDriver);
        mainPage.hoverCategory(Categories.HOUSEHOLD_APPLIANCES);
        mainPage.printSubCategory();

    }

    @Test
    public void chooseSubCategory () throws InterruptedException {
        chromeDriver.get("https://rozetka.com.ua/");
        chromeDriver.manage().window().maximize();
        MainPage mainPage = new MainPage(chromeDriver);
        mainPage.hoverCategory(Categories.HOUSEHOLD_APPLIANCES);
        mainPage.chooseSubCategory(Subcategories.FRIDGES);
        Thread.sleep(3000);
    }




    @Test
    public void startFfPage() throws InterruptedException {
        geckoDriver = new FirefoxDriver();
        geckoDriver.get("https://rozetka.com.ua/");
        geckoDriver.manage().window().maximize();

        String currentFfUrl = geckoDriver.getCurrentUrl();
        Assert.assertTrue(currentFfUrl.equals("https://rozetka.com.ua/"));
        Thread.sleep(10000);
    }
}
