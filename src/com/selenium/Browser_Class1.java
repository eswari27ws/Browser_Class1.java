package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_Class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		// webDriver method
		
		d.get("https://email.gov.in/");
		
		d.manage().window().maximize();
		
		String title = d.getTitle();
		
		System.out.println("title : " + title);
		
		String currentUrl = d.getCurrentUrl();
		
		System.out.println("currentUrl : " + currentUrl);
		
		String pageSource = d.getPageSource();
		
		System.out.println("pageSource : " + pageSource);
		
		// navigate
		
		d.navigate().to("https://www.flipkart.com/");
		
		d.navigate().to("https://www.myntra.com/");
	
		d.navigate().refresh();
		
		d.navigate().back();
		
		d.navigate().forward();
	}
}
