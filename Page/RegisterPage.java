package com.demo.nopcommerce.Page;

import com.demo.nopcommerce.Utilities.Utils;
import com.sun.java.browser.plugin2.DOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;
    Utils utils;
    By registerLink = By.className("ico-register");
    By gender = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By doB = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By moB = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By yoB = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By emaiLID = By.id("Email");
    By companyName = By.id("Company");
    By passWord = By.id("Password");
    By confirmpass = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");


    public RegisterPage (WebDriver driver){
        this.driver =driver;
        utils = new Utils(driver);
    }

    public void clickOnRegisterLink(){
        utils.doClick(registerLink);
    }

    public void doRegister(String FirstName, String LastName,String DOB,String MOB, String YOB, String Email, String CompanyName, String Password, String ConfirmPassword) throws InterruptedException {
       utils.doClick(gender);
       utils.doSendkey(firstName,FirstName);
       utils.doSendkey(lastName,LastName);
       utils.SelectFromDropdown(doB,DOB);
       utils.SelectFromDropdown(moB,MOB);
       utils.SelectFromDropdown(yoB,YOB);
       Thread.sleep(5000);
       utils.doSendkey(emaiLID, Email);
       utils.doSendkey(companyName,CompanyName);
       utils.doSendkey(passWord,Password);
       utils.doSendkey(confirmpass, ConfirmPassword);
//       utils.doClick(registerButton);
    }
}
