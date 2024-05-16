import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    private By searchBox = By.id("searchBox");
    private By searchButton = By.id("searchButton");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    // Methods specific to SearchPage
    public void searchForBook(String bookTitle) {
        driver.findElement(searchBox).sendKeys(bookTitle);
        driver.findElement(searchButton).click();
    }
}
