import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartStepDefs {
    WebDriver driver = new ChromeDriver();

    @Given("^I am logged in to the online bookstore$")
    public void iAmLoggedIn() {
        // Add steps to log in here, assuming you have a login feature implemented
    }

    @When("^I search for a book titled \"([^\"]*)\"$")
    public void iSearchForBook(String bookTitle) {
        driver.findElement(By.id("search-bar")).sendKeys(bookTitle);
        driver.findElement(By.id("search-button")).click();
    }

    @When("^I select the book from the search results$")
    public void iSelectBookFromResults() {
        // Assuming there is a list of search results and we select the first one
        driver.findElement(By.className("search-result")).click();
    }

    @When("^I add the book to the shopping cart$")
    public void iAddBookToCart() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    @Then("^the book should be added to my shopping cart$")
    public void bookShouldBeAddedToCart() {
        String cartItemCount = driver.findElement(By.id("cart-item-count")).getText();
        Assert.assertTrue(Integer.parseInt(cartItemCount) > 0);
    }
}
