package ObjectRepository;

import Functionalities.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LoginPage extends TestBase {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        //   wait = new WebDriverWait(driver,60);
        util = new Util(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "guestNumber")
    private WebElement txtUsername;

    @FindBy(id = "guestPassword")
    private WebElement txtPasswd;

    @FindBy(id = "guestLoginFormSubmit")
    private WebElement btnGuestLogIn;

    @FindBy(xpath = "//a[@href=\"https://etihadguest.com/en/join.html?&_linkNav=Join\"]")
    private WebElement lnkJoinGuest;

    @FindBy(linkText = "Forgot your password?")
    private WebElement lnkForgotPassword;

    @FindBy(xpath = "//div[@class=\"notification-child-message-nds\"]")
    private WebElement Errmsg;

    public void enter_username(String username) {
        txtUsername.clear();
        txtUsername.sendKeys(username);
    }

    public void enter_password(String password) {
        txtPasswd.clear();
        txtPasswd.sendKeys(password);
    }

    public void click_on_btnlogin() {
        btnGuestLogIn.click();
    }

    public void click_on_lnkJoinGuest() {
        util.scrollInView(lnkJoinGuest);
        lnkJoinGuest.click();
    }

    public void click_on_lnkForgotPassword() {
        lnkForgotPassword.click();
    }

    public void VerifyMessage(String msg) {
        String txtmsg = Errmsg.getText();
        Assert.assertEquals(txtmsg, msg);
    }


}
