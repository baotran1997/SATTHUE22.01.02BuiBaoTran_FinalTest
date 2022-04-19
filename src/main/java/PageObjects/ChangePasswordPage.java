package PageObjects;

import Common.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends BasePage{
    /**
     * Locators
     */
    private By currentPasswordXpath = By.xpath("//input[@id='currentPassword']");
    private By newPasswordXpath = By.xpath("//input[@id='newPassword']");
    private By confirmPasswordXpath = By.xpath("//input[@id='confirmPassword']");
    private By changePasswordButtonXpath = By.xpath("//input[@title='Change password']");
    private By errorMessageOfConfirmPasswordXpath = By.xpath("//label[normalize-space()='The password confirmation does not match the new password.']");
    private By errorMessageOfChangePasswordFormXpath = By.xpath("//p[@class='message error']");

    /**
     * Elements
     */
    public WebElement getCurrentPasswordXpath() { return Constants.DRIVER.findElement(currentPasswordXpath);}
    public WebElement getNewPasswordXpath() { return Constants.DRIVER.findElement(newPasswordXpath);}
    public WebElement getConfirmPasswordXpath() { return Constants.DRIVER.findElement(confirmPasswordXpath);}
    public WebElement getChangePasswordButtonXpath() { return Constants.DRIVER.findElement(changePasswordButtonXpath);}
    public WebElement getErrorMessageOfConfirmPasswordXpath() { return Constants.DRIVER.findElement(errorMessageOfConfirmPasswordXpath);}
    public WebElement getErrorMessageOfChangePasswordFormXpath() { return Constants.DRIVER.findElement(errorMessageOfChangePasswordFormXpath);}

    /**
     * Methods
     */
}
