package com.selenium.locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuItemsSelection {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		WebElement item1 = driver.findElement(By.xpath("//h2[text()='Delhi']"));
		WebElement item2 = driver.findElement(By.xpath("//a[text()='Karol Bagh']"));

		Actions a = new Actions(driver);

		a.moveToElement(item1);
		a.click(item2);
		a.build().perform();
	}

}
