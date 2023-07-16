package pages;

import locators.ProductPageElements;
import utils.GetElements;
import utils.SeleniumUtils;

import static utils.BaseTest.driver;
public class ProductPage {

    GetElements getElements = new GetElements();

    public void clickAddToCartButton(){
        getElements.findWebElement(driver,"css", ProductPageElements.addToCartBuuton).click();
    }

    public Double getProductPrice(){
        String text = getElements.findWebElement(driver,"css", ProductPageElements.priceText).getText();
        System.out.println(text);
        text = text.substring(1,text.indexOf(" "));
        System.out.println(text);
        return Double.parseDouble(text);
    }
}
