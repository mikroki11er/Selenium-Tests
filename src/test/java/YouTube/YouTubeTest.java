package YouTube;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class YouTubeTest {
    public static WebDriver driver;
    public static Page page;
    public static FoundPage foundPage;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        page = new Page(driver);
        foundPage = new FoundPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("youtube"));
    }

    @Test
    public void youTubeCheck(){

        page.clickSearch();
        page.clearSearch();
        page.makeSymbols("Антилопа");
        page.makeButton(Keys.ENTER);
        foundPage.pageCheck.isDisplayed();

    }

    @AfterClass
    public static void logOut(){
        driver.quit();
    }
}