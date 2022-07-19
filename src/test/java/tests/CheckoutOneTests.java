package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutOneTests extends BaseTest{
    private final String TEST_ITEM_NAME = "Sauce Labs Onesie";
    @Test
    public void checkoutOnePositiveTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        cartPage.clickCheckoutButton();
        checkoutOnePage.checkoutOneForm("Berry", "Smith", "12345");
        Assert.assertTrue(checkoutTwoPage.finishButtonIsDisplayed());

    }
    @Test
    public void checkoutOneNegativeTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        cartPage.clickCheckoutButton();
        checkoutOnePage.clickContinueButton();
        String expectedErrorMessageText = "Error: First Name is required";
        Assert.assertTrue(checkoutOnePage.isErrorMessageContainerDisplayed());
        Assert.assertEquals(checkoutOnePage.getErrorMessage(), expectedErrorMessageText);
        checkoutOnePage.clickCancelButton();
        cartPage.clickRemoveButton();
    }

}
