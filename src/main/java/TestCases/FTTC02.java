package TestCases;

import Common.BaseTest;
import Common.Constants;
import Common.DataFaker;
import Common.Log;
import PageObjects.*;
import org.jetbrains.annotations.NotNull;
import org.testng.annotations.Test;

public class FTTC02 extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    MyTicketPage myTicketPage = new MyTicketPage();

    @Test(dataProvider ="getData", description = "Error displays when user applies filter with invalid format for\n" +
            "\"Depart Date\" in \"Manage ticket\" table")
    public void FTTC02(Object @NotNull [] data) throws InterruptedException {
        Log.startTestCase("Test case FTTC02");
        String email = DataFaker.generateRandomEmail(data[0].toString());
        String password = data[1].toString();
        String confirmPassword = data[2].toString();
        String passportNumber = data[3].toString();
        String departDate = data[4].toString();
        String departFrom = data[5].toString();
        String arriveAt = data[6].toString();
        String seatType = data[7].toString();
        String ticketAmount = data[8].toString();
        Integer repeatTimes = Integer.parseInt(data[9].toString());
        String invalidDepartDate = data[10].toString();

        Log.info("Pre-condition: Create and activate a new account");
        homePage.navigateToRegisterPage();
        registerPage.registerAccount(email, password, confirmPassword, passportNumber);

        Log.info("Step 1: Navigate from Home page to Login page");
        homePage.navigateToLoginPage();

        Log.info("Step 2: Login with a valid account");
        loginPage.login(email,password);

        Log.info("Step 3: Book more than 6 tickets");
        homePage.navigateToBookTicketPage();
        bookTicketPage.repeatBookTicketWithTimes(repeatTimes,departDate,departFrom,arriveAt,seatType,ticketAmount);

        Log.info("Step 4: Click on \"My ticket\" tab");
        bookTicketPage.navigateToMyTicketPage();

        Log.info("Step 5: Enter invalid date into \"Depart Date\". Ex: 4222022");
        myTicketPage.typeDepartDateFilter(invalidDepartDate);

        Log.info("Step 6: Click \"Apply filter\" button");
        myTicketPage.clickSubmitFilterButton();

        Log.info("Expected Behavior:Message \"The date format is wrong, date filter is ignored.\n" +
                "Example of a proper date: Today is <mm/dd/yyyy>\"");
        myTicketPage.checkErrorMessageFilter(Constants.ERROR_MESSAGE_FILTER);

        Log.endTestCase();
    }
}
