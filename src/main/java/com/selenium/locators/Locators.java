package com.selenium.locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Locators {
	
		@Test(priority = 1)
		public void testyogi(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.astroyogi.com/");		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a/img")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BtnLinkLoginHome\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"LoginPhoneNumber\"]")).sendKeys("8080808080");
		driver.findElement(By.xpath("//*[@id=\"form-submit\"]")).click();

	}

}
