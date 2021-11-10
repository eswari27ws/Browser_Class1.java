
package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_SingleList_Class5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();

		d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		d.manage().window().maximize();

		WebElement single = d.findElement(By.xpath("//select [contains(@class,'form-control')]"));
		Select s = new Select(single);

		// selectByIndex

		s.selectByIndex(1);
		Thread.sleep(3000);

		// selectByValue

		s.selectByValue("Monday");
		Thread.sleep(3000);

		// selectByVisibleText

		s.selectByVisibleText("Wednesday");
		Thread.sleep(3000);

		// getOptions()

		List<WebElement> options = s.getOptions();
		for (WebElement li : options) {
			System.out.println(li.getText());
		}

		// isMultiple()

		boolean multiple = s.isMultiple();
		System.out.println("multiple or not : " + multiple);
	}
}
