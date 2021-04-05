import org.jboss.aerogear.security.otp.Totp;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.Alert;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class tesr {


    @Test

    public void testt() throws InterruptedException, AWTException {


        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C://Users//NatiD//Documents//chrom driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Launch website
        driver.navigate().to("https://dev-is-il.creatio.com/Login/TOTPLogin.aspx?ReturnUrl=%2f");
        // Click on login text box and send value....

        driver.manage().window().maximize();

        Thread.sleep(4000);


        Totp totp = new Totp("JH5FXUVQ3TKHVKQ63QNEFR2PD5YBMPXW");
        String auth = totp.now();


        WebDriverWait wait = new WebDriverWait(driver, 10000000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginEdit-el")))).sendKeys("natiyazam11@gmail.com");

        Thread.sleep(300);


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordEdit-el")))).sendKeys("Aa1234567");

        Thread.sleep(30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("totpCodeEdit-el")))).sendKeys(auth);

        Thread.sleep(20);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("t-comp15-textEl")))).click();


        Thread.sleep(18000);

        //OpenNewProject

        driver.findElement(By.id("UsrProjectsb64a6b42SectionSeparateModeAddRecordButtonButton-textEl")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("UsrProjects1PageUsrName7bff1995-75e9-43e6-9adf-0823b93f33e0TextEdit-el")).sendKeys("בדיקת רגרסיה לפתיחת פרויקט/שליחת פניה");

        driver.findElement(By.id("UsrProjects1PageUsrProjectType941d1876-ab64-41c1-82de-a98706a0c94dLookupEdit-el")).sendKeys("הטמנת");

        Thread.sleep(5000);

        driver.findElement(By.id("UsrProjects1PageUsrProjectType941d1876-ab64-41c1-82de-a98706a0c94dLookupEdit-el")).sendKeys(Keys.ARROW_DOWN);

        Thread.sleep(2000);

        driver.findElement(By.id("UsrProjects1PageUsrProjectType941d1876-ab64-41c1-82de-a98706a0c94dLookupEdit-el")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("UsrProjects1PageSTRINGc38a49e9-9ee4-4ee0-ac82-08f83fbe0974MemoEdit-el")).sendKeys("אוטומציה לפתיחת פרויקט/פניות");

        driver.findElement(By.id("UsrProjects1PageUsrProjectLocationDescriptiond7a33cdc-3489-4e50-88ab-7f3ac6d41e00TextEdit-el")).sendKeys("לוד");

        driver.findElement(By.id("UsrProjects1PageSaveButtonButton-textEl")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("UsrProjects1PageCloseButtonButton-textEl")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[title^='בדיקת רגרסיה לפתיחת פרויקט/שליחת פניה']")).click();

        Thread.sleep(4000);


        // Open New Request

        driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[4]")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"UsrSchema0164bc1dDetailAddRecordButtonButton-imageEl\"]")).click();

        Thread.sleep(7000);

        driver.findElement(By.id("UsrRequests1PageLOOKUP83f6f25a-5412-46e7-9c2c-bdeeb0f08ec9LookupEdit-el")).sendKeys("קבלת מיד");

        Thread.sleep(4000);

        driver.findElement(By.id("UsrRequests1PageLOOKUP83f6f25a-5412-46e7-9c2c-bdeeb0f08ec9LookupEdit-el")).sendKeys(Keys.ARROW_DOWN);

        driver.findElement(By.id("UsrRequests1PageLOOKUP83f6f25a-5412-46e7-9c2c-bdeeb0f08ec9LookupEdit-el")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("UsrRequests1PageUsrRequestLocationDescriptiond3a67ee4-c5b6-4fcd-8f60-9c9f3d5719fcTextEdit-el")).sendKeys("לוד");

        driver.findElement(By.id("UsrRequests1PageSaveButtonButton-textEl")).click();

        Thread.sleep(7000);



        //Select Poligon

        driver.findElement(By.xpath("//*[@id=\"UsrRequests1PageTabsTabPanel-tabpanel-items\"]/li[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("UsrRequests1PageMapControl1Button-textEl")).click();
        Thread.sleep(700);

        String PoligonPath = "C://Users//NatiD//Documents//Automition//AOI_18855.dxf";

        WebElement PoligonInput = driver.findElement(By.xpath("//*[@id=\"inpUploadAOIFile\"]"));

        PoligonInput.sendKeys(PoligonPath);

        Thread.sleep(15000);



        //Selecting companies

        driver.findElement(By.xpath("//*[@id=\"UsrRequests1PageTabsTabPanel-tabpanel-items\"]/li[3]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("UsrSchemad7ee8f9eDetailAddRecordButtonButton-imageEl")).click();

        Thread.sleep(7000);

        driver.findElement(By.xpath("//*[@id=\"searchEdit-el\"]")).sendKeys("נתיבי ישראל");


        driver.findElement(By.xpath("//*[@id=\"searchEdit-el\"]")).sendKeys(Keys.ENTER);

        Thread.sleep(2200);


        Actions action = new Actions(driver);


        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"searchEdit-el\"]"))).doubleClick().perform();

        action.moveToElement(driver.findElement(By.id("grid-grid-wrap"))).doubleClick().perform();

        Thread.sleep(700);

        //Selecting Work Type

        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"UsrSchemad7ee8f9eDetailDetailControlGroup\"]"))).doubleClick().perform();

        driver.findElement(By.xpath("//*[@id=\"UsrWorkTypesLookupEdit-el\"]")).sendKeys("קבלת מי");

        Thread.sleep(700);

        driver.findElement(By.xpath("//*[@id=\"UsrWorkTypesLookupEdit-el\"]")).sendKeys(Keys.ARROW_UP);
        Thread.sleep(700);

        driver.findElement(By.xpath("//*[@id=\"UsrWorkTypesLookupEdit-el\"]")).sendKeys(Keys.ENTER);


        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"UsrRequests1PageTabsContainerContainer\"]"))).doubleClick().perform();

        Thread.sleep(10000);

        //Create Documents list

        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"UsrRequests1PageCreateDocumentsListInRequestButton-textEl\"]"))).doubleClick().perform();
        Thread.sleep(10000);



        driver.findElement(By.xpath("//span[contains(text(), 'OK')]")).click();


        Thread.sleep(3000);


        driver.findElement(By.xpath("//*[@id=\"UsrRequests1PageTabsTabPanel-tabpanel-items\"]/li[4]")).click();
        Thread.sleep(3000);



        //File Uploading 1

        driver.findElement(By.cssSelector("[title^='תכנית תנוחה כללית עם תוואי מוצע מלא ברשת קואורדינטות']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"UsrAttachedDocumentsToRequest1PageSTRINGe9ee7fec-94e5-4755-a597-b3b15a91c6a0TextEdit-el\"]")).sendKeys("13");

        driver.findElement(By.xpath("//*[@id=\"UsrAttachedDocumentsToRequest1PageSTRING89fba6fe-d820-40ae-9c05-82937473c2bdTextEdit-el\"]")).sendKeys("6");

        driver.findElement(By.xpath("//*[@id=\"UsrAttachedDocumentsToRequest1PageDATE31f29fb3-aba0-4faf-8fae-cb8e23c72214DateEdit-el\"]")).sendKeys("17/11/2020");

        Thread.sleep(3000);

        String FilePath = "C://Users//NatiD//Documents//Automition//תוכנית בדיקות.docx";

        WebElement UploadButton = driver.findElement(By.xpath("//*[@id=\"FileDetailV2AddRecordButtonButton-fileupload\"]"));
        UploadButton.sendKeys(FilePath);

        Thread.sleep(3000);

        driver.findElement(By.id("UsrAttachedDocumentsToRequest1PageSaveButtonButton-textEl")).click();

        Thread.sleep(2000);


        //File Uploading 2
        driver.findElement(By.cssSelector("[title^='מכתב פנייה/בקשה מהיזם']")).click();

        Thread.sleep(1000);

        String FilePPath = "C://Users//NatiD//Documents//Automition//תוכנית בדיקות.docx";

        WebElement UploadbButton = driver.findElement(By.xpath("//*[@id=\"FileDetailV2AddRecordButtonButton-fileupload\"]"));
        UploadbButton.sendKeys(FilePPath);

        Thread.sleep(3000);

        driver.findElement(By.id("UsrAttachedDocumentsToRequest1PageCloseButtonButton-textEl")).click();
        Thread.sleep(3000);

        //Sending Request


        driver.findElement(By.id("UsrRequests1PageSendDocumentsListInRequestButton-textEl")).click();

        Thread.sleep(3000);
        WebElement MessageBoardVlue = driver.findElement(By.xpath("//*[@id=\"t-comp0-caption\"]"));
        String MessageBoardExpectd = "פניות נשלחו בהצלחה";
        String MessageBoardActual = MessageBoardVlue.getText();
        System.out.println(MessageBoardActual);
        if (MessageBoardExpectd.equals(MessageBoardActual)) {
            System.out.println("פניות נשלחו בהצלחה");

        } else {
            System.out.println("הפניות לא נשלחו");
            Assert.fail();

        }


        driver.findElement(By.xpath("//span[contains(text(), 'OK')]")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
