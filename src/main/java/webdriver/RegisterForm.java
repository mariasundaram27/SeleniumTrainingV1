package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;

public class RegisterForm {

    //C:\Users\mariasundaram.l\Documents\chromedriver_win32\chromedriver.exe

    @Test
    public void register() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariasundaram.l\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");

        WebElement txtfname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        WebElement txtlname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        WebElement txtaddress = driver.findElement(By.tagName("textarea"));
        WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement txtphone = driver.findElement(By.xpath("//input[@type='tel']"));
        WebElement rdMale = driver.findElement(By.xpath("//input[@value='Male']"));
        WebElement rdFeMale = driver.findElement(By.xpath("//input[@value='Male']"));
        WebElement chkhobCricket = driver.findElement(By.id("checkbox1"));
        WebElement lstLanguages = driver.findElement(By.id("msdd"));
        Select lstSkills = new Select(driver.findElement(By.id("Skills")));
        Select lstCountry = new Select(driver.findElement(By.id("countries")));
        WebElement selCountry = driver.findElement(By.xpath("//span[@role='combobox']"));
        Select lstyear = new Select(driver.findElement(By.id("yearbox")));
        Select lstmonth = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        Select lstday = new Select(driver.findElement(By.id("daybox")));
        WebElement txtpasswd = driver.findElement(By.id("firstpassword"));
        WebElement txtConfpasswd = driver.findElement(By.id("secondpassword"));
        WebElement btnSubmit = driver.findElement(By.id("submitbtn"));
        WebElement btnRefresh = driver.findElement(By.id("Button1"));
        WebElement txtcountry;
        WebElement lnkEnglish;
        WebElement lnkCzech;


        txtfname.sendKeys("Mariasundaram");
        txtlname.sendKeys("Lawrence");
        txtaddress.sendKeys("bangalore.KA -68");
        txtemail.sendKeys("mariasundaram.l@hcl.com");
        txtphone.sendKeys("1235323233");
        rdMale.click();
        chkhobCricket.click();
        lstLanguages.click();
        lnkEnglish = driver.findElement(By.linkText("English"));
        lnkEnglish.click();
        lstLanguages.click();
        lnkCzech = driver.findElement(By.linkText("Czech"));
        lnkCzech.click();
        lstSkills.selectByVisibleText("Android");
        lstCountry.selectByIndex(0);
        selCountry.click();

        List <WebElement> option = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
        for (WebElement opt:option) {
            if (opt.getText().equals("India")) {
                opt.click();
                break;
            }
        }

        lstyear.selectByValue("2000");
        lstmonth.selectByValue("May");
        lstday.selectByValue("13");
        txtpasswd.sendKeys("test123");
        txtConfpasswd.sendKeys("test123");
        btnSubmit.click();
        btnRefresh.click();

    }
}
