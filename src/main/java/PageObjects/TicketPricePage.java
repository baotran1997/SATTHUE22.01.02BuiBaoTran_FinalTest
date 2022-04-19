package PageObjects;

import Common.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class TicketPricePage {
    /**
     * Locators
     */
    private By xpathTicketPriceForHS = By.xpath("//table[@class='MyTable MedTable']//td[count(//td[text()='HS']/preceding-sibling::td) + 1][text()='90000']");
    private By xpathTicketPriceForSS = By.xpath("//table[@class='MyTable MedTable']//td[count(//td[text()='SS']/preceding-sibling::td) + 1][text()='115000']");
    private By xpathTicketPriceForSSC = By.xpath("//table[@class='MyTable MedTable']//td[count(//td[text()='SSC']/preceding-sibling::td) + 1][text()='140000']");
    private By xpathTicketPriceForHB = By.xpath("//table[@class='MyTable MedTable']//td[count(//td[text()='HB']/preceding-sibling::td) + 1][text()='190000']");
    private By xpathTicketPriceForSB = By.xpath("//table[@class='MyTable MedTable']//td[count(//td[text()='SB']/preceding-sibling::td) + 1][text()='240000']");
    private By xpathTicketPriceForSBC = By.xpath("//table[@class='MyTable MedTable']//td[count(//td[text()='SBC']/preceding-sibling::td) + 1][text()='290000']");

    /**
     * Elements
     */
    public WebElement getXpathTicketPriceForHS() {
        return Constants.DRIVER.findElement(xpathTicketPriceForHS);
    }
    public WebElement getXpathTicketPriceForSS() {
        return Constants.DRIVER.findElement(xpathTicketPriceForSS);
    }
    public WebElement getXpathTicketPriceForSSC() {
        return Constants.DRIVER.findElement(xpathTicketPriceForSSC);
    }
    public WebElement getXpathTicketPriceForHB() {
        return Constants.DRIVER.findElement(xpathTicketPriceForHB);
    }
    public WebElement getXpathTicketPriceForSB() {
        return Constants.DRIVER.findElement(xpathTicketPriceForSB);
    }
    public WebElement getXpathTicketPriceForSBC() {
        return Constants.DRIVER.findElement(xpathTicketPriceForSBC);
    }

    /**
     * Methods
     */
}
