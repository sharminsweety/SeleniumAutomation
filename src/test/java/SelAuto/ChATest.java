package SelAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChATest {
    public static void main(String[] args) {

        // Initialize WebDriver (Ensure geckodriver is in your system path)
        WebDriver driver = new FirefoxDriver();

        try {
            // Open the practice page
            driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Fill out text fields
            driver.findElement(By.name("name")).sendKeys("John Doe");
            driver.findElement(By.id("email")).sendKeys("johndoe@example.com");

            // Select gender using radio buttons
            WebElement genderRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
            genderRadioButton.click();

            // Select experience using checkboxes
            WebElement checkboxOption1 = driver.findElement(By.id("exp-1"));
            checkboxOption1.click();

            // Select a dropdown option
            Select dropdown = new Select(driver.findElement(By.id("selectnav")));
            dropdown.selectByVisibleText("Option 1");

            // Handle the date picker
            WebElement dateOfBirthInput = driver.findElement(By.id("datepicker"));
            dateOfBirthInput.click(); // Open the date picker

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Wait for the calendar to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));

            // Select a specific date (e.g., 15th)
            selectDate(driver, "15");

            // Fill out the text area
            driver.findElement(By.name("comment")).sendKeys("This is a sample comment.");

            // Click the submit button
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();

            // Optionally, verify submission or handle post-submission actions

        } finally {
            // Clean up
            driver.quit();
        }
    }

    private static void selectDate(WebDriver driver, String day) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the calendar to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));

        // Find and click the date
        WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='" + day + "']"));
        dateToSelect.click();
    }
}
