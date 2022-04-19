package PageObjects;

import Common.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTicketPage extends BasePage{
    /**
     * Locators
     */
    public By cancelButtonXpath = By.xpath("//input[@value='Cancel']");
    public By errorMessageForNoTicketXpath = By.xpath("//div[@class='error message']");

    /**
     * Elements
     */
    public WebElement getCancelButtonXpath() {
        return Constants.DRIVER.findElement(cancelButtonXpath);
    }
    public WebElement getErrorMessageForNoTicketXpath() {
        return Constants.DRIVER.findElement(errorMessageForNoTicketXpath);
    }

    /**
     * Methods
     */
}
