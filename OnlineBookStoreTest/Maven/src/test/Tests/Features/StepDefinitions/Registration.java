import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationStepDefs {
    WebDriver driver = new ChromeDriver();

    @Given("^I am on the registration page$")
    public void iAmOnRegistrationPage() {
        driver.get("http://youronlinestore.com/register");
    }

    @When("^I fill in the registration form with \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
    public void iFillRegistrationForm(String username, String email, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("^I submit the registration form$")
    public void iSubmitRegistrationForm() {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String expectedMessage) {
        String actualMessage = driver.findElement(By.id("message")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
