package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");

		Dimension di = new Dimension(800, 1000);
		d.manage().window().setSize(di);
		Actions a = new Actions(d);
		WebElement drag = d.findElement(By.id("box4"));
		WebElement drop = d.findElement(By.id("dropBox"));
		a.dragAndDrop(drag, drop).perform();

		Thread.sleep(2000);
		WebElement drag1 = d.findElement(By.id("box1"));
		WebElement drop1 = d.findElement(By.id("dropBox"));
		a.dragAndDrop(drag1, drop1).perform();

		Thread.sleep(2000);
		WebElement drag2 = d.findElement(By.id("box2"));
		WebElement drop2 = d.findElement(By.id("dropBox"));
		a.dragAndDrop(drag2, drop2).perform();
		
		Thread.sleep(2000);
		WebElement drag3 = d.findElement(By.id("box3"));
		WebElement drop3 = d.findElement(By.id("dropBox"));
		a.clickAndHold(drag3).moveToElement(drop3).build().perform();
		
	}

}
