package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brower1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");

		WebDriver d = new ChromeDriver(op);
		d.get("https://email.gov.in/");
		d.manage().window().maximize();
		String title = d.getTitle();// get the title
		System.out.println("title : " + title);
		String currentUrl = d.getCurrentUrl(); // get the url
		System.out.println("currentUrl : " + currentUrl);
		// tag Name[@attributeName='attributeValue']
		WebElement Email = d.findElement(By.xpath("//input[@id='username']"));
		Email.sendKeys("Ishu1234@gmail.com");
		WebElement password = d.findElement(By.name("password"));
		password.sendKeys("123457789775");
		WebElement login = d.findElement(By.id("formSubmitButton"));
		login.click();
		d.navigate().back();
		// tagName[@attributeName='attributeValue'][1]
		WebElement findElement = d.findElement(By.xpath("//a[@href =\'https://passapp.email.gov.in\'][1]"));
		findElement.click();

		// screenshot
		TakesScreenshot t = (TakesScreenshot) d;
		File source = t.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\Screenshot\\pic.png");
		FileUtils.copyFile(source, Destination);
	}

}
