import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.Constants;
import utils.SeleniumUtils;

public class UI_Tests extends BaseTest {

    public void signIn(){
        homePage.clickLoginButton();
        logInPage.enterCredentialsAndSignIn(username,password);
    }

    @Test
    public void uiTestScenario() throws InterruptedException {
        signIn();
        driver.navigate().refresh();
        homePage.selectProductByText(Constants.iPhone6_32GB);
        Assert.assertEquals(homePage.getPageTitle(),Constants.iPhone6_32GB,
                "Failed!!!: User is Not on "+Constants.iPhone6_32GB+" Page");
        Double iphonePrice = productPage.getProductPrice();
        productPage.clickAddToCartButton();
        SeleniumUtils.switchToAlertAndAccept(driver);
        homePage.goToHome();
        homePage.selectProductCategoryByName("Monitors");

        homePage.selectProductByText(Constants.asus_fullHD_monitor);
        Double monitorPrice = productPage.getProductPrice();
        Assert.assertEquals(homePage.getPageTitle(),Constants.asus_fullHD_monitor,
                "Failed!!!: User is Not on "+Constants.asus_fullHD_monitor+" Page");
        productPage.clickAddToCartButton();
        SeleniumUtils.switchToAlertAndAccept(driver);
        driver.navigate().refresh();
        homePage.goToCart();
        Assert.assertEquals(cartPage.getNumberOfProductsInCart(),2,
                "Failed!!!: Cart contains wrong number of products");
        cartPage.clickPlaceOrderButton();
        placeOrderOverlay.enterDetailsAndClickPurchaseButton(
                Constants.name,
                Constants.country,
                Constants.city,
                Constants.cardNumber,
                Constants.month,
                Constants.year);
        Assert.assertEquals(orderConfirmationOverlay.getConfirmationMessage(),Constants.successMsg,
                "Failed!! user is not getting order placed successful message");
        Assert.assertTrue(orderConfirmationOverlay.getOrderDetails().contains(Constants.cardNumber),
                "Failed!! Card number is not correct in order details");
        Assert.assertTrue(orderConfirmationOverlay.getOrderDetails().contains(Constants.name),
                "Failed!! User name is not correct in order details");

    }

}
