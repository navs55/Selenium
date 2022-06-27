package com.notes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Demo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
        WebElement fbte = driver.findElement(By.xpath(" //button[@onclick='normalAlert()']"));
		fbte.click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		
		WebElement cfrm = driver.findElement(By.xpath(" //button[@onclick= 'confirmAlert()']"));
		cfrm.click();
		Alert b = driver.switchTo().alert();
		Thread.sleep(5000);
		b.dismiss();
		
		WebElement prm = driver.findElement(By.xpath(" //button[@onclick= 'confirmPrompt()']"));
		prm.click();
		Alert c = driver.switchTo().alert();
		Thread.sleep(5000);
		c.sendKeys("great");
		Thread.sleep(5000);
		c.accept();
		Thread.sleep(5000);
		
		driver.close();
		
	}
	

}
