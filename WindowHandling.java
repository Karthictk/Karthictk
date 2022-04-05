import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\krshu\\Downloads\\DriverServer\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.id("windowButton")).click();

        Thread.sleep(2000);

        Set<String> win=driver.getWindowHandles();

        Iterator itr=win.iterator();

        String parentWindow= (String) itr.next();
        String childWindow= (String) itr.next();

        driver.switchTo().window(childWindow);

        String text=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);

        driver.close();

        driver.switchTo().window(parentWindow);

        driver.quit();
    }

}
