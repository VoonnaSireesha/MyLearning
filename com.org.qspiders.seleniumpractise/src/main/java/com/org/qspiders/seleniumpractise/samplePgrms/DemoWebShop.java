package com.org.qspiders.seleniumpractise.samplePgrms;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DemoWebShop {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//explicit wait
		WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
		
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(3000);
				WebElement searchpage=driver.findElement(By.xpath("//h1[text()='Search']"));
				wait.until(ExpectedConditions.visibilityOf(searchpage));
		driver.quit();

	}

}
