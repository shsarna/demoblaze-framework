package pages;

import locators.CartPageElements;
import locators.ProductPageElements;
import org.openqa.selenium.WebElement;
import utils.GetElements;
import utils.SeleniumUtils;

import java.util.ArrayList;
import java.util.List;

import static utils.BaseTest.driver;

public class CartPage {

    GetElements getElements = new GetElements();

    public int getNumberOfProductsInCart() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> listOfWebElements = getElements.findListOfWebElements(driver,"xpath", CartPageElements.productsList);
        SeleniumUtils.waitForVisibilityOfElement(driver,listOfWebElements.get(0));
        return listOfWebElements.size();
    }

    public void clickPlaceOrderButton(){
        getElements.findWebElement(driver,"class", CartPageElements.placeOrderButton).click();
    }
}
