package pages;

import locators.LogInPageElements;
import locators.PlaceOrderOverlayElements;
import utils.GetElements;
import static utils.BaseTest.driver;
public class PlaceOrderOverlay {
    GetElements getElements = new GetElements();

    public void enterDetailsAndClickPurchaseButton(String name, String country, String city, String creditCardNumber, String month, String year){
        getElements.findWebElement(driver,"id", PlaceOrderOverlayElements.nameTextBox).sendKeys(name);
        getElements.findWebElement(driver,"id",PlaceOrderOverlayElements.countryTextBox).sendKeys(country);
        getElements.findWebElement(driver,"id",PlaceOrderOverlayElements.cityTextBox).sendKeys(city);
        getElements.findWebElement(driver,"id",PlaceOrderOverlayElements.creditCardTextBox).sendKeys(creditCardNumber);
        getElements.findWebElement(driver,"id",PlaceOrderOverlayElements.monthTextBox).sendKeys(month);
        getElements.findWebElement(driver,"id",PlaceOrderOverlayElements.yearTextBox).sendKeys(year);
        getElements.findWebElement(driver,"css",PlaceOrderOverlayElements.purchaseButton).click();
    }
}
