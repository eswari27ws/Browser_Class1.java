package com.workout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.redbus.in/bus-tickets");
		d.manage().window().maximize();

WebElement from = d.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
from.click();
WebElement place = d.findElement(By.xpath("(//li[contains(@data-ind,\"1\")])[1]"));	
place.click();

WebElement to = d.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
to.click();
WebElement location = d.findElement(By.xpath("//li[text()='Pune (All Locations)']"));	
location.click();










	}
}
