package com.org.qspiders.seleniumpractise.samplePgrms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Screenshot/Homepage.png");
		FileHandler.copy(srcfile, destfile);
		
		driver.close();
	}
          
}
