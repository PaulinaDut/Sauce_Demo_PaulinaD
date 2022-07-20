package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage extends BasePage {
    private By userFirstInput = By.id("first-name");
    private By userLastInput = By.id("last-name");
    private By userPostalCodeInput = By.id("postal-code");
    private By errorMessageContainer = By.cssSelector("div.error-message-container");
    private By continueButton = By.id("continue");
    private By cancelButton = By.id("cancel");

    public CheckoutYourInformationPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstName(String firstNameInputValue) {
        driver.findElement(userFirstInput).sendKeys(firstNameInputValue);

    }
    public void setLastName(String lastNameInputValue) {
        driver.findElement(userLastInput).sendKeys(lastNameInputValue);

    }
    public void setPostalCode(String postalCodeInputValue) {
        driver.findElement(userPostalCodeInput).sendKeys(postalCodeInputValue);

    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
    public boolean isErrorMessageContainerDisplayed() {
        return driver.findElement(errorMessageContainer).isDisplayed();
    }
    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageContainer).getText();
    }
    public void checkoutYourInformationForm(String firstNameInputValue, String lastNameInputValue, String postalCodeInputValue) {
        setFirstName("Berry");
        setLastName("Smith");
        setPostalCode("12345");
        clickContinueButton();
    }
}
