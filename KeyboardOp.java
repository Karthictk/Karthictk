import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class KeyboardOp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\krshu\\Downloads\\DriverServer\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        Actions act=new Actions(driver);
        driver.findElement(By.id("username")).click();
        act.keyDown(Keys.SHIFT).sendKeys("admin").build().perform();
        act.keyUp(Keys.SHIFT).sendKeys("test").build().perform();

        act.keyDown(Keys.CONTROL).build().perform();
      //  act.keyDown(Keys.chord("A")).build().perform();

    }
}
