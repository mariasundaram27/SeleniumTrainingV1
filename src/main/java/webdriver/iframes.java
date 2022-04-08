package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class iframes {

    @Test
    public void framesDemo() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariasundaram.l\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");

       //Single Frame
        WebElement lnkbutton = driver.findElement(By.linkText("Single Iframe"));
        lnkbutton.click();
        driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello world!");;

        //Multiple Frames
        driver.switchTo().defaultContent();
        WebElement lnkFrmbutton = driver.findElement(By.linkText("Iframe with in an Iframe"));
        lnkFrmbutton.click();
        WebElement eleframe12 = driver.findElement(By.xpath("//*[@src=\"MultipleFrames.html\"]"));
        driver.switchTo().frame(eleframe12);
        WebElement eleframe1 = driver.findElement(By.xpath("//*[@src=\"SingleFrame.html\"]"));
        driver.switchTo().frame(eleframe1);
        WebElement txtele = driver.findElement(By.xpath("//input[@type='text']"));
        txtele.sendKeys("hello ! inside frame");

    }
}
