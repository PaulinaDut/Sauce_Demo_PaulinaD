package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutTwoPage extends BasePage {
    By finishButton = By.id("finish");

    public CheckoutTwoPage(WebDriver driver) {
        super(driver);
    }

    public boolean finishButtonIsDisplayed(){
        return driver.findElement(finishButton).isDisplayed();
    }
    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }
}
