package com.ipt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class meesho {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\crdrive\\msedgedriver.exe");
	WebDriver driver = (WebDriver) new EdgeDriver();
	driver.get("https://meesho.com/mobiles-and-accessories/pl/9y6n7");
	driver.manage().window().maximize();
	
List<WebElement> allprices	=driver.findElements(By.xpath("//div[@class='sc-dkzDqf iiGSqQ']/descendant::h5"));
	for ( WebElement price : allprices) {
		String priceText =price.getText();
		System.out.println(priceText);
}
	List<WebElement> minprice = driver.findElements(By.xpath("//div[@class='sc-dkzDqf iiGSqQ']/descendant::h5[2]"));
	for ( WebElement price1 : minprice) {
		String priceText1 =price1.getText();
		System.out.print("minprice:");
		System.out.println(priceText1);	
	}
	List<WebElement> names= driver.findElements(By.xpath("//div[@color='white']/descendant::p"));
	for (WebElement Brandname : names) {
		String Brand= Brandname.getText();
		System.out.println(Brand);
		
	}
	
			
		}
}
	


	
		
	
	



