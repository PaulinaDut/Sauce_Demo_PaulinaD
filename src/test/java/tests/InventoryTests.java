package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTests extends BaseTest {
    @Test
    public void abc() {
        loginPage.login("standard_user", "secret_sauce");
        String actualPrice= productsPage.getProductPrice(TEST_ITEM_NAME);
        String actualDescription = productsPage.getProductDescription(TEST_ITEM_NAME);
        Assert.assertEquals(actualPrice, "$7.99");
        Assert.assertEquals(actualDescription,
                "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");
        productsPage.clickAddToCardButton(TEST_ITEM_NAME);
        productsPage.openProductDetails(TEST_ITEM_NAME);



    }
}
