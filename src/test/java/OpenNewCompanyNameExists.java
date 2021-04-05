import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OpenNewCompanyNameExists {

    @Test

    public void OpenNewCompanyNameExists() throws InterruptedException {



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


        driver.findElement(By.id("sidebar-item-text-4")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.id("sidebar-item-text-4")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);



        driver.findElement(By.id("UsrRequestsForCreatingCompany30d55fbbSectionSeparateModeAddRecordButtonButton-textEl")).click();

        Thread.sleep(9000);


        driver.findElement(By.id("UsrRequestsForCreatingCompany1PageUsrName7c9640c6-e0b7-4f9a-904d-3a3a25874930TextEdit-el")).sendKeys("מקורות מטה");


        driver.findElement(By.id("UsrRequestsForCreatingCompany1PageUsrVATe2cebfe8-c151-4c65-82f2-a802bed6de8dTextEdit-el")).sendKeys("56789035643258");

        driver.findElement(By.id("UsrRequestsForCreatingCompany1PageUsrTypecd961b8e-74e4-4c46-89b7-2cea262605cbLookupEdit-el")).sendKeys("תכנון");


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
            System.out.println("מספר הפלאפון קיים במערכת");
        } else {
            System.out.println("מספר הפלאפון אינו קיים במערכת");
        }


    }
}
