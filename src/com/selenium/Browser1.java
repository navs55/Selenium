package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String title =driver.getTitle();
		System.out.println("Title: "+ title);
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println("URL : "+ url);
		Thread.sleep(5000);
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("navsw55@gmail.com");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("797060@sai$$");
		Thread.sleep(5000);
		WebElement login = driver .findElement(By.name("login"));
		login.click();
	
		
		
		
	}
	
	

}
