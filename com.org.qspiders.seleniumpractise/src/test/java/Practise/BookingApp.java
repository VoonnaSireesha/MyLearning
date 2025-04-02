package Practise;
import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class BookingApp {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("notification is handled");
		driver.get("https://in.via.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("SignIn")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7093938794b@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("siri@123");
		//driver.findElement(By.xpath("//span[text()='SIGN UP']")).click();
		driver.findElement(By.xpath("//a[@target='blank']")).click();
	}

}
																															