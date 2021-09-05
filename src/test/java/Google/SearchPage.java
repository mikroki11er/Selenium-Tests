package Google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public WebDriver driver;
    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy (xpath = "//input[@title='Поиск']")
    private WebElement googleSearch;

    public void clickSearch () { googleSearch.click();}

    public void clearSearch () { googleSearch.clear();}

    public void makeSymbols (String key) { googleSearch.sendKeys(key);}

    public void makeButton (Keys keys) { googleSearch.sendKeys(keys);}
}
