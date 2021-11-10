package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement close = d.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		close.click();

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-1000)", "");

		WebElement flipkart = d.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[6]"));
		JavascriptExecutor j = (JavascriptExecutor) d;
		Thread.sleep(2000);
		j.executeScript("arguments[0].scrollIntoView(true);", flipkart);
		j.executeScript("arguments[0].click();", flipkart);

	}

}

