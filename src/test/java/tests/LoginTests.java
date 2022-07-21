package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {

    @Test
    public void positiveLoginTest() {
        loginPage.setUserNameInputValue("standard_user");
        loginPage.setPasswordInputValue("secret_sauce");
        loginPage.clickLoginButton();
        Assert.assertTrue(productsPage.isHeaderContainerDisplayed());

    }

    @Test(dataProvider = "login-test-data")
    public void negativeLoginTest(String username, String password, String expectedMessage) {
        loginPage.setUserNameInputValue(username);
        loginPage.setPasswordInputValue(password);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessageContainerDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(), expectedMessage);

    }
    @DataProvider(name = "login-test-data")
    public Object[][] getNegativeLoginTestData() {
        return new Object[][] {
                {"","secret_sauce","Epic sadface: Username is required"},
                {"standard_user","","Epic sadface: Password is required"},
                {"","","Epic sadface: Username is required"},
                {"locked_out_user","secret_sauce","Epic sadface: Sorry, this user has been locked out."},

        };

    }
}
