mport org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class LoginSteps {
    WebDriver driver;

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("^I enter my username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_my_username_and_password(String username, String password) {
        // Enter username and password
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }


    @When("^I click on the login button$")
    public void i_click_on_the_login_button() {
        // Click on the login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() {
        // Verify successful login
        String welcomeMessage = driver.findElement(By.id("welcomeMessage")).getText();
        assertEquals("Welcome, myusername!", welcomeMessage);
        driver.quit();
    }

    @Then("^I should see an error message$")
    public void i_should_see_an_error_message() {
        // Verify error message for invalid login
        String errorMessage = driver.findElement(By.id("errorMessage")).getText();
        assertEquals("Invalid username or password", errorMessage);
        driver.quit();
    }
}