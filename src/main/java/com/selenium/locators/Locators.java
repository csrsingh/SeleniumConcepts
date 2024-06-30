package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
		public static void main (String args[]) {
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oyorooms.com/");	
		driver.manage().window().maximize();
		//Absolute Xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/a/div/h2")).click();
		driver.navigate().back();
		//Relative Xpath
		driver.findElement(By.xpath("//h2[text()='Chennai']")).click();
	

	}

}
