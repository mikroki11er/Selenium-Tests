package Google;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class GoogleTest {

    public static WebDriver driver;
    public static SearchPage searchPage;
    public static FirstFoundPage foundPage;
    public static SecondPage secondPage;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", Google.ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        foundPage = new FirstFoundPage(driver);
        secondPage = new SecondPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("google"));
    }

    @Test
    public void googleTest(){
        searchPage.clickSearch();
        searchPage.clearSearch();
        searchPage.makeSymbols("Коты");
        searchPage.makeButton(Keys.ENTER);
        foundPage.firstPageCheck();
        foundPage.clickOnFound();
        foundPage.switchWindow();
        secondPage.checkSecondPage();
    }

    @AfterClass
    public static void logOut() { driver.quit(); }
}
