package objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Register")
	private  WebElement registerLink;

	@FindBy(linkText="Log in")
	private WebElement loginLink;


	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getRegisterBtn() {
		return registerLink;
	}


	public void registerToApp(String firstName ,String lastName, String email, String password,String confirmPassword) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("url");
		registerLink.click();
	}
}
