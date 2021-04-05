

import Web.webElement;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.*;

import java.util.concurrent.TimeUnit;

import org.jboss.aerogear.security.otp.Totp;
import  java.security.MessageDigest;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.seleniumhq.jetty9.util.security.Credential;

import static org.junit.Assert.*;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class FirstTest {

@Test


    public void testLoginCorrectly() throws InterruptedException {
        // declaration and instantiation of objects/variables

    ChromeOptions options = new ChromeOptions();

    options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
    options.addArguments("--disable-notifications");


    System.setProperty("webdriver.chrome.driver", "C://SeleniumWebDrivers//ChromeDriver//chromedriver-89.exe");


    WebDriver driver = new ChromeDriver(options);

    // Launch website
        driver.navigate().to("https://is-il.creatio.com/Login/TOTPLogin.aspx?ReturnUrl=%2f");
        // Click on login text box and send value....

        driver.manage().window().maximize();


        String otpKeyStr = decoded2FA("S0xPWVdCQ1FDSlZYT1BSN1FOR0E3QVZZR0RUSEVHTEI="); // <- this 2FA secret key.

        Totp totp = new Totp(otpKeyStr);
        String twoFactorCode = totp.now();


        Thread.sleep(4000);


        String userName = decodedUsername("bmF0aWRAaXJvYWRzLmNvLmls");


        String passWord = decodedPassword("QWExMjM0NTY3");


        WebDriverWait wait = new WebDriverWait(driver, 10000000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginEdit-el")))).sendKeys(userName);


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordEdit-el")))).sendKeys(passWord);


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("totpCodeEdit-el")))).sendKeys(twoFactorCode);

        Thread.sleep(10);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("t-comp15-textEl")))).click();

        Thread.sleep(10);


        Thread.sleep(18000);


        driver.findElement(By.id("sidebar-item-wrapper-0")).click();
    }




    public static String decodedUsername(String UserName) {

        byte[] decodedUsername = Base64.decodeBase64(UserName);
        return new String(decodedUsername);
    }

    public static String decodedPassword(String passWord) {

        byte[] decodedPassword = Base64.decodeBase64(passWord);
        return new String(decodedPassword);

    }

    public static String decoded2FA(String otpKeyStr) {

        byte[] decoded2FA = Base64.decodeBase64(otpKeyStr);
        return new String(decoded2FA);

    }


}




    /////////////  https://stackoverflow.com/questions/7867537/how-to-select-a-drop-down-menu-value-with-selenium-using-python





