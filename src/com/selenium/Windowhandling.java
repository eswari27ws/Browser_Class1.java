
package com.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Basic\\Driver\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.amazon.in/");
d.manage().window().maximize();
Actions a = new Actions(d);
WebElement mobile = d.findElement(By.xpath("//a[@class='nav-a  '][1]"));
a.contextClick(mobile).build().perform();
Robot r = new Robot();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

WebElement Fashion = d.findElement(By.xpath("//a[@class='nav-a  '][4]"));
a.contextClick(Fashion).build().perform();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

WebElement electronic = d.findElement(By.xpath("//a[@class='nav-a  '][3]"));
a.contextClick(electronic).build().perform();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(2000);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_TAB);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_TAB);

Thread.sleep(2000);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_TAB);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_TAB);

 
String PI = d.getWindowHandle();

System.out.println("parent id : "+PI);

int size = d.getWindowHandles().size();
System.out.println("size : "+size);

Set<String> wl = d.getWindowHandles();

for (String li : wl) {
	String title = d.switchTo().window(li).getTitle();
	System.out.println("title : "+title);







}
}
}