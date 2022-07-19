package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    By removeButton = By.xpath("//button[text() = 'Remove']");
    String cartItemContainer = "//div[@class = 'cart_item']";
    By cartProductDescription = By.cssSelector("div.inventory_item_desc");
    By removedCartItem = By.cssSelector("div.removed_cart_item");
    By checkoutButton = By.id("checkout");
    By continueShoppingButton = By.id("continue-shopping");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickRemoveButton() {
        driver.findElement(removeButton).click();
    }
    public String getCartProductDescription(String productName) {
        WebElement cartItemContainer = getCartItemContainer(productName);
        return cartItemContainer.findElement(cartProductDescription).getText();
    }
    public boolean removedCartItemIsNotDisplayed() {
        return driver.findElement(removedCartItem).isDisplayed();
    }
    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }
    public void clickContinueShoppingButton() {
        driver.findElement(continueShoppingButton).click();
    }

    private WebElement getCartItemContainer(String productName) {
        return driver.findElement(By.xpath
                (String.format(cartItemContainer, productName)
                ));
    }
}
