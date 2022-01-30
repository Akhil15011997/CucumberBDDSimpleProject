package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver = null;
	@Given("Browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
	}
	
	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://google.com");
	}

	@And("User Accepts Cookies if shown")
	public void user_accepts_cookies_if_shown() {
		try {
			if(driver.findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).isDisplayed()) {
				driver.findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click(); }
		} catch (Exception e) {
			System.out.println(e + "Cookies question does not exist");
		}
	}
	
	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Facebook");
	}

	@And	("User hits enter")
	public void user_hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("Facebook");
		
		driver.close(); driver.quit();
	}


}
