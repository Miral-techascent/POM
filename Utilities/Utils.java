package com.demo.nopcommerce.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {

    WebDriver driver;
    public Utils (WebDriver driver){
        this.driver =driver;
    }

    public WebElement SelectFromDropdown(By locator , String value){
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
        return element;
    }

    public WebElement getElement(By locator){
        WebElement element =driver.findElement(locator);
        return element;
    }

    public void doSendkey(By locator, String value){
        getElement(locator).sendKeys(value);
    }

    public void doClick(By locator){
        getElement(locator).click();
    }
}
