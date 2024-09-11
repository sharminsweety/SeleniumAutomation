

package Class4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FormReg1{
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

//       driver.findElement(By.id("dob")).sendKeys("11.01.2024");

        driver.findElement(By.id("dob")).sendKeys("08-13-1998");


        driver.findElement(By.id("subjects")).sendKeys("Science");
        Thread.sleep(3000);


        driver.findElement(By.id("hobbies")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//input[1]")).click();
        Thread.sleep(3000);


//        File upload = new File("src/test/pic.jpg");
//        driver.findElement(By.id("picture")).sendKeys(upload.getAbsolutePath());

        WebElement fileInput = driver.findElement(By.id("picture")); // Adjust the locator if needed
        fileInput.sendKeys("C:\\Users\\sharmin.sweety\\IdeaProjects\\SeleniumAutomation\\src\\test\\pic.jpg"); // Update with the actual file path

//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//textarea[@id='picture']"))).sendKeys("Dhaka").perform();
//        driver.quit();

        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("[placeholder='Currend Address']"))).click().sendKeys("Mirpur10").perform();
        Thread.sleep(2000);

        driver.quit();








    }
}
