package pages;

import locators.HomePageElements;
import org.openqa.selenium.WebElement;
import utils.GetElements;
import utils.SeleniumUtils;

import static utils.BaseTest.driver;

public class HomePage {
    GetElements getElements = new GetElements();

    public void clickLoginButton(){
        getElements.findWebElement(driver, "css",HomePageElements.loginButton).click();
    }

    public void goToHome(){
        getElements.findWebElement(driver, "css",HomePageElements.homeButton).click();
    }
    public void goToCart(){
        getElements.findWebElement(driver, "id",HomePageElements.cartButton).click();
    }

    public void selectProductByText(String productName){

        getElements.findWebElement(driver,"xpath","//a[text()='"+productName+"']").click();
    }

    public void selectProductCategoryByName(String productCategory){
        getElements.findWebElement(driver,"xpath","//a[text()='"+productCategory+"']").click();
    }

    public String getPageTitle(){
        return getElements.findWebElement(driver,"css", "h2.name").getText();
    }

}
