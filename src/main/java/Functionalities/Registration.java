package Functionalities;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Iterator;
import java.util.Set;

public class Registration extends TestBase {

    @Test
    public void entrollment() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Blessie\\SeleniumTrainingv2\\SeleniumTraining\\driver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.etihad.com/en-in/");
        driver.manage().window().maximize();

        LoginPage loginPage =new LoginPage(driver);
        HomePage homePage =new HomePage(driver);

        homePage.Click_On_btnCloseCookieNoti();
        homePage.ClickOnbtnContinue();
        homePage.ClickOnbtnLogin();
        Thread.sleep(500);
        loginPage.click_on_lnkJoinGuest();

        Set<String> Windowhandle = driver.getWindowHandles();
        Iterator<String> itr= Windowhandle.iterator();
        String w1 = itr.next();
        String w2=itr.next();
        driver.switchTo().window(w2);

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.select_lstTitle("Mr");
        registerPage.enter_firstname("maria");
        Thread.sleep(500);
        registerPage.enter_lastname("lawrence");
        registerPage.select_dateOfBirth("27/12/1987");
        registerPage.enter_Emailid("mariasundaram@gmail.com");
        registerPage.check_chktermsCondition();
        Thread.sleep(1000);
        registerPage.click_btnSignUp();

    }
}
