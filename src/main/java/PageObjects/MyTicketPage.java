package PageObjects;

import Common.Constants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyTicketPage extends BasePage{
    /**
     * Locators
     */
    public By cancelButtonXpath = By.xpath("//input[@value='Cancel']");
    public By errorMessageForNoTicketXpath = By.xpath("//div[@class='error message']");
    public By departDateFilterXpath = By.xpath("//input[@name='FilterDpDate']");
    public By departStationFilterXpath = By.xpath("//td/select[@name='FilterDpStation']");
    public By submitFilterButtonXpath = By.xpath("//input[@value='Apply Filter']");
    public By errorMessageFilterXpath = By.xpath("//div[contains(text(), 'The date format is wrong, date filter is ignored')]");
    public By departStationResultXpath = By.xpath("//tr/td[count(//th[text()='Depart Station']/preceding-sibling::th) + 1][text()='Đà Nẵng']");
    /**
     * Elements
     */
    public WebElement getCancelButtonXpath() {
        return Constants.DRIVER.findElement(cancelButtonXpath);
    }
    public WebElement getErrorMessageForNoTicketXpath() {
        return Constants.DRIVER.findElement(errorMessageForNoTicketXpath);
    }
    public WebElement getDepartDateFilterXpath () {return Constants.DRIVER.findElement(departDateFilterXpath);};
    public WebElement getDepartStationFilterXpath () {return Constants.DRIVER.findElement(departStationFilterXpath);};
    public WebElement getSubmitFilterButtonXpath () {
        return Constants.DRIVER.findElement(submitFilterButtonXpath);
    }
    public WebElement getErrorMessageFilterXpath() {
        return Constants.DRIVER.findElement(errorMessageFilterXpath);
    }
    public WebElement getDepartStationResultXpath() {
        return Constants.DRIVER.findElement(departStationResultXpath);
    }
    /**
     * Methods
     */
    public void typeDepartDateFilter (String departDate) {
        getDepartDateFilterXpath().sendKeys(departDate);
    }
    public void clickSubmitFilterButton() {
        getSubmitFilterButtonXpath().click();
    }
    public String getErrorMessageFilter() {
       return getErrorMessageFilterXpath().getText();
    }
    public void checkErrorMessageFilter(String errorMessageFilter) {
        String expectedErrorMessageFilter = errorMessageFilter;
        String actualErrorMessageFilter = getErrorMessageFilter();

        Assertions.assertEquals(expectedErrorMessageFilter,actualErrorMessageFilter);
    }

    public void selectDepartStationFilter(String departStation) throws InterruptedException {
        Select departStationSelection = new Select(getDepartStationFilterXpath());
        departStationSelection.selectByVisibleText(departStation);
    }

    public String getDepartStationResult() {
        return getDepartStationResultXpath().getText();
    }

}
