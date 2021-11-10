
package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
	                            // simple alert
		WebElement simple = d.findElement(By.xpath("//a[contains(@class,'analystic')][1]"));
		simple.click();
		WebElement box1 = d.findElement(By.xpath("//button[@onclick='alertbox()']"));
		box1.click();
		Alert alert1 = d.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
                                //confirm alert
		Thread.sleep(2000);
		
		WebElement confirm = d.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		WebElement co = d.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		co.click();
		Alert alert2 = d.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();;
		WebElement value = d.findElement(By.id("demo"));
		System.out.println("confirm value : "+value.getText());
		                            //prompt alert
		Thread.sleep(2000);
		
		WebElement prompt = d.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt.click();
		WebElement po = d.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		po.click();
		Alert alert3 = d.switchTo().alert();
		alert3.sendKeys("Hi Welcome******************");
		alert3.accept();
		WebElement Value1 = d.findElement(By.id("demo1"));
		System.out.println("prompt Value : "+Value1.getText());
	}
}
