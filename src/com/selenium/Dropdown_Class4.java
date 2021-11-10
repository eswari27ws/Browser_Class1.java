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
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Class4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");

		WebDriver w = new ChromeDriver();
		w.get("http://www.leafground.com/pages/Dropdown.html");
		w.manage().window().maximize();
		// index
		WebElement index = w.findElement(By.xpath("//select [@id='dropdown1']"));
		Select i = new Select(index);
		i.selectByIndex(1);
		// value
		WebElement value = w.findElement(By.xpath("//select [@id='dropdown3']"));
		Select v = new Select(value);
		v.selectByValue("2");
		// text
		WebElement text = w.findElement(By.xpath("//select [@name='dropdown2']"));
		Select t = new Select(text);
		t.selectByVisibleText("UFT/QTP");
		
		TakesScreenshot k = (TakesScreenshot) w;
		File sourse = k.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Screenshot\\Dropdown.png");
		FileUtils.copyFile(sourse, destination);

		
	}
}
