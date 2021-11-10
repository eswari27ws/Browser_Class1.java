package com.selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://letcode.in/table");
		d.manage().window().maximize();
		List<WebElement> list = d.findElements(By.xpath("//table[@name='table']"));

		for (WebElement li : list) {
			System.out.print(li.getText());
		}
		System.out.println(" ");

		List<WebElement> header = d.findElements(By.xpath("//table[@name='table']//tr/th"));
		System.out.println("-------------------------header list  ------------------------------");

		for (WebElement h : header) {
			System.out.println(h.getText());
		}
		int size = header.size();

		System.out.println("header size : " + size);

		List<WebElement> col = d.findElements(By.xpath("//table[@name='table']/tbody/tr/td[1]"));
		System.out.println("--------------------------- col data ------------------------------");
		for (WebElement co : col) {
			System.out.println(co.getText());
		}
		int size2 = col.size();
		System.out.println("Col size : " + size2);

		List<WebElement> row = d.findElements(By.xpath("//table[@name='table']/tbody/tr[2]/td"));
		System.out.println("-----------------------  row data  -------------------------");
		for (WebElement ro : row) {
			System.out.println(ro.getText());
		}
		int size3 = row.size();
		System.out.println("row size : " + size3);

		WebElement particular = d.findElement(By.xpath("//table[@name='table']/tbody/tr[3]/td[3]"));
		System.out.println("-----------------------  particular data  -------------------------");
		System.out.println(particular.getText());

		d.quit();
	}
}
