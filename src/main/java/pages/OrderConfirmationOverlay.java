package pages;

import locators.OrderConfirmationOverlayElements;
import locators.PlaceOrderOverlayElements;
import utils.GetElements;

import static utils.BaseTest.driver;

public class OrderConfirmationOverlay {
    GetElements getElements = new GetElements();

    public String getConfirmationMessage (){
        return getElements.findWebElement(driver,"css", OrderConfirmationOverlayElements.message).getText();
    }

    public String getOrderDetails (){
        return getElements.findWebElement(driver,"css", OrderConfirmationOverlayElements.orderDetails).getText();
    }

}
