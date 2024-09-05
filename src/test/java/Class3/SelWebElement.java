package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        driver.getCurrentUrl();
        driver.getTitle();

        WebElement webElement = driver.findElement(By.id("user-name"));
        System.out.println("Get tag name: "+webElement.getTagName());
        System.out.println("X,Y name "+webElement.getRect().x+"=="+webElement.getRect().y);

        WebElement element = driver.findElement(By.className("btn_action"));
        System.out.println("Get css "+element.getCssValue("background-color"));
        System.out.println("Get css "+element.getCssValue("color"));
        System.out.println("Get attribute value "+element.getAttribute("id"));



        Thread.sleep(2000);
        driver.quit();






    }








}
