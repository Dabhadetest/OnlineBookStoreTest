import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setup() {
        // Initialize WebDriver instance
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        // Close WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }

}
