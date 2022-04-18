package ObjectRepository;

import Functionalities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends TestBase {

    public  RegisterPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,60);
        util =new Util(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//span[@class='btnValue']")
    private WebElement lstTitlee;

    @FindBy(id="firstName")
    private WebElement txtFistName;

    @FindBy(xpath="//div[@class='control-group eyg-last-name-field']//input[@id='lastName']")
    private WebElement txtLastName;

    @FindBy(id="email")
    private WebElement txtEmailid;

    @FindBy(css ="label[for='termsCondition'] span[class='check']" )
    private WebElement chktermsCondition;

    @FindBy(id="quickFormButton")
    private WebElement btnSignUp;

    @FindBy(xpath="//input[@placeholder='DD']")
    private WebElement txtDay;
    @FindBy(xpath="//input[@placeholder='MM']")
    private WebElement txtMonth;
    @FindBy(xpath="//input[@placeholder='YYYY']")
    private WebElement txtYear;

    public void select_lstTitle(String title){
        lstTitlee.click();
        driver.findElement(By.id("eygList"+title)).click();
    }

    public void enter_firstname(String firstname){
        txtFistName.clear();
        txtFistName.sendKeys(firstname);
        txtFistName.sendKeys(Keys.TAB);
    }

    public void enter_lastname(String lastname){
        txtLastName.clear();
        txtLastName.sendKeys(lastname);
        txtLastName.sendKeys(Keys.TAB);

    }
    public  void select_dateOfBirth(String date){
        txtDay.clear();
        txtMonth.clear();
        txtYear.clear();

        String [] str = date.split("/");
        txtDay.sendKeys(str[0]);
        txtMonth.sendKeys(str[1]);
        txtYear.sendKeys(str[2]);
    }

    public void enter_Emailid(String email){
        txtEmailid.clear();
        txtEmailid.sendKeys(email);
        txtEmailid.sendKeys(Keys.TAB);
    }

    public void check_chktermsCondition(){
       // driver.findElement(By.cssSelector("label[for='termsCondition'] span[class='check']")).click();
        driver.findElement(By.cssSelector("label[for='termsCondition'] span[class='check checkbox-outline']")).click();
    }

    public void click_btnSignUp(){
        btnSignUp.click();
    }


}
