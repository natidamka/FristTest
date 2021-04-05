import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;




public class OpenNewProject{



    @Test

    public void NewProject () throws InterruptedException{

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


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordEdit-el")))).sendKeys("Qq1234567");

        Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("t-comp15-textEl")))).click();


        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

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


        Thread.sleep(18000);


        driver.findElement(By.id("sidebar-item-wrapper-0")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("UsrProjectsb64a6b42SectionSeparateModeAddRecordButtonButton-textEl")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("UsrProjects1PageUsrName7bff1995-75e9-43e6-9adf-0823b93f33e0TextEdit-el")).sendKeys("בדיקה רגרסיה לפתיחת פרויקט/פניה");

        driver.findElement(By.id("UsrProjects1PageUsrProjectType941d1876-ab64-41c1-82de-a98706a0c94dLookupEdit-el")).sendKeys("הטמנת");

        Thread.sleep(5000);

        driver.findElement(By.id("UsrProjects1PageUsrProjectType941d1876-ab64-41c1-82de-a98706a0c94dLookupEdit-el")).sendKeys(Keys.ARROW_DOWN);

        Thread.sleep(2000);

        driver.findElement(By.id("UsrProjects1PageUsrProjectType941d1876-ab64-41c1-82de-a98706a0c94dLookupEdit-el")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("UsrProjects1PageSTRINGc38a49e9-9ee4-4ee0-ac82-08f83fbe0974MemoEdit-el")).sendKeys("אוטומציה לפתיחת פרויקט/פניות");

        driver.findElement(By.id("UsrProjects1PageUsrProjectLocationDescriptiond7a33cdc-3489-4e50-88ab-7f3ac6d41e00TextEdit-el")).sendKeys("לוד");

        driver.findElement(By.id("UsrProjects1PageSaveButtonButton-textEl")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[4]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"UsrSchema0164bc1dDetailAddRecordButtonButton-imageEl\"]")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("UsrRequests1PageLOOKUP83f6f25a-5412-46e7-9c2c-bdeeb0f08ec9LookupEdit-el")).sendKeys("קבלת מיד");

        Thread.sleep(2000);

        driver.findElement(By.id("UsrRequests1PageLOOKUP83f6f25a-5412-46e7-9c2c-bdeeb0f08ec9LookupEdit-el")).sendKeys(Keys.ARROW_DOWN);

        driver.findElement(By.id("UsrRequests1PageLOOKUP83f6f25a-5412-46e7-9c2c-bdeeb0f08ec9LookupEdit-el")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("//*[@id=\"UsrRequests1PageTabsTabPanel-tabpanel-items\"]/li[3]")).click();



}
}