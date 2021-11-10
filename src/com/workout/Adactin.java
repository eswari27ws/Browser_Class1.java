package com.workout;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://adactinhotelapp.com/");
		d.manage().window().maximize();

		d.findElement(By.id("username")).sendKeys("IswariyaR");
		d.findElement(By.id("password")).sendKeys("Ishuajay");
		d.findElement(By.id("login")).click();

		WebElement Location = d.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(Location);
		s.selectByIndex(5);

		WebElement hotel = d.findElement(By.xpath("//select[@name='hotels']"));
		Select h = new Select(hotel);
		h.selectByValue("Hotel Sunshine");

		WebElement roomtype = d.findElement(By.xpath("//select[@name='room_type']"));
		Select rt = new Select(roomtype);
		rt.selectByValue("Double");

		WebElement roomnum = d.findElement(By.xpath("//select[@name='room_nos']"));
		Select n = new Select(roomnum);
		n.selectByValue("2");

		WebElement indate = d.findElement(By.id("datepick_in"));
		indate.clear();
		indate.sendKeys("22/10/2021");

		WebElement outdate = d.findElement(By.id("datepick_out"));
		outdate.clear();
		outdate.sendKeys("24/10/2021");

		WebElement adult = d.findElement(By.xpath("//select[@name='adult_room']"));
		Select ad = new Select(adult);
		ad.selectByIndex(2);

		WebElement child = d.findElement(By.xpath("//select[@name='child_room']"));
		Select ch = new Select(child);
		ch.selectByIndex(2);

		d.findElement(By.id("Submit")).click();

		WebElement radio = d.findElement(By.xpath("//input[@name='radiobutton_0']"));
		System.out.println("button click or not : " + radio.isSelected());
		radio.click();

		d.findElement(By.xpath("//input[@type='submit']")).click();

		d.findElement(By.id("first_name")).sendKeys("Iswariya");
		d.findElement(By.id("last_name")).sendKeys("Rs");
		d.findElement(By.id("address")).sendKeys("No.10, Bharathidasan st, Thrivallur");
		d.findElement(By.id("cc_num")).sendKeys("1234567890987654");

		WebElement credit = d.findElement(By.xpath("//select[@name='cc_type']"));
		Select cr = new Select(credit);
		cr.selectByIndex(2);

		WebElement Expiry1 = d.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select e1 = new Select(Expiry1);
		e1.selectByIndex(2);

		WebElement Expiry2 = d.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select e2 = new Select(Expiry2);
		e2.selectByValue("2022");

		d.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("098");
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		
		WebElement Itinerary = d.findElement(By.xpath("//input[@name='my_itinerary']"));
		Itinerary.click();
		d.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

		d.findElement(By.xpath("//input[@name='cancelall']")).click();
		Alert alert = d.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		TakesScreenshot ks = (TakesScreenshot) d;
		File so = ks.getScreenshotAs(OutputType.FILE);
		File De = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Screenshot\\adatic.png");
		FileUtils.copyFile(so, De);
		
		Thread.sleep(3000);
		d.findElement(By.id("logout")).click();
	}
}
