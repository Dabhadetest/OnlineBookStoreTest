import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends LoginPage {
    private By checkoutButton = By.id("checkoutButton");
    private By removeItemButton = By.id("removeItemButton");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    // Methods specific to ShoppingCartPage
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void removeItem() {
        driver.findElement(removeItemButton).click();
    }
}
