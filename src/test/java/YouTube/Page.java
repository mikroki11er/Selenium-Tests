package YouTube;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {


    public WebDriver driver;
    public Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement youSearch;

    public void clickSearch () { youSearch.click();}

    public void clearSearch () { youSearch.clear();}

    public void makeSymbols (String key) { youSearch.sendKeys(key);}

    public void makeButton (Keys keys) { youSearch.sendKeys(keys);}
}