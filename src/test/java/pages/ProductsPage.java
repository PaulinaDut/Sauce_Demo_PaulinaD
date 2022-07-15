package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{
    By headerContainer = By.id("header_container");
    String itemContainer = "//div[@class='inventory_item_name' and text() = '%s']/ancestor::div[@class = 'inventory_item']";
    By itemDetailsLink = By.cssSelector("a[id$=_title_link");
    By removeButton = By.cssSelector("button[id^=remove-]");
    By addToCartButton = By.cssSelector("button[id^=add-]");
    By productPrice = By.cssSelector("div.inventory_item_price");
    By productDescription = By.cssSelector("div.inventory_item_desc");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderContainerDisplayed() {
        return driver.findElement(headerContainer).isDisplayed();
    }

    public String getProductPrice(String productName) {
        WebElement productContainer = getProductContainer(productName);
        return productContainer.findElement(productPrice).getText();

    }

    public String getProductDescription(String productName) {
        WebElement productContainer = getProductContainer(productName);
        return productContainer.findElement(productDescription).getText();

    }

    public void clickAddToCardButton(String productName) {
        WebElement productContainer = getProductContainer(productName);
        productContainer.findElement(addToCartButton).click();

    }

    public void clickRemoveButton(String productName) {
        WebElement productContainer = getProductContainer(productName);
        productContainer.findElement(removeButton).click();

    }

    public String openProductDetails(String productName) {
        WebElement productContainer = getProductContainer(productName);
        return productContainer.findElement(itemDetailsLink).getText();

    }

    private WebElement getProductContainer(String productName) {
        return driver.findElement(By.xpath
                (String.format(itemContainer, productName)
                ));
    }




}
