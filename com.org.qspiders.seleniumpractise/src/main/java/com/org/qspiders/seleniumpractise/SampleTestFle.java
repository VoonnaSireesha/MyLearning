package com.org.qspiders.seleniumpractise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestFle {

	public static void main (String[] args) throws Exception
	{

		WebDriverManager.edgedriver().setup();


		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();

		

			driver.get("https://www.amazon.com");

			Thread.sleep(5000); 
			// driver.navigate().refresh();
			Thread.sleep(5000);
			driver.manage().window().maximize();

			Thread.sleep(5000);  
			//driver.manage().window().minimize();
			//Thread.sleep(5000);
			//driver.manage().window().maximize();
			//Thread.sleep(5000);
			//driver.manage().window().setSize(new Dimension(400,600));

			// Thread.sleep(4000);
			//driver.manage().window().setPosition(new Point(600,900));

			Thread.sleep(6000);

			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(6000);
			driver.navigate().refresh();

			Thread.sleep(2000);
			driver.navigate().forward();

			Thread.sleep(4000);


			Thread.sleep(3000);
			String Url=driver.getCurrentUrl();

			String SourceCode=driver.getPageSource(); 
			System.out.println("Page Tile = "+ driver.getTitle());

			System.out.println(SourceCode);

			System.out.println(Url);
		

		

		driver.quit();

		}
}