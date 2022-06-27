package com.notes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

    public class WebTable_Demo {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
	System.out.println("********ALL THE TEXT  FROM THE WEBTABLE*********");
	List<WebElement> alldata =driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement webdata : alldata) {
	System.out.println(webdata.getText());
	}
	System.out.println("***************************************");
	System.out.println("**************Particular cl data************");
	WebElement cdata = driver.findElement(By.xpath("//table/tbody/tr/td[2]"));
	System.out.println(cdata.getText());
	
	System.out.println("****************************");
	System.out.println("*************Particular data*******************");
	List<WebElement> pardata = driver.findElements(By.xpath("//table/tbody/tr[3]/td[2]"));
	for (WebElement rowdata : pardata) {
	System.out.println(rowdata.getText());
	}
	List<WebElement> ch = driver.findElements(By.name("vital"));
	for (WebElement check : ch){
	check.click();
	}

}
}

