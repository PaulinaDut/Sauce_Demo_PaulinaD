package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {
    @Test
    public void removeItemFromTheCart() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.clickShoppingCartLink();
        String actualDescription = cartPage.getCartProductDescription(TEST_ITEM_NAME);
        Assert.assertEquals(actualDescription,
                "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");
        cartPage.clickRemoveButton();
        cartPage.clickContinueShoppingButton();
        Assert.assertTrue(productsPage.isHeaderContainerDisplayed());




    }
}
