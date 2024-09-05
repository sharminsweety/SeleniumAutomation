package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.getTitle();
        driver.manage().window().maximize();

        Select select =  new Select(driver.findElement(By.cssSelector("select[name='country']")));
        select.selectByIndex(1);
        Thread.sleep(2000);

        select.selectByValue("AMERICAN SAMOA");
        Thread.sleep(2000);

        select.selectByVisibleText("ANDORRA");
        Thread.sleep(3000);

        for (WebElement element: select.getOptions())
        {
            System.out.println(element.getText());
        }





    }
}
