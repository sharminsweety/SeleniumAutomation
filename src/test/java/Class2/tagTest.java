

package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class tagTest {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();


        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        System.out.println(driver.getTitle());

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("Count tag"+webElements.size());


        for (WebElement element:webElements) {


            System.out.println(element.getText());

        }
        driver.quit();

    }
}
