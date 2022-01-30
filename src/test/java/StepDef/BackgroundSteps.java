package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundSteps {

	WebDriver driver = null; 
	
	@When("user is on Login Webpage background")
	public void user_enters_and_background(String string, String string2) {
		driver.navigate().to("https://example.testproject.io/web/");
	}
}
