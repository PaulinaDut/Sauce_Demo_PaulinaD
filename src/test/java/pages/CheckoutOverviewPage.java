package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends BasePage {
    private By finishButton = By.id("finish");

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean finishButtonIsDisplayed(){
        return driver.findElement(finishButton).isDisplayed();
    }
    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }
}
