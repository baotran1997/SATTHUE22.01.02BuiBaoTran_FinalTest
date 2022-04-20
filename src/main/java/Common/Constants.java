package Common;

import org.openqa.selenium.WebDriver;

import java.lang.*;

public class Constants {
    public static WebDriver DRIVER;
    public static String BROWSER = "";

    public static String HOME_PAGE_URL = "http://www.raillog.somee.com/Page/HomePage.cshtml";
    public static String ERROR_MESSAGE_FILTER = "The date format is wrong, date filter is ignored.\n" +
            "Example of a proper date: Today is 4/19/2022";
}
