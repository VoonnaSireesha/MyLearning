package testNgPractise;



import org.testng.annotations.Test;
import java.io.ObjectInputFilter.Status;

import org.testng.annotations.BeforeSuite;

public class SampleReportTest {
	@Test
	public void createContactTest() {
		ExtentSparkReporter spark = new ExtentSparkReporter ("./Screenshot/r")
		System.out.println("login to app");
		System.out.println("navigate  to contact  page");
		System.out.println("create contact");
		if("HDFC".equals("HDFC")) {
		System.out.println("contact is created");
		}else { 
			System.out.println("contact is not created");
		}
		System.out.println("loginTo app");
	}

		
		
		
		
		
	
	//ExtentReports report;
    // @BeforeSuite
    // public  void configBS() {
    	 
    	// spark report config
    	// ExtentSparkReporter spark = new ExtentSparkReporter("./Screenshot/report.html");
    	 //spark.config().setDocumentTitle("login the application");
    	// spark.config().setReportName("login the application");
    	 
		//spark.config().setTheme(Theme.DARK);
    	 
    	 // add environment information and login the application
    	 
      //ExtentReports report = new ExtentReports();
      //report.attachReporter(spark);
     // report.setSystemInfo("OS","Windows-11");
     // report.setSystemInfo("BROWSER","CHROME-100");
     //}
      // @AfterSuite
      // public void configAS() {
	 // report.flush();
//  }
 //  @Test
  // public void loginTest() {
	   // ExtentTest test = report.loginTest("login the application") {
	   // test.log(Status.INFO,"login to app");		
	    //test.log(Status.INFO,"search product");	
	    //test.log(Status.INFO,"click register link");	
	  // if("DEMO".equals("DEMO")) {
		   //test.log(Status.PASS,"login the app success");
	  // }
	  // else {
		 //  test.log(Status.FAIL,""login the app not success);
	  // }
	  // report.flush();
   }   
   