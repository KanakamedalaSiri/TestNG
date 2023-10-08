//Please add TestNG based test case to this file
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocalStoreAPITest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver (in this case, ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        // Navigate to the web page or perform any setup if needed
        driver.get("your_webpage_url");
    }

    @Test
    public void testLocalStoreAPI() {
        // Wait for 1 second
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for elements to be present in the DOM
        // Note: In a real scenario, you should use explicit waits for better synchronization
        WebElement frame = driver.findElement(By.id("frmLocalStoreAPI"));
        WebElement keyTextbox = frame.findElement(By.id("txtKey2"));
        WebElement copyButton = frame.findElement(By.id("CopyButton0gb96c8be60be4e"));

        // Enter text into the textbox
        keyTextbox.sendKeys("key1");

        // Click the Copy button
        copyButton.click();

        // Get the text from txtValue2 element and assert
        WebElement valueTextbox = frame.findElement(By.id("txtValue2"));
        String actualValue = valueTextbox.getText();
        String expectedValue = "10";

        assert actualValue.equals(expectedValue) : "Actual value is not equal to expected value";
    }

    @AfterClass
    public void tearDown() {
        // Close the browser window
        if (driver != null) {
            driver.quit();
        }
    }
}
