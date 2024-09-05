package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        Thread.sleep(2000);





        System.out.println("Frame Main  "+ driver.findElement(By.className("text-center")).getText());
        Thread.sleep(2000);


        driver.switchTo().frame("frame1");
        System.out.println("Inside frame 1 "+driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        System.out.println("Inside frame 2" +driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);











    }
}

