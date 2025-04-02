package testNgPractise;


import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepositoryutility.HomePage;
import objectrepositoryutility.RegisterLinkPage;
import objectrepositoryutility.SearchIcon;
import practicedatadriventesting.DataBaseUtility;
import practicedatadriventesting.ExcelUtility;
import practicedatadriventesting.FileUtility;
import practicedatadriventesting.JavaUtility;

public class BaseClass  {
	

	public DataBaseUtility dlib = new DataBaseUtility();
	public FileUtility flib = new FileUtility();
	public ExcelUtility elib = new ExcelUtility();
    //public JavaUtility jlib = new JavaUtility();
	public WebDriver driver = null;
	
	
	
	@BeforeSuite
	public void configBS() {
		System.out.println("------connect to DB, Report  Config----");
		
		}
	
         @BeforeClass
         public void configBC() throws Throwable {
        	 System.out.println("----launch the Browser----");
        	 String BROWSER = flib.getDataFromProprtiesFile("browser");
     		if(BROWSER.equals("chrome")) {
     			WebDriverManager.chromedriver().setup();
     			driver = new ChromeDriver();
     		}
     		else if(BROWSER.equalsIgnoreCase("edge")) {
     			driver = new EdgeDriver();
     		}
     		else {

     			System.out.println("unsupported browser: "+ BROWSER);
     		}	
         }
        @BeforeMethod
        public void configBM( String productName) {
        System.out.println("-----login---");
        String BROWSER  =flib.getDataFromProprtiesFile("browser");
		String URL  =flib.getDataFromProprtiesFile("url");
		String EMAIL =flib.getDataFromProprtiesFile("email");
        String  FIRSTNAME=flib.getDataFromProprtiesFile("firstname");
		String LASTNAME  =flib.getDataFromProprtiesFile("lastname");
        String CONFIRMPASSWORD = flib.getDataFromProprtiesFile("confirmpassword");
        String PASSWORD = flib.getDataFromProprtiesFile("password");
        
       // RegisterLinkPage rp = new RegisterLinkPage(driver);
		//rp.registerToApp().click();
       
        SearchIcon si = new SearchIcon(driver);
		si.searchProductInApp(String productName);
		
        }
        
        
        @AfterMethod
        public void configAM() {
        	System.out.println("---logout---");
        	HomePage hp = new HomePage(driver);
        	//hp.logout();
        }
        @AfterClass
        public void configAC() {
        	System.out.println("---close the browser--");
        	driver.quit();
        }

        @AfterSuite
        public void configAS() throws Throwable {
        	System.out.println("---close Db, Report backup-");
        	dlib.closeDbconnetion();
        }
     
}