package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutCompleteTests extends BaseTest{
    private final String TEST_ITEM_NAME = "Sauce Labs Onesie";
    @Test
    public void backHomeOnCompleteCheckoutTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        cartPage.clickCheckoutButton();
        checkoutOnePage.checkoutOneForm("Berry", "Smith", "12345");
        checkoutTwoPage.clickFinishButton();
        checkoutCompletePage.clickBackHomeButton();
        Assert.assertTrue(productsPage.isHeaderContainerDisplayed());
    }
}
