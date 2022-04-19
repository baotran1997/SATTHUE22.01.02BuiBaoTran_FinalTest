package PageObjects;

import Common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage {
    /**
     * Locators
     */
    private By timetableTabXpath = By.xpath("//a[@href='TrainTimeListPage.cshtml']");
    private By ticketPriceTabXpath = By.xpath("//a[@href='/Page/TrainPriceListPage.cshtml']");
    private By loginTabXpath = By.xpath("//a[@href='/Account/Login.cshtml']");
    private By bookTicketTabXpath = By.xpath("//a[@href='/Page/BookTicketPage.cshtml']");
    private By contactTabXpath = By.xpath("//a[@href='/Page/Contact.cshtml']");
    private By logoutTabXpath = By.xpath("//a[@href='/Account/Logout']");
    private By registerTabXpath = By.xpath("//a[@href='/Account/Register.cshtml']");
    private By changePasswordTabXpath = By.xpath("//a[@href='/Account/ChangePassword.cshtml']");
    private By myTicketTabXpath = By.xpath("//a[@href='/Page/ManageTicket.cshtml']");

    /**
     * Elements
     */
    public WebElement getTimetableTabXpath() {
        return Constants.DRIVER.findElement(timetableTabXpath);
    }
    public WebElement getTicketPriceTabXpath() {
        return Constants.DRIVER.findElement(ticketPriceTabXpath);
    }
    public WebElement getLoginTabXpath() {
        return Constants.DRIVER.findElement(loginTabXpath);
    }
    public WebElement getBookTicketTabXpath() {
        return Constants.DRIVER.findElement(bookTicketTabXpath);
    }
    public WebElement getContactTabXpath() {
        return Constants.DRIVER.findElement(contactTabXpath);
    }
    public WebElement getLogoutTabXpath() {
        return Constants.DRIVER.findElement(logoutTabXpath);
    }
    public WebElement getRegisterTabXpath() {
        return Constants.DRIVER.findElement(registerTabXpath);
    }
    public WebElement getChangePasswordTabXpath() { return Constants.DRIVER.findElement(changePasswordTabXpath);};
    public WebElement getMyTicketTabXpath() { return Constants.DRIVER.findElement(myTicketTabXpath);};

    /**
     * Methods
     */
}
