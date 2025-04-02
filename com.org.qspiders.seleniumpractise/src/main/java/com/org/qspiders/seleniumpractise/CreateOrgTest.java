package com.org.qspiders.seleniumpractise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateOrgTest {

	public static void main(String[] args) throws IOException {
    FileInputStream fis= new FileInputStream("G:\\code\\commondata.properties");
		
		Properties pobj =new Properties();
		pobj.load(fis);
		System.out.println(pobj.getProperty("url"));
		
  String browser =pobj.getProperty("browser");
  String url =pobj.getProperty("url");
  String username=pobj.getProperty("username");
  String password=pobj.getProperty("password");
  
  WebDriver driver = null;
  if(browser.equals("chrome")) 
     driver = new ChromeDriver();
  
  
  else if(browser.equals("edge"))
	  driver = new EdgeDriver();
  
  
		//ChromeDriver driver = new ChromeDriver();
		driver.get(url);
			driver.manage().window().maximize();	
				
		
		driver.findElement(By.name("user_name")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
       driver.findElement(By.linkText("Organizations")).click();
	}
}
	


