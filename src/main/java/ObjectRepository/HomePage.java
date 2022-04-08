package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage  extends TestBase{

    public  HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//img[@class='header-text-logo']")
    private WebElement imgHome;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    private WebElement btnContinue;

    @FindBy(xpath = "//div[@class=\"login-section login-text-section\"]")
    private WebElement btnLogin;

    @FindBy(xpath = "//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")
    private WebElement btnCloseCookieNoti;

    public void ClickOnbtnContinue() {
        btnContinue.click();
    }
    public void ClickOnbtnLogin() {
        btnLogin.click();
    }
    public void ClickOnImgHome() {
        imgHome.click();
    }

    public void Click_On_btnCloseCookieNoti() {
        btnCloseCookieNoti.click();
    }
}
