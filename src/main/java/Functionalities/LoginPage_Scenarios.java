package Functionalities;


import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_Scenarios {

    @Test
    public void Login_Valid(){

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

        loginPage.enter_username("mariasundaram@gmail.com");
        loginPage.enter_password("Lydia@1304");
        loginPage.click_on_btnlogin();
        System.out.println("Login Success");
    }
}
