package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Page.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class RegisterTest {

    BasePage basePage;
    Properties prop;
    WebDriver driver;
    RegisterPage registerPage;

    @BeforeClass
    public void openBrowser() throws IOException {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }

    @Test
    public void registerTest() throws InterruptedException {
        registerPage.clickOnRegisterLink();

        registerPage.doRegister(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("dob"),prop.getProperty("mob"),prop.getProperty("yob"),
        prop.getProperty("email"),prop.getProperty("companyname"),prop.getProperty("password"),prop.getProperty("confirmpassword"));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
