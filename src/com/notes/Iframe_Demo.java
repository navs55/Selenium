package com.notes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Iframe_Demo {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	WebElement s =driver .findElement(By.id("Click"));
	s.click();
	Thread.sleep(5000);
	String p = driver.findElement(By.id("Click")).getText();
	System.out.println(p);
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	WebElement s1 = driver.findElement(By.id("Click1"));
	s1.click();
	Thread.sleep(5000);
	String q= driver.findElement(By.id("Click1")).getText();
	System.out.println(q);
	Thread.sleep(5000);
	
	List<WebElement> tNo = driver.findElements(By.tagName("iframe id "));
	int k = tNo.size();
	System.out.println("Total no of iframes:" + k);
}

}
