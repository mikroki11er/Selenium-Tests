package YouTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoundPage {

    public WebDriver driver;
    public FoundPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//yt-formatted-string[contains(text(),'Золотая Антилопа. Со')]")
    public WebElement pageCheck;
}
