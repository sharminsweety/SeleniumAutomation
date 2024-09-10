

package SelAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.Duration;

public class FOrmTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.findElement(By.id("name")).sendKeys("Rownak");
        driver.findElement(By.id("email")).sendKeys("rownakkabir@gmail.com");
        driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input[@type='radio']")).click();

        driver.findElement(By.id("mobile")).sendKeys("01687678654");
        driver.findElement(By.id("dob")).sendKeys("08-13-1998");
        driver.findElement(By.id("subjects")).sendKeys("English");
        driver.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input[@type='checkbox']")).click();


        //File uploadFile = new File("C:\\Users\\rownak.kabir\\Downloads\\download.jfif");
        File uploadFile = new File("src/test/resources/download.jfif");
        driver.findElement(By.id("picture")).sendKeys(uploadFile.getAbsolutePath());
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("[placeholder='Currend Address']"))).click().sendKeys("Mirpur10").perform();
        Thread.sleep(2000);

        Select select1=new Select(driver.findElement(By.id("state")));
        select1.selectByIndex(2);

        Select select2=new Select(driver.findElement(By.id("city")));
        select2.selectByIndex(2);
        Thread.sleep(2000);

        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("input[type='submit'].btn.btn-primary"))).click();

    }
}