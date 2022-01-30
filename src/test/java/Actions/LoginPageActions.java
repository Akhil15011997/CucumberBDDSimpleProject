package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {
	
	WebDriver driver; public LoginPageActions(WebDriver driver) { this.driver = driver;}

	static By user = By.id("name");
	
	static By pass = By.id("password");
	
	By login = By.id("login");
	
	public void enterUsername(String Username) throws InterruptedException { driver.findElement(user).sendKeys(Username); Thread.sleep(2000);}
	public void enterpassword(String password) { driver.findElement(pass).sendKeys(password); }
//	public void ClickLogin() { driver.findElement(login).click(); }
}
