package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemoB {
    @Test
    public void actiondemosB(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariasundaram.l\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/mouseOver.html");

    }
}
