
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.security.NoSuchAlgorithmException;
import java.util.*;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertArrayEquals;
import org.jboss.aerogear.security.otp.Totp;
import  java.security.MessageDigest;
import org.apache.commons.codec.binary.Base64;


public class HashUserName {

    public  static  void main(String[] args){

        String Name = "O2ZDVA42TZQCVPL2VSXQKXMYDH56GBI7";

        byte[] encodedUsername = Base64.encodeBase64(Name.getBytes());

        System.out.println(("encoded userName is:"+new String(encodedUsername)));

        byte[] dedecodedUserName = Base64.decodeBase64("TzJaRFZBNDJUWlFDVlBMMlZTWFFLWE1ZREg1NkdCSTc=".getBytes());
        System.out.println("dedecoded UserName is:"+new String(dedecodedUserName) );

    }


}
