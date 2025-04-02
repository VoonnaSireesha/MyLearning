package objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practicedatadriventesting.WebDriverUtility;

public class RegisterLinkPage  extends WebDriverUtility{
	WebDriver driver;
	public RegisterLinkPage(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
          @FindBy(linkText = "Register")
     private WebElement registerLink;
          
          @FindBy(id="gender-male")
    private WebElement  genderRadioBtn;
          
    @FindBy(id="FirstName")
        private WebElement  firstNameTextField;
         @FindBy(id="LastName")
  private  WebElement  lastNameTextField;
         @FindBy(id="Email")
   private      WebElement  emailTextField;
         @FindBy(id="Password")
   private      WebElement  passwordTextField;
         @FindBy(id="ConfirmPassword")
   private      WebElement  confirmPasswordTextField;
         @FindBy(name="register-button")
   private     WebElement    registerBtn;
		public WebElement getRegisterLink() {
			return registerLink;
		}
		
		public WebElement getGenderRadioBtn() {
			return genderRadioBtn;
		}
		
		public WebElement getfirstNameTextField() {
			return firstNameTextField;
		}
		
		public WebElement getLastNameTextField() {
			return getLastNameTextField();
		}
		
		public WebElement getEmailTextField() {
			return emailTextField;
		}
		
		public WebElement getPasswordTextField() {
			return passwordTextField;
		}
		
		public WebElement getConfirmPasswordTextField() {
			return confirmPasswordTextField;
		}
		
		public WebElement getRegisterBtn() {
			return registerBtn;
		}
		
          
         public void registerToApp(String firstName,String password, String confirmPassword, String email, String lastName) {
        	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        	// driver.manage().window().maximize();
        	// driver.get("url");
		//firstNameTextField.sendKeys(firstName);
		//lastNameTextField.sendKeys(lastName);
        // emailTextField.sendKeys(email);
        // passwordTextField.sendKeys(password);
        // confirmPasswordTextField.sendKeys(confirmPassword);
         //registerBtn.click();
}
}
		
		



