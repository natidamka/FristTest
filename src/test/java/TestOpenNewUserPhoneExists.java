import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



public class TestOpenNewUserPhoneExists {


    @Test

    public void TestOpenNewUserPhoneExists() throws InterruptedException {


        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C://Users//NatiD//Documents//chrom driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Launch website
        driver.navigate().to("https://dev-is-il.creatio.com/Login/TOTPLogin.aspx?ReturnUrl=%2f");
        // Click on login text box and send value....

        driver.manage().window().maximize();

        Thread.sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, 10000000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginEdit-el")))).sendKeys("natiyazam11@gmail.com");


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordEdit-el")))).sendKeys("Yy1234567");

        Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("t-comp15-textEl")))).click();


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


        Thread.sleep(11000);

        WebElement strVlue = driver.findElement(By.id("MainHeaderSchemaCaptionValueLabel"));
        String strExpectd = "פרויקטים";
        String strActal = strVlue.getText();
        System.out.println(strActal);
        if (strExpectd.equals(strActal)) {
            System.out.println("הצלחת לעקוף את האוטינטיקייטור");
        } else {
            System.out.println("לא הצלחת לעקוף את האוטיינטיקייטור");
        }

        driver.findElement(By.id("sidebar-item-text-3")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-text-3")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


        driver.findElement(By.id("UsrRequestsForCreatingAccounts2bc0c810SectionSeparateModeAddRecordButtonButton-textEl")).click();

        Thread.sleep(9000);


        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageSTRING80178777-c90e-404c-9e9f-f0a3cb0a351eTextEdit-el")).sendKeys("נתי");


        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageSTRING322dffcc-8d2c-4401-a69e-13dbc7cd1402TextEdit-el")).sendKeys("דמקה טסט");

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageLOOKUP368d98a7-6aa6-4410-9dcc-43d526912e71LookupEdit-el")).sendKeys("נתיבי ישראל");


        Thread.sleep(9000);

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageLOOKUP368d98a7-6aa6-4410-9dcc-43d526912e71LookupEdit-el")).sendKeys(Keys.ARROW_DOWN);

        Thread.sleep(2000);

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageLOOKUP368d98a7-6aa6-4410-9dcc-43d526912e71LookupEdit-el")).sendKeys(Keys.ENTER);


        Thread.sleep(3000);

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageUsrRequestedUserRole98ac886f-6619-4cdf-88bd-98ad37dc6d75LookupEdit-el")).sendKeys("מתכנן");
        Thread.sleep(900);

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageUsrRequestedUserRole98ac886f-6619-4cdf-88bd-98ad37dc6d75LookupEdit-el")).sendKeys(Keys.ARROW_DOWN);

        Thread.sleep(2000);

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageUsrRequestedUserRole98ac886f-6619-4cdf-88bd-98ad37dc6d75LookupEdit-el")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);


        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageSTRING345c724b-60a1-4a34-b5d5-999b88080421TextEdit-el")).sendKeys("natka@gmail.com");

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageSTRINGf8ee5ed9-1933-473f-b59d-108e84daa4b3TextEdit-el")).sendKeys("0527446366");

        Thread.sleep(5000);

        driver.findElement(By.id("UsrRequestsForCreatingAccounts1PageSaveButtonButton-textEl")).click();

        Thread.sleep(14000);

        WebElement strValue = driver.findElement(By.id("MainHeaderSchemaCaptionValueLabel"));
        String strExpected = "משתמש קיים";
        String strActual = strValue.getText();
        System.out.println(strActual);
        if (strExpected.equals(strActual)) {
            System.out.println("המערכת לזיהוי כפילות פלאפון אינה תקינה");
        } else {
            System.out.println("המערכת לזיהוי כפילות פלאפון ת" +
                    "" +
                    "קינה");
        }
    }
}





