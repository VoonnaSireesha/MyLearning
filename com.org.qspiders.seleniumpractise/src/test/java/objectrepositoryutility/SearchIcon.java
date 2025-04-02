package objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchIcon {
	         
				WebDriver driver;
	            public SearchIcon(WebDriver driver) {
	            	this.driver = driver;
	            	PageFactory.initElements(driver, this);
	            }   	
                 public WebElement getSearchTextField() {
					return searchTextField;
				}

				public WebElement getWebElement() {
					return searchBtn;
				}
				@FindBy(id="small-searchterms")
                private WebElement searchTextField;
	            	
                 @FindBy(xpath = "//input[@type='submit']")
              private  WebElement searchBtn;     
                 
                
				public void searchProductInApp(String productName) {
					//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					//driver.manage().window().maximize();
			      // driver.get("url");
			       //searchTextField.sendKeys(productName);
              	 //searchBtn.click();
				
					
				}
				
				
				}
                 
	                        
                 
                 
                 
