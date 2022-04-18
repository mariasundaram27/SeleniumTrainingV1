package Functionalities;

import ObjectRepository.BookTicketPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookingTicket {

    @Test
    public void bookingticketdetails () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Blessie\\SeleniumTrainingv2\\SeleniumTraining\\driver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.etihad.com/en-in/");
        driver.manage().window().maximize();

        LoginPage loginPage =new LoginPage(driver);
        HomePage homePage =new HomePage(driver);

        homePage.Click_On_btnCloseCookieNoti();
        homePage.ClickOnbtnContinue();
        BookTicketPage bookTicketPage = new BookTicketPage(driver);
        bookTicketPage.search_oneWay("Kolkata, CCU","London, LHR");
        Thread.sleep(2000);
        bookTicketPage.select_outbound("15/06/2022");
        bookTicketPage.select_cabin("Business");
        bookTicketPage.select_Guests(2,0,0);
        bookTicketPage.clickonBtnSearchAgain();

    }
}
