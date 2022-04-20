package PageObjects;

import Common.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage extends BasePage{
    /**
     * Locators
     */
    private By departDateSelectionXpath = By.xpath("//select[@name='Date']");
    private By departFromSelectionXpath = By.xpath("//select[@name='DepartStation']");
    private By arriveAtSelectionXpath = By.xpath("//select[@name='ArriveStation']");
    private By seatTypeSelectionXpath = By.xpath("//select[@name='SeatType']");
    private By ticketAmountSelectionXpath = By.xpath("//select[@name='TicketAmount']");
    private By bookTicketButtonXpath = By.xpath("//input[@value='Book ticket']");
    private By bookTicketSuccessfullyMessageXpath = By.xpath("//h1[normalize-space()='Ticket Booked Successfully!']");
    private By departStationResultXpath = By.xpath("//td[count(//th[text()='Depart Station']/preceding-sibling::th)+1]");
    private By arriveStationResultXpath = By.xpath("//td[count(//th[text()='Arrive Station']/preceding-sibling::th)+1]");
    private By seatTypeResultXpath = By.xpath("//td[count(//th[text()='Seat Type']/preceding-sibling::th)+1]");
    private By departDateResultXpath = By.xpath("//td[count(//th[text()='Depart Date']/preceding-sibling::th)+1]");
    private By ticketAmountResultXpath = By.xpath("//td[count(//th[text()='Amount']/preceding-sibling::th)+1]");

    /**
     * Elements
     */
    public WebElement getDepartDateSelectionXpath() {
        return Constants.DRIVER.findElement(departDateSelectionXpath);
    }
    public WebElement getDepartFromSelectionXpath() {
        return Constants.DRIVER.findElement(departFromSelectionXpath);
    }
    public WebElement getArriveAtSelectionXpath() {
        return Constants.DRIVER.findElement(arriveAtSelectionXpath);
    }
    public WebElement getSeatTypeSelectionXpath() {
        return Constants.DRIVER.findElement(seatTypeSelectionXpath);
    }
    public WebElement getTicketAmountSelectionXpath() {
        return Constants.DRIVER.findElement(ticketAmountSelectionXpath);
    }
    public WebElement getBookTicketButtonXpath() {
        return Constants.DRIVER.findElement(bookTicketButtonXpath);
    }
    public WebElement getBookTicketSuccessfullyMessageXpath() {
        return Constants.DRIVER.findElement(bookTicketSuccessfullyMessageXpath);
    }
    public WebElement getDepartStationResultXpath() {
        return Constants.DRIVER.findElement(departStationResultXpath);
    }
    public WebElement getArriveStationResultXpath() {
        return Constants.DRIVER.findElement(arriveStationResultXpath);
    }
    public WebElement getSeatTypeResultXpath() {
        return Constants.DRIVER.findElement(seatTypeResultXpath);
    }
    public WebElement getDepartDateResultXpath() {
        return Constants.DRIVER.findElement(departDateResultXpath);
    }
    public WebElement getTicketAmountResultXpath() {
        return Constants.DRIVER.findElement(ticketAmountResultXpath);
    }

    /**
     * Methods
     */
    public void selectDepartDate(String departDate) throws InterruptedException {
        Select departDateSelection = new Select(getDepartDateSelectionXpath());
        departDateSelection.selectByVisibleText(departDate);
    }
    public void selectDepartFrom(String departFrom) {
        Select departFromSelection = new Select(getDepartFromSelectionXpath());
        departFromSelection.selectByVisibleText(departFrom);
    }
    public void selectArriveAt(String arriveAt) {
        Select arriveAtSelection = new Select(getArriveAtSelectionXpath());
        arriveAtSelection.selectByVisibleText(arriveAt);
    }
    public void selectSeatType(String seatType) {
        Select seatTypeSelection = new Select(getSeatTypeSelectionXpath());
        seatTypeSelection.selectByVisibleText(seatType);
    }
    public void selectTicketAmount(String ticketAmount) {
        Select ticketAmountSelection = new Select(getTicketAmountSelectionXpath());
        ticketAmountSelection.selectByVisibleText(ticketAmount);
    }
    public void clickBookTicketButton() {
        getBookTicketButtonXpath().click();
    }
    public void bookTicket(String departDate, String departFrom, String arriveAt, String seatType, String ticketAmount) throws InterruptedException {
        selectDepartDate(departDate);
        selectDepartFrom(departFrom);
        selectArriveAt(arriveAt);
        selectSeatType(seatType);
        selectTicketAmount(ticketAmount);
        BasePage.scrollDown();
        clickBookTicketButton();
    }

    public void repeatBookTicketWithTimes(Integer times, String departDate, String departFrom, String arriveAt, String seatType, String ticketAmount) throws InterruptedException {
        for (int i = 0; i < times; i++) {
            bookTicket(departDate, departFrom, arriveAt, seatType, ticketAmount);
            BasePage.clickBookTicketTab();
        }
    }
}
