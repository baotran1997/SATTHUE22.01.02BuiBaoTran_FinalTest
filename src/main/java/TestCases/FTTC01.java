package TestCases;

import Common.BaseTest;
import Common.DataFaker;
import Common.Log;
import PageObjects.*;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class FTTC01 extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    MyTicketPage myTicketPage = new MyTicketPage();

    @Test(dataProvider ="getData",description = "User can filter \"Manager ticket\" table with Depart Station")
    public void FTTC01(Object[] data) throws InterruptedException {
        Log.startTestCase("Test case FTTC01");
        String email = DataFaker.generateRandomEmail(data[0].toString());
        String password = data[1].toString();
        String confirmPassword = data[2].toString();
        String passportNumber = data[3].toString();
        String departDate = data[4].toString();
        String departFrom1 = data[5].toString();
        String departFrom2 = data[6].toString();
        String departFrom3 = data[7].toString();
        String departFrom4 = data[8].toString();
        String arriveAt = data[9].toString();
        String seatType = data[10].toString();
        String ticketAmount = data[11].toString();

        Log.info("Pre-condition: Create and activate a new account");
        homePage.navigateToRegisterPage();
        registerPage.registerAccount(email, password, confirmPassword, passportNumber);

        Log.info("Step 1: Navigate from Home page to Login page");
        homePage.navigateToLoginPage();

        Log.info("Step 2: Login with a valid account");
        loginPage.login(email,password);

        Log.info("Step 3: Book more than 6 tickets with different Depart Stations");
        loginPage.navigateToBookTicketPage();

        Log.info("Book ticket 1 with valid info");
        bookTicketPage.bookTicket(departDate,departFrom1,arriveAt,seatType,ticketAmount);

        Log.info("Book ticket 2 with valid info");
        homePage.clickBookTicketTab();
        bookTicketPage.bookTicket(departDate,departFrom2,arriveAt,seatType,ticketAmount);

        Log.info("Book ticket 3 with valid info");
        homePage.clickBookTicketTab();
        bookTicketPage.bookTicket(departDate,departFrom3,arriveAt,seatType,ticketAmount);

        Log.info("Book ticket 4 with valid info");
        homePage.clickBookTicketTab();
        bookTicketPage.bookTicket(departDate,departFrom4,arriveAt,seatType,ticketAmount);

        Log.info("Book ticket 5 with valid info");
        homePage.clickBookTicketTab();
        bookTicketPage.bookTicket(departDate,departFrom1,arriveAt,seatType,ticketAmount);

        Log.info("Book ticket 5 with valid info");
        homePage.clickBookTicketTab();
        bookTicketPage.bookTicket(departDate,departFrom2,arriveAt,seatType,ticketAmount);

        Log.info("Step 4: Click on \"My ticket\" tab");
        bookTicketPage.navigateToMyTicketPage();

        Log.info("Step 5: Select one of booked Depart Station in \"Depart Station\"\n" +
                "dropdown list");
        Log.info("Select Depart Station is Đà Nẵng");
        myTicketPage.selectDepartStationFilter("Đà Nẵng");
        myTicketPage.clickSubmitFilterButton();

        Log.info("Compare Depart Station");
        String actualDepartStation = myTicketPage.getDepartStationResult();
        String expectedDepartStation = "Đà Nẵng";
        Assertions.assertEquals(expectedDepartStation,actualDepartStation);

        Log.endTestCase();
    }
}
