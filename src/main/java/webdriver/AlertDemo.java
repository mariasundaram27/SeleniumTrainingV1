package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {

    @Test
    public void popupDemo(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariasundaram.l\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");

        WebElement linkok = driver.findElement(By.linkText("Alert with OK"));
        WebElement linkpopOk =driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

        WebElement linkokCancel = driver.findElement(By.linkText("Alert with OK & Cancel"));
        WebElement linkpopOkCancel =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        WebElement linkokText = driver.findElement(By.linkText("Alert with Textbox"));
        WebElement linkpopOkText =driver.findElement(By.xpath("//button[@class='btn btn-info']"));

        //Click on ok button
        linkok.click();
        linkpopOk.click();
        driver.switchTo().alert().accept();

        //Click on ok button
        linkokCancel.click();
        linkpopOkCancel.click();
        driver.switchTo().alert().accept();

        //Click on Cancel button
        linkokCancel.click();
        linkpopOkCancel.click();
        driver.switchTo().alert().dismiss();

        //Enter the text and click ok button
        linkokText.click();
        linkpopOkText.click();
        driver.switchTo().alert().sendKeys("Hello World!");
        driver.switchTo().alert().accept();

    }
}
