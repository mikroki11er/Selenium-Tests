package Google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
    public WebDriver driver;
    public SecondPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//th[@colspan='2' and contains (text(), 'Кошка')]")
    private WebElement secondPage;

    public void checkSecondPage(){ secondPage.isDisplayed(); }
}
