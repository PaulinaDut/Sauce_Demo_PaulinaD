package tests;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTwoTests extends BaseTest {
    private final String TEST_ITEM_NAME = "Sauce Labs Onesie";
    @Test
    public void checkoutTwoTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        cartPage.clickCheckoutButton();
        checkoutOnePage.checkoutOneForm("Berry", "Smith", "12345");
        checkoutTwoPage.clickFinishButton();
        Assert.assertTrue(checkoutCompletePage.thankYouTextIsDisplayed());


    }


}
