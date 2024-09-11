

package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.findElement(By.name("name")).sendKeys("Sweety");
        driver.findElement(By.id("email")).sendKeys("sweetysharmin@gmail.com");

        WebElement radio1 = driver.findElement(By.name("gender"));
        WebElement radio2 = driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//input[1]"));


        radio1.click();
        Thread.sleep(3000);


        radio2.click();
        Thread.sleep(3000);

        driver.findElement(By.id("mobile")).sendKeys("01711825752");

        driver.findElement(By.id("dob")).sendKeys("08-13-1998");



    }
}

