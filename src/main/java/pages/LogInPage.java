package pages;

import locators.LogInPageElements;
import utils.GetElements;

import static utils.BaseTest.driver;

public class LogInPage {
    GetElements getElements = new GetElements();

    public void enterCredentialsAndSignIn(String username, String password){
        getElements.findWebElement(driver,"id", LogInPageElements.usernameTextBox).sendKeys(username);
        getElements.findWebElement(driver,"id",LogInPageElements.passwordTextBox).sendKeys(password);
        getElements.findWebElement(driver,"xpath",LogInPageElements.loginInButton).click();
    }
}
