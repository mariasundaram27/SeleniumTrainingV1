package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionDemoA {

    @Test
    public void actiondemosA(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariasundaram.l\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/drop.html");

        WebElement dragbox = driver.findElement(By.id("draggable"));
        WebElement dropbox =driver.findElement(By.id("droppable"));

        Actions dragAction = new Actions(driver);

        dragAction.dragAndDrop(dragbox,dropbox).build().perform();


    }
}
