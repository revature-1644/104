import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class SeleniumTest {
    WebDriver driver;
    @Before
    public void setUp(){
        //setting the driver executable
        // System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        //Initiating your chromedriver
        driver=new ChromeDriver();
        //open browser with desried URL
        driver.get("file:///C:/Users/TheodoreBalashov/1644/104/index.html");
    }
    @Test
    public void loginTest(){
        WebElement usernameInput = driver.findElement(By.id("usernameInput"));
        WebElement passwordInput = driver.findElement(By.id("passwordInput"));
        WebElement loginButton = driver.findElement(By.id("submitButton"));
        usernameInput.sendKeys("testUser");
        passwordInput.sendKeys("testPassword");
        try{
            loginButton.click();
            // an alert should cause the catch to run instead of the following line
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
    }
    @After
    public void tearDown(){
        driver.close();
    }
}