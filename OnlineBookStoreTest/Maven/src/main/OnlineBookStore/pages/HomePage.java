import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By welcomeMessage = By.id("welcomeMessage");
    private By searchBox = By.id("searchBox");
    private By searchButton = By.id("searchButton");
    private By cartIcon = By.id("cartIcon");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Methods specific to HomePage
    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessage).getText();
    }

    public void searchForBook(String bookTitle) {
        driver.findElement(searchBox).sendKeys(bookTitle);
        driver.findElement(searchButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
