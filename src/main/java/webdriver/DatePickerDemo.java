package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerDemo {

    @Test
    public void datepickersdemo(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariasundaram.l\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Calendar.html");

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('datepicker').value=\"03/29/2022\"");

    }
}
