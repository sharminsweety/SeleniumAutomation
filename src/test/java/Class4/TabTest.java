package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//span[normalize-space()='Browser Windows']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(3000);


        String ParentPage = driver.getWindowHandle();
        System.out.println(" Main Window  "+ driver.findElement(By.className("text-center")).getText());
        Thread.sleep(2000);


        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println(" Inside child Window  "+ driver.findElement(By.id("sampleHeading")).getText());

        driver.switchTo().defaultContent();
        driver.switchTo().window(ParentPage);
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println(" inside child Window  "+ driver.findElement(By.id("sampleHeading")).getText());











    }

}
