package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Iterator;
import java.util.Set;

public class windowsDemo {

    @Test
    public void windowsdemos(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariasundaram.l\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");


        driver.findElement(By.xpath("//a[@href=\"http://www.selenium.dev\"]")).click();
        Set<String> Windowhandle = driver.getWindowHandles();
        Iterator<String> itr= Windowhandle.iterator();
        String w1 = itr.next();
        String w2=itr.next();

        System.out.println("Open New Tabbed Windows");
        driver.switchTo().window(w1);
        System.out.println("Window Title:"+driver.getTitle());
        driver.switchTo().window(w2);
        System.out.println("Window Title:"+driver.getTitle());
        driver.switchTo().window(w2).close();

        driver.switchTo().window(w1);
        System.out.println("Open New Separate Windows");
        driver.findElement(By.xpath("//a[@href=\"#Seperate\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
        Set<String> Windowhandle1 = driver.getWindowHandles();
        Iterator<String> itr1= Windowhandle1.iterator();
        String w11 = itr1.next();
        String w12=itr1.next();

        driver.switchTo().window(w11);
        System.out.println("Window Title:"+driver.getTitle());
        driver.switchTo().window(w12);
        System.out.println("Window Title:"+driver.getTitle());
        driver.switchTo().window(w12).close();

        driver.switchTo().window(w11);
        System.out.println("Open New Multiple Windows");
        driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();

        driver.findElement(By.xpath("//button[@onclick=\"multiwindow()\"]")).click();
        Set<String> Windowhandle2 = driver.getWindowHandles();
        Iterator<String> itr2= Windowhandle2.iterator();
        String w21 = itr2.next();
        String w22=itr2.next();
        String w23=itr2.next();

        driver.switchTo().window(w21);
        System.out.println("Window Title:"+driver.getTitle());
        driver.switchTo().window(w22);
        System.out.println("Window Title:"+driver.getTitle());
        driver.switchTo().window(w23);
        System.out.println("Window Title:"+driver.getTitle());

    }
}
