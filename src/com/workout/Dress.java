package com.workout;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.Select;
public class Dress {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://automationpractice.com/index.php");
		d.manage().window().maximize();
		
		Actions a = new Actions(d);
		WebElement buy = d.findElement(By.xpath("//a[@title='Women']"));
		Robot r = new Robot();
		a.contextClick(buy).build().perform();

		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		JavascriptExecutor j = (JavascriptExecutor) d;
		j.executeScript("window.scroll(0,800)", "");

		Thread.sleep(3000);
		TakesScreenshot ks = (TakesScreenshot) d;
		File sour = ks.getScreenshotAs(OutputType.FILE);
		File Desti = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Screenshot\\scroll.png");
		FileUtils.copyFile(sour, Desti);
		
		Thread.sleep(3000);
		Set<String> bp = d.getWindowHandles();
		for (String si : bp) {
			d.switchTo().window(si);
		}
		Thread.sleep(3000);
		
		WebElement black = d.findElement(
				By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=2&controller=product'])[1]"));

		a.contextClick(black).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
		Set<String> blac = d.getWindowHandles();
		for (String by : blac) {
			d.switchTo().window(by);
		}
		WebElement cart = d.findElement(By.xpath("(//button[@type='submit'])[3]"));
		a.click(cart).build().perform();

		Thread.sleep(3000);
		WebElement proceed = d.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		Thread.sleep(3000);
		proceed.click();

		WebElement process = d.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		process.click();
		WebElement create = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		a.click(create).sendKeys("ishuws50006@gmail.com").build().perform();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		WebElement Information = d.findElement(By.id("id_gender2"));
		Information.click();
		System.out.println(Information.isSelected());

		WebElement firstname = d.findElement(By.id("customer_firstname"));
		firstname.sendKeys("ishu");
		d.findElement(By.id("customer_lastname")).sendKeys("ajay");

		d.findElement(By.id("passwd")).sendKeys("12345688");

		WebElement day = d.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("27");

		WebElement month = d.findElement(By.id("months"));
		Select m = new Select(month);
		m.selectByIndex(2);

		WebElement year = d.findElement(By.id("years"));
		Select y = new Select(year);
		y.selectByValue("1998");

		WebElement compny = d.findElement(By.xpath("(//input[@type='text'])[7]"));
		compny.sendKeys("Greens");

		WebElement addr = d.findElement(By.xpath("(//input[@type='text'])[8]"));
		addr.sendKeys("No.10, bharathidasan st, ma po c nagar");

		WebElement city = d.findElement(By.id("city"));
		city.sendKeys("thiruvallur");

		WebElement state = d.findElement(By.id("id_state"));
		Select t = new Select(state);
		t.selectByValue("14");

		WebElement code = d.findElement(By.id("postcode"));
		code.sendKeys("00000");

		WebElement country = d.findElement(By.id("id_country"));
		Select c = new Select(country);
		c.selectByIndex(1);

		WebElement mobile = d.findElement(By.id("phone_mobile"));
		mobile.sendKeys("9876543221");

		WebElement add1 = d.findElement(By.id("alias"));
		add1.sendKeys("bharathidasan st");

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Button = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Button.click();

		Thread.sleep(3000);
		WebElement agree = d.findElement(By.id("cgv"));
		agree.click();
		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		d.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		Thread.sleep(3000);
		JavascriptExecutor k = (JavascriptExecutor) d;
		k.executeScript("window.scroll(0,100)", "");

		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Screenshot\\order.png");
		FileUtils.copyFile(source, Destination);

		Thread.sleep(3000);
		int size = d.getWindowHandles().size();
		System.out.println("size : " + size);

		String parentid = d.getWindowHandle();
		System.out.println("parentid : " + parentid);

		Set<String> Title = d.getWindowHandles();
		for (String ti : Title) {
			String title2 = d.switchTo().window(ti).getTitle();
			System.out.println("Title : " + title2);
		}
		String spchild = "Order confirmation - My Store";
		for (String sp : Title) {
			if (d.switchTo().window(sp).getTitle().equalsIgnoreCase(spchild));
			break;
		}

		Thread.sleep(5000);
	}
}
