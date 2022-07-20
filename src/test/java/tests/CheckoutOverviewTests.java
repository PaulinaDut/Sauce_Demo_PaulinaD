package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutOverviewTests extends BaseTest {
    @Test
    public void checkoutOverviewTest() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        cartPage.clickCheckoutButton();
        checkoutYourInformationPage.checkoutYourInformationForm("Berry", "Smith", "12345");
        checkoutOverviewPage.clickFinishButton();
        Assert.assertTrue(checkoutCompletePage.thankYouTextIsDisplayed());


    }


}
