package ObjectRepository;

import Functionalities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookTicketPage extends  TestBase{

    public BookTicketPage(WebDriver driver) {
        this.driver = driver;
        //   wait = new WebDriverWait(driver,60);
        util = new Util(driver);
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//label[@for='roundTrip']")
    private WebElement rdRoundTrip;

    @FindBy(xpath = "//label[@for='oneWay']")
    private WebElement rdoneWay;

    @FindBy(xpath = "//label[@for='multiWay']")
    private WebElement rdmultiWay;

    @FindBy(id = "multicityOrigin0")
    WebElement txtMultiOrgin;

    @FindBy(id = "multicityDestination0")
    WebElement txtmulticityDestination;

    @FindBy(id = "oneWayOrigin")
    WebElement txtoneWayOrigin;

    @FindBy(xpath = "//div[@class='origin-typeahead-nds nds']//button[@type='button']")
    WebElement btnorginClose;

    @FindBy(id = "oneWayDestination")
    WebElement txtoneWayDestination;

    @FindBy(xpath = "//div[@class='destination-typeahead-nds nds']//button[@type='button']")
    WebElement btnDesClose;

    @FindBy(id = "oneWayCalendarDepartDate")
    WebElement txtoneWayCalendarDepartDate;

    @FindBy(id = "dd-guest-class-type")
    WebElement txtClassType;

    @FindBy(xpath = " //div[@class='flex-cols inline']//button[@type='button'][normalize-space()='Search flights']")
    WebElement btnSearchFlights;

    @FindBy(id ="oneWayCalendarDepartDate" )
    WebElement txtOutbound;

    @FindBy(xpath = "//button[normalize-space()='Search flights']")
    WebElement btnSearchAgain;

    public void clickonBtnSearchAgain() {
        btnSearchAgain.click();
    }
    public void search_oneWay(String oneWayOrgin,String oneWayDes){

        rdoneWay.click();
        //btnorginClose.click();
       // txtoneWayOrigin.sendKeys(oneWayOrgin);
       // btnDesClose.click();
        txtoneWayDestination.sendKeys(oneWayDes);
        btnSearchFlights.click();
    }
    public void select_outbound(String date){
        txtOutbound.clear();
        txtOutbound.sendKeys(date);
    }

    public void select_cabin(String cabin){
        driver.findElement(By.xpath("//label[normalize-space()='Economy']")).click();
        driver.findElement(By.xpath("//div[normalize-space()='"+cabin+"']")).click();

    }
    public  void select_Guests(int Adult,int childrn,int infant){
        driver.findElement(By.xpath("//label[normalize-space()='1 Adult']")).click();

        for (int i=0;i<Adult;i++) {
            driver.findElement(By.xpath("//button[@id='passenger-type-inc-0']")).click();
        }
        for (int i=0;i<childrn;i++) {
            driver.findElement(By.xpath("//button[@id='passenger-type-inc-1']")).click();
        }
        for (int i=0;i<infant;i++) {
            driver.findElement(By.xpath("//button[@id='passenger-type-inc-2']")).click();
        }

    }

}
