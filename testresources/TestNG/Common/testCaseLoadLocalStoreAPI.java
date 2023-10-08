import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourTestClass extends BaseTest {
    
    @Test
    public void testCaseLoadLocalStoreAPI() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Wait for the button to be present
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Button0ff527fee83e045")));
        
        // Click the button
        button.click();
        
        // Perform further actions if needed after clicking the button
    }
}
