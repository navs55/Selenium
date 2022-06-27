
package com.notes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_ExecutorDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.testleaf.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor ex =(JavascriptExecutor) driver;
	Thread.sleep(5000);
	ex.executeScript("window.scroll(0,1000)", "");
	Thread.sleep(5000);
	ex.executeScript("window.scroll(0,-250)", "");
	Thread.sleep(5000);
	ex.executeScript("window.scroll(0,document.body.scrollHeight)", "");
	Thread.sleep(5000);
    ex.executeScript("window.scroll(0,0)", "");
	Thread.sleep(5000);
	driver.close();
}


}
