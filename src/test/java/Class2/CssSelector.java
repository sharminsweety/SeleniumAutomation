



package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        driver.findElement(By.cssSelector("input[name='user-name']")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(3000);



        driver.quit();
    }


}
