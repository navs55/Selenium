package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser3 {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.flipkart.com/");
	   driver.manage().window().maximize();
		
	}

}
