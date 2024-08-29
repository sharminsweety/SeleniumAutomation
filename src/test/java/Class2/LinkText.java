package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        System.out.println(driver.getTitle());

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("orgot lo")).click();
        Thread.sleep(2000);

//        driver.quit();
    }
}
