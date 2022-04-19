package PageObjects;

import Common.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    /**
     * Locators
     */
    private By welcomeUserMessageXpath = By.xpath("//div[@class='account']//descendant::strong");
    private By logoutTabXpath = By.xpath("//span[text()='Log out']");
    /**
     * Elements
     */
    public WebElement getWelcomeUserMessageXpath() {
        return Constants.DRIVER.findElement(welcomeUserMessageXpath);
    }
    public WebElement getLogoutTabXpath() {
        return Constants.DRIVER.findElement(logoutTabXpath);
    }

    /**
     * Methods
     */
}
