package com.notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://www.leafground.com/pages/drop.html");
	driver.manage().window().maximize();
		
	WebElement From = driver.findElement(By.id("draggable"));
	WebElement To  =  driver.findElement(By.id("droppable"));
	Thread.sleep(5000);
	Actions a = new Actions(driver);
	Thread.sleep(5000);
	//a.clickAndHold(From).moveToElement(To).build().perform();
	a.dragAndDrop(From, To).build().perform();
	Thread.sleep(5000);
	driver.close();
}
}
