package testNgPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepositoryutility.HomePage;
import objectrepositoryutility.RegisterLinkPage;
import objectrepositoryutility.SearchIcon;
import practicedatadriventesting.ExcelUtility;
import practicedatadriventesting.FileUtility;
import practicedatadriventesting.WebDriverUtility;

public class RegisterToAppTest extends BaseClass{
	@Test
	public void registerToApp()  throws Throwable{

		String BROWSER  =flib.getDataFromProprtiesFile("browser");
		String URL  =flib.getDataFromProprtiesFile("url");
		String EMAIL =flib.getDataFromProprtiesFile("email");
		String  FIRSTNAME=flib.getDataFromProprtiesFile("password");
		String LASTNAME  =flib.getDataFromProprtiesFile("password");
		String CONFIRMPASSWORD = flib.getDataFromProprtiesFile("confirmpassword");
		//Random random =new Random();
		//int randomInt = random.nextInt(1000);
		// String lastName =elib.getDataFromExcel();
		//+  randomInt;


		//if(BROWSER.equals("chrome")) {
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//}
		//else if(BROWSER.equalsIgnoreCase("edge")) {
		//driver = new EdgeDriver();
		//}
		//else {

		//System.out.println("unsupported browser: "+ BROWSER);
		//return;
		//}

		HomePage hp = new HomePage(driver);
		hp.registerToApp(FIRSTNAME, LASTNAME, EMAIL, CONFIRMPASSWORD, CONFIRMPASSWORD);

		//String productName = elib.getDataFromexcel("serachProduct",16 , 4)+ elib.getRandomNumber();

		SearchIcon si = new SearchIcon(driver);
		si.searchProductInApp(productName);


		//LoginLinkpage lp = new LoginLinkPage(driver);
		// lp.loginToApp(EMAIL,PASSWORD);

		RegisterLinkPage rp = new RegisterLinkPage(driver);
		rp.registerToApp(FIRSTNAME, LASTNAME, EMAIL, CONFIRMPASSWORD, CONFIRMPASSWORD).click();

		String registerLink = driver.findElement(By.linkText("Register")).getText();
		if(registerLink.equals(registerLink)) {
			System.out.println("testCase is pass");
		}
		else {
			System.out.println("testcase is Fail");
		}
	}

}
