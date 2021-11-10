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

public class Webelement_XpathClass3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver p = new ChromeDriver();
		p.get("https://email.gov.in/");
		p.manage().window().maximize();

		// web element with X-path

		// tagName[contains(@attributeName,'attributeValue')]

		WebElement username = p.findElement(By.xpath("//input[contains(@id,'username')]"));
		username.sendKeys("ishu123@gmail.com");
		// tagName[@attributeName='attributeValue']

		p.findElement(By.xpath("//*[@colspan='2']/following::input")).sendKeys("1234556788");

		p.findElement(By.xpath("//*[@class='loginblock']/div[2]/form/table/tbody/tr[3]/td/button")).click();
		Thread.sleep(3000);

		// tagName[@attributeName='attributeValue'])[index]

		p.findElement(By.xpath("//a[@href='http://www.whatismybrowser.org/']")).click();
		
	    p.navigate().refresh();
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) p;
		File sourse = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Screenshot\\forgetlink_new1.png");
		FileUtils.copyFile(sourse, destination);

	}
}
