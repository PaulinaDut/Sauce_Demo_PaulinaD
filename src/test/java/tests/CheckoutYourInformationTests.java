package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutYourInformationTests extends BaseTest{
    @Test
    public void checkoutYourInformationPositiveTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        cartPage.clickCheckoutButton();
        checkoutYourInformationPage.checkoutYourInformationForm("Berry", "Smith", "12345");
        Assert.assertTrue(checkoutOverviewPage.finishButtonIsDisplayed());

    }
    @Test
    public void checkoutYourInformationNegativeTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        cartPage.clickCheckoutButton();
        checkoutYourInformationPage.clickContinueButton();
        String expectedErrorMessageText = "Error: First Name is required";
        Assert.assertTrue(checkoutYourInformationPage.isErrorMessageContainerDisplayed());
        Assert.assertEquals(checkoutYourInformationPage.getErrorMessage(), expectedErrorMessageText);
        checkoutYourInformationPage.clickCancelButton();
        cartPage.clickRemoveButton();
    }

}
