package Functionalities;

import ObjectRepository.TestBase;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends TestBase {

    @Before
    public void LaunchBrower() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Blessie\\SeleniumTrainingv2\\SeleniumTraining\\driver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.etihad.com/en-in/");
        driver.manage().window().maximize();
    }

}
