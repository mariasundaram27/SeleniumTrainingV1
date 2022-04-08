package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends TestBase {

    public  RegisterPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath="//span[@class='btnValue']")
    private WebElement lstTitlee;

    @FindBy(id="firstName")
    private WebElement txtFistName;

    @FindBy(id="lastName")
    private WebElement txtLastName;

    @FindBy(id="email")
    private WebElement txtEmailid;

    @FindBy(xpath="//label[@for='termsCondition']//span[@class='check']")
    private WebElement chktermsCondition;

    @FindBy(id="quickFormButton")
    private WebElement btnSignUp;

    public void select_lstTitle(String title){

    }

    public void enter_firstname(String firstname){
        txtFistName.clear();
        txtFistName.click();
    }

    public void enter_lastname(String lastname){
        txtLastName.clear();
        txtLastName.click();
    }

    public void enter_Emailid(String email){
        txtEmailid.clear();
        txtEmailid.click();
    }

    public void check_chktermsCondition(){
        chktermsCondition.click();
    }

    public void click_btnSignUp(){
        btnSignUp.click();
    }


}
