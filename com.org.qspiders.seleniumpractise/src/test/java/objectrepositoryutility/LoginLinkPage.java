package objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLinkPage {
          WebDriver driver;
          public LoginLinkPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
          }
	@FindBy(id="Email")
private	WebElement emailTextField;
	
	@FindBy(id="Password")
private	WebElement passwordTextField;
	
     @FindBy(id="RememberMe")
private WebElement  rememberMecheckBox;
     
     @FindBy(xpath="//input[@type='submit']")
private  WebElement  loginBtn;



	

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMecheckBox() {
		return rememberMecheckBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
     
	public void LoginToApp(String email, String password) {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().window().maximize();
       //driver.get("url");
      // emailTextField.sendKeys(email);
	
	//passwordTextField.sendKeys(password);
     //  rememberMecheckBox.click();
      // loginBtn.click();
	}
}
