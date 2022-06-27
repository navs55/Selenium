package com.notes;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
driver.manage().window().maximize();
WebElement w =driver.findElement(By.name("coffee"));
Select s = new Select(w);
//s.selectByValue("sugar");
//s.selectByIndex(3);
s.selectByVisibleText("With cream & sugar");

TakesScreenshot ts = (TakesScreenshot) driver;//narrow
File Source = ts.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\acer\\eclipse-workspace\\Selenium\\Screenshot\\sugar.png");
FileUtils.copyFile(Source, des);
 
}
}
