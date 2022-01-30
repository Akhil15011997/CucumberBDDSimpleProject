package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {
	
	@FindBy(id="name")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login")
	public static WebElement login;
	
	@FindBy(how = How.XPATH, using = "//a[@class='dummy']")
	public static WebElement dummy;
	
	@FindBy(partialLinkText ="login")
	List<WebElement> listelements;
	
	WebDriver driver; public Login_PF(WebDriver driver) { this.driver = driver; 
	//PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
	PageFactory.initElements(driver,this);
	}
		
	public static void ClickLogin() throws InterruptedException {login.click(); System.out.println("This is Page factory method"); Thread.sleep(2000);}

}
