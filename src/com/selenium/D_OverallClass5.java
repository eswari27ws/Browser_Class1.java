package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_OverallClass5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();

		w.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		w.manage().window().maximize();

		WebElement single = w.findElement(By.id("select-demo"));
		Select sl = new Select(single);
		sl.selectByIndex(2);
		// check Single or multiple
		boolean Single = sl.isMultiple();
		System.out.println("Single or multiple : " + Single);

		// list of array

		List<WebElement> options = sl.getOptions();

		for (WebElement li : options) {
			System.out.println(li.getText());
		}
		System.out.println("**********************************************************************************************");

		WebElement multi = w.findElement(By.xpath("//select[@id = 'multi-select']"));
		Select sl1 = new Select(multi);

		// check Single or multiple

		// list of array

		List<WebElement> options1 = sl1.getOptions();
		for (WebElement m : options1) {
			System.out.println(m.getText());
		}
		System.out.println("**********************************************************************************************");

		// isMultiple()
		boolean Multiple = sl1.isMultiple();
		System.out.println("Single or multiple : " + Multiple);
		// size

		int size = options1.size();
		System.out.println("size : " + size);
		// allSelectedOptions()
		for (int i = 0; i < size; i++) {

			sl1.selectByIndex(i);
		}
		
		System.out.println("**********************************************************************************************");

		List<WebElement> allSelectedOptions = sl1.getAllSelectedOptions();
		for (WebElement al : allSelectedOptions)

		{
			System.out.println(al.getText());
		}
		System.out.println("**********************************************************************************************");

		// getFirstSelectedOption
		WebElement firstSelectedOption = sl1.getFirstSelectedOption();
		String text = firstSelectedOption.getText();

		System.out.println("firstSelectedOption : " + text);
		// deselectAll()
		for (int i = 0; i < size; i++) {
			sl1.deselectAll();
		}
	}
}

