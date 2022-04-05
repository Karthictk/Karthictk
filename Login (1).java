import objectrepo.HomePage;
import objectrepo.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Login {

    @Test
    public void login()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krshu\\Downloads\\DriverServer\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        LoginPage loginpage= PageFactory.initElements(driver,LoginPage.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginpage.login("admin","manager");
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        boolean bool=homePage.logo.isDisplayed();
        Assert.assertTrue(bool,"The logo does not appear");
        driver.quit();
    }

    @Test(dependsOnMethods = "login")
    public void negativeTestCase() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krshu\\Downloads\\DriverServer\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("");
        driver.findElement(By.name("pwd")).sendKeys("");

        driver.findElement(By.id("loginButton")).click();

        Thread.sleep(2000);
        String ActResult=driver.findElement(By.className("errormsg")).getText();
        String expResult="Username or Password is invalid. Please tr again.";

        TakesScreenshot tk=(TakesScreenshot) driver;
        File file=tk.getScreenshotAs(OutputType.FILE);

        File file2=new File("C:\\Users\\krshu\\GitDemo1\\SeleniumDemo\\src\\main\\java\\objectrepo\\test.png");

        FileUtils.copyFile(file,file2);

       // Assert.assertEquals(ActResult,expResult);
    }

}
