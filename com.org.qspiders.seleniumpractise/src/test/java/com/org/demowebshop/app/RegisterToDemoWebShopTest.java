package com.org.demowebshop.app;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepositoryutility.HomePage;
import objectrepositoryutility.LoginLinkPage;
import objectrepositoryutility.SearchIcon;
import practicedatadriventesting.ExcelUtility;
import practicedatadriventesting.FileUtility;
import practicedatadriventesting.JavaUtility;
import practicedatadriventesting.WebDriverUtility;
import testNgPractise.BaseClass;

public class RegisterToDemoWebShopTest extends BaseClass {
	@Test
	public  void registerToApp(java.lang.String FIRSTNAME, java.lang.String LASTNAME, java.lang.String EMAIL, java.lang.String CONFIRMPASSWORD, java.lang.String PASSWORD) throws Throwable,IOException {
		//FileUtility flib = new FileUtility();
	//ExcelUtility elib = new ExcelUtility();
		//JavaUtility jlib  = new JavaUtility();
		//WebDriverUtility  wlib= new WebDriverUtility();

		//String BROWSER  =flib.getDataFromProprtiesFile("browser");
		//String URL  =flib.getDataFromProprtiesFile("url");
		//String EMAIL =flib.getDataFromProprtiesFile("email");
        //String  FIRSTNAME=flib.getDataFromProprtiesFile("password");
		//String LASTNAME  =flib.getDataFromProprtiesFile("password");
       // String CONFIRMPASSWORD = flib.getDataFromProprtiesFile("confirmpassword");
		//Random random =new Random();
		//int randomInt = random.nextInt(1000);
		// String lastName =elib.getDataFromExcel();
		//+  randomInt;

		//WebDriver driver =null;


		//if(BROWSER.equals("chrome")) {
		//	WebDriverManager.chromedriver().setup();
		//	driver = new ChromeDriver();
		//}
		//else if(BROWSER.equalsIgnoreCase("edge")) {
			//driver = new EdgeDriver();
		//}
		//else {

			//System.out.println("unsupported browser: "+ BROWSER);
			//return;
		//}
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get(URL);
		//Thread.sleep(5000);
		HomePage hp = new HomePage(driver);
		hp.registerToApp(FIRSTNAME, LASTNAME, EMAIL, CONFIRMPASSWORD, PASSWORD);
		
		String productName = elib.getDataFromexcel("serachProduct",16 , 4)+ jlib.getRandomNumber();
		
	        SearchIcon si = new SearchIcon(driver);
	        si.searchProductInApp(productName).click();
	        
	     //LoginLinkPage lp = new LoginLinkPage(driver);
	      //lp.loginToApp(productName);
	   driver.close();    
}
}