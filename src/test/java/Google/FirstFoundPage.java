package Google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class FirstFoundPage {

    public WebDriver driver;
    public FirstFoundPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



    @FindBy(xpath = "//h3[contains (text(),'Кошка - Википедия')]")
    private WebElement checkFound;


    public void firstPageCheck (){ checkFound.isDisplayed(); }

    public void clickOnFound () {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).click(checkFound).keyUp(Keys.LEFT_CONTROL).build().perform();    }

    public void switchWindow(){
        String windowHandle = driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList (driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1));
    }
}
