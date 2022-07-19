package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage extends BasePage {
    By thankYouText = By.cssSelector("h2[class='complete-header']");
    By backHomeButton = By.id("back-to-products");

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean thankYouTextIsDisplayed() {
        return driver.findElement(thankYouText).isDisplayed();
    }
    public void clickBackHomeButton() {
        driver.findElement(backHomeButton).click();
    }

}
