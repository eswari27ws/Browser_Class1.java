package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_MultipleList_Class5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		d.manage().window().maximize();

		WebElement multi = d.findElement(By.xpath("//select [contains(@multiple,'multiple')]"));
		Select m = new Select(multi);

		System.out.println("******************************************************");

		// isMultiple()
		boolean multiple = m.isMultiple();
		System.out.println("multiple or not : " + multiple);
		System.out.println("***************Option************************");

		// getOptions()
		List<WebElement> options = m.getOptions();
		for (WebElement mi : options) {
			System.out.println(mi.getText());
		}
		System.out.println("******************************************************");
		int size = options.size();
		System.out.println("size : " + size);

		for (int i = 0; i < size; i++) {
			m.selectByIndex(i);
		}

		                // deselectByIndex()
		m.deselectByIndex(0);
		Thread.sleep(5000);
		
		               // deselectByValue()
		m.deselectByValue("Florida");
		Thread.sleep(5000);
		
		              // deselectByVisibleText()
		m.deselectByVisibleText("Ohio");

		System.out.println("***************allselected Option*********************");

		List<WebElement> allSelectedOptions = m.getAllSelectedOptions();

		for (WebElement all : allSelectedOptions) {
			System.out.println(all.getText());
		}

		System.out.println("******************************************************");

		// getFirstSelectedOption()

		WebElement firstSelectedOption = m.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("firstSelectedOption : " + text);
		
		            // deselectAll()
		m.deselectAll();
		Thread.sleep(5000);
		
		           // selectByIndex()
		m.selectByIndex(1);
		Thread.sleep(5000);
		
		           // selectByValue()
		m.selectByValue("New Jersey");
		Thread.sleep(5000);
		
		           // selectByVisibleText()
		m.selectByVisibleText("New York");

	}
}
