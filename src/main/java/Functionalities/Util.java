package Functionalities;

import ObjectRepository.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends TestBase {

    public Util(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver,60);
    }

    public void selectByVisibleText(WebElement element,String textvalue){
        Select select=new Select(element);
        select.selectByVisibleText(textvalue);
    }
    public void deselectAll(WebElement element){
        Select select=new Select(element);
        select.deselectAll();
    }
    public void scrollInView(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoViewIfNeeded()", element);

    }
    public void scrollInViewAndClick(WebElement element){
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoViewIfNeeded()",element);
        element.click();
    }
    public void selectDatepicker(String date){
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('caretDatePicker').value=\"03/29/2002\"");
    }


}
