package com.org.qspiders.seleniumpractise;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class LaunchingBrowser {  

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement usernameTextfield=driver.findElement(By.cssSelector("input[placeholder='Enter your name']"));
		usernameTextfield.sendKeys("Pradeep");
		Thread.sleep(2000);
		//WebElement emailTextfield=driver.findElement(By.cssSelector("input[placeholder='Enter Your Email']"));
			//	emailTextfield.sendKeys("voonna.pradeep@gmail.com");
	//	Thread.sleep(2000);
	//WebElement  passwordTextfield=driver.findElement(By.cssSelector("input[id='Password']"));
	//passwordTextfield.sendKeys("pradeep555");
		//Thread.sleep(1000);
// passwordTextfield.submit();
 Thread.sleep(2000);
 //WebElement registerButton=driver.findElement(By.cssSelector(button[ type='submit']);
 //registerButton.click();
 //driver.findElement(by.cssSelector(href"/ui/login")).click();
 
   driver.close();
		


	}
}
