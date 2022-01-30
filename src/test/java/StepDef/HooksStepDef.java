package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Actions.LoginPageActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksStepDef {
	WebDriver driver = null; LoginPageActions loginPageActions;
	
	@Before
	public void BrowserSetup() { System.out.println("Hooks Browser Setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	
	@Given("User is on Login Webpage Hooks")
	public void user_is_on_login_webpage_hooks() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("User enters {string} and {string} Hooks")
	public void user_enters_and_hooks(String username, String password) throws InterruptedException {
		loginPageActions = new LoginPageActions(driver);
		loginPageActions.enterUsername(username); loginPageActions.enterpassword(password);
	}

	@When("Clicks on login button Hooks")
	public void clicks_on_login_button_hooks() {
	}

	@Then("User is navigated to the homepage Hooks")
	public void user_is_navigated_to_the_homepage_hooks() {
	}
	
	@After
	public void TearDown() {
		driver.close(); driver.quit();
	}
}
