package PageObjects;

import Common.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    /**
     * Locators
     */
    public By usernameXpath = By.id("username");
    public By passwordXpath = By.id("password");
    public By loginButtonXpath = By.xpath("//input[@value='Login']");
    public By errorMessageOfLoginFormXpath = By.xpath("//p[normalize-space()='There was a problem with your login and/or errors exist in your form.']");
    public By errorMessageOfEmailFieldXpath = By.xpath("//label[normalize-space()='You must specify a username.']");
    public By errorMessageOfInvalidFieldsXpath = By.xpath("//p[normalize-space()='Invalid username or password. Please try again.']");


    /**
     * Elements
     */
    public WebElement getUsernameXpath() {
        return Constants.DRIVER.findElement(usernameXpath);
    }
    public WebElement getPasswordXpath() {
        return Constants.DRIVER.findElement(passwordXpath);
    }
    public WebElement getLoginButtonXpath() {
        return Constants.DRIVER.findElement(loginButtonXpath);
    }
    public WebElement getErrorMessageOfLoginFormXpath() {
        return Constants.DRIVER.findElement(errorMessageOfLoginFormXpath);
    }
    public WebElement getErrorMessageOfEmailFieldXpath() {
        return Constants.DRIVER.findElement(errorMessageOfEmailFieldXpath);
    }
    public WebElement getErrorMessageOfInvalidFieldsXpath() {
        return Constants.DRIVER.findElement(errorMessageOfInvalidFieldsXpath);
    }
    /**
     * Methods
     */
}
