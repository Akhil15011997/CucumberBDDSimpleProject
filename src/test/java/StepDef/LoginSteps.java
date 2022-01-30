package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Actions.LoginPageActions;
import PageFactory.Login_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver = null; LoginPageActions LoginPageActions; Login_PF Login_PF;
	
	@Given("User is on Login Webpage")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://example.testproject.io/web/");
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_name_and_value(String username, String password) throws InterruptedException {
	//	driver.findElement(By.id("name")).sendKeys(username);	driver.findElement(By.id("password")).sendKeys(password);;
		LoginPageActions = new LoginPageActions(driver);
		LoginPageActions.enterUsername(username); LoginPageActions.enterpassword(password);
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		Login_PF = new Login_PF(driver);
		Login_PF.ClickLogin();
	}

	@Then("User is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close(); driver.quit();
	}

}
