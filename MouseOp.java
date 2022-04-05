import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\krshu\\Downloads\\DriverServer\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        Actions act=new Actions(driver);
       WebElement ele= driver.findElement(By.id("username"));

       ele.sendKeys("test");
        Thread.sleep(2000);
        act.contextClick(ele).build().perform();

        act.doubleClick(ele).build().perform();
    }
}
