package com.org.qspiders.seleniumpractise.samplePgrms;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DemoApp {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?.secenario=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sireesha");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sireesha7@gmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("siri1235");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sireesha7@gmail.com");
		//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("siri1235");   //Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
	driver.findElement(By.xpath("//section[contains(text(),'Shadow']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.linkText("Shadow Root")).click();
		
		
		
		//driver.findElement(By.linkText("Button")).click();
        //Thread.sleep(2000);
		//WebElement ui=driver.findElement(By.id("options"));
		//Select objsel=new Select(ui);
		//objsel.selectByIndex(1);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		//Actions action=new Actions(driver);
		//action.scrollByAmount(0, 500).perform();
		//WebElement popups=driver.findElement(By.linkText("Frames"));
		//action.scrollToElement(popups).build().perform();
	//WebElement rightclick_button=
		//driver.findElement(By.xpath("//a[contains(text(),'Right Click']"));
		
		//action.contextClick(rightclick_button).build().perform();
      
	//WebElement Register=driver.findElement(By.xpath("(//a[contains(text(),'Register'])"));
	//action.moveToElement(Register).build().perform();
		//driver.quit();
			
	}
}
