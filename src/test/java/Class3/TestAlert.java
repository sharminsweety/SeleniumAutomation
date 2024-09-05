package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAlert {

    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new FirefoxDriver();
            driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.manage().window().maximize();

//            driver.findElement(By.id("alertButton")).click();

       // driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
        driver.findElement(By.className("btn-danger")).click();
        Thread.sleep(2000);


        driver.switchTo().alert().accept();

        driver.findElement(By.className("btn-danger")).click();
        driver.switchTo().alert().dismiss();;

        Thread.sleep(2000);
    }
}
