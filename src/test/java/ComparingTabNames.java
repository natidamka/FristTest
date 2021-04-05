import org.jboss.aerogear.security.otp.Totp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;



public class ComparingTabNames {


    @Test

    public void ComparingTabNames() throws InterruptedException {


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

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordEdit-el")))).sendKeys("Mm1234567");
        Thread.sleep(30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("totpCodeEdit-el")))).sendKeys(auth);
        Thread.sleep(20);


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("t-comp15-textEl")))).click();





        Thread.sleep(18000);

        driver.findElement(By.cssSelector("[title^='בדיקת טיפול פנימי']")).click();

        Thread.sleep(5000);



        WebElement ProjectVlue = driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[1]"));
        String ProjectExpectd = "פרטי הפרויקט";
        String ProjectActal = ProjectVlue.getText();
        System.out.println(ProjectActal);
        if (ProjectExpectd.equals(ProjectActal)) {
            System.out.println("הלשונית פרטי הפרויקט קיימת");

        } else {
            System.out.println("הלשונית פרטי הפרויקט אינה קיימת");
            Assert.fail();

        }


        WebElement ContactsVlue = driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[2]"));
        String ContactsExpectd = "פרטי אנשי קשר";
        String ContactsActual = ContactsVlue.getText();
        System.out.println(ContactsActual);
        if (ContactsExpectd .equals(ContactsActual)) {
            System.out.println("הלשונית פרטי אנשי קשר קיימת");

        } else {
            System.out.println("הלשונית פרטי אנשי קשר אינה קיימת");
            Assert.fail();

        }



        WebElement MiniProjectsVlue = driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[3]"));
        String MiniProjectsExpectd = "תתי פרויקטים";
        String MiniProjectssActual = MiniProjectsVlue.getText();
        System.out.println(MiniProjectssActual);
        if (MiniProjectsExpectd .equals(MiniProjectssActual)) {
            System.out.println("הלשונית תתי פרויקטים קשר קיימת");

        } else {
            System.out.println("הלשונית תתי פרויקטים אינה קיימת");
            Assert.fail();

        }


        WebElement RequestVlue = driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[4]"));
        String RequestExpectd = "בקשות";
        String RequestActual = RequestVlue.getText();
        System.out.println(RequestActual);
        if (RequestExpectd.equals(RequestActual)) {
            System.out.println("הלשונית בקשות קיימת");
        } else {
            System.out.println("הלשונית בקשות אינה קיימת");
            Assert.fail();

        }


        WebElement TimeLineVlue = driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[5]"));
        String TimeLineExpectd = "ציר זמן";
        String TimeLineActual = TimeLineVlue.getText();
        System.out.println(TimeLineActual);
        if (TimeLineExpectd.equals(TimeLineActual)) {
            System.out.println("הלשונית ציר זמן קיימת");
        } else {
            System.out.println("הלשונית ציר זמן אינה קיימת");
            Assert.fail();

        }


        WebElement StepLogVlue = driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[6]"));
        String StepLogExpectd = "יומן שלבים בפרויקט";
        String StepLogActual = StepLogVlue.getText();
        System.out.println(StepLogActual);
        if (StepLogExpectd.equals(StepLogActual)) {
            System.out.println("הלשונית יומן שלבים בפרויקט קיימת");

        } else {
            System.out.println("הלשונית יומן שלבים בפרויקט אינה קיימת");
            Assert.fail();

        }


        WebElement MessageBoardVlue = driver.findElement(By.xpath("//*[@id=\"UsrProjects1PageTabsTabPanel-tabpanel-items\"]/li[7]"));
        String MessageBoardExpectd = "לוח הודעות";
        String MessageBoardActual = MessageBoardVlue.getText();
        System.out.println(MessageBoardActual);
        if (MessageBoardExpectd.equals(MessageBoardActual)) {
            System.out.println("הלשונית לוח הודעות קיימת");

        } else {
            System.out.println("הלשונית לוח הודעות אינה קיימת");
            Assert.fail();

        }



            //*[@id="UsrProjects1PageTabsTabPanel-tabpanel-items"]/li[4]
            ////driver.findElement(B)
        }
    }


