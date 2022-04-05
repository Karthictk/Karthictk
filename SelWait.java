import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SelWait {

    //Thread.sleep(1000)
    //implicitWait
    //explicitwait
    //fluentwait

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krshu\\Downloads\\DriverServer\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        //Implicit wait
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");

        driver.findElement(By.id("loginButton")).click();

        //explicit wait
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo_aT")));

       boolean bool= driver.findElement(By.id("logo_aT")).isDisplayed();
       if(bool)
       {
           System.out.println("Test case passed");
       }
       else
       {
           System.out.println("Test case failed");
       }
    }
}
