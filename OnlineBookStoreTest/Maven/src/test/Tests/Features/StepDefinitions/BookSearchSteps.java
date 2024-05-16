import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookShoppingStepDefs extends ScreenshotUtility {
    WebDriver driver = new ChromeDriver();

    @Given("^I am on the homepage of the online bookstore$")
    public void iAmOnHomepage() {
        driver.get("http://youronlinestore.com");
    }

    @When("^I search for a book titled \"([^\"]*)\"$")
    public void iSearchForBook(String bookTitle) {
        driver.findElement(By.id("search-bar")).sendKeys(bookTitle);
        driver.findElement(By.id("search-button")).click();
    }

    @And("^I select the book from the search results$")
    public void iSelectBookFromResults() {
        // Assuming there is a list of search results and we select the first one
        driver.findElement(By.className("search-result")).click();
    }

    @And("^I view the detail page of the book$")
    public void iViewBookDetailPage() {
        // Assuming the detail page is automatically displayed after selecting the book
    }

    @And("^I add the book to the shopping cart$")
    public void iAddBookToCart() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    @And("^I navigate to the shopping cart page$")
    public void iNavigateToCartPage() {
        driver.findElement(By.id("shopping-cart-link")).click();
    }

    @And("^I proceed to the checkout page$")
    public void iProceedToCheckout() {
        driver.findElement(By.id("checkout-button")).click();
    }

    @And("^I enter my billing and shipping details$")
    public void iEnterBillingAndShippingDetails() {
        // Assume you have form fields to enter billing and shipping details
        // Fill in those fields with appropriate data
    }

    @And("^I place the order$")
    public void iPlaceOrder() {
        driver.findElement(By.id("place-order-button")).click();
    }

    @Then("^I should receive a confirmation message$")
    public void iReceiveConfirmationMessage() {
        String confirmationMessage = driver.findElement(By.id("confirmation-message")).getText();
        Assert.assertTrue(confirmationMessage.contains("Your order has been placed successfully"));
    }
}
