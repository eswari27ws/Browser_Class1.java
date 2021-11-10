package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Class2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");

		WebDriver k = new ChromeDriver();
	
		k.get("https://email.gov.in/");
		
		k.manage().window().maximize();
		
		// web element with id and name
		
		WebElement Login = k.findElement(By.id("username"));
		Login.sendKeys("Ishu123@gami.com");

		WebElement password = k.findElement(By.name("password"));
		password.sendKeys("123456780987");
		
		k.findElement(By.id("formSubmitButton")).click();
	}
}
