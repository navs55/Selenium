package com.ipt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamic_web_Table {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\crdrive\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		List<WebElement> allheading =driver.findElements(By.xpath("//table[@id ='main_table_countries_today']/thead/tr/th"));
		 for (int i = 0; i < allheading.size(); i++) {
			String Title = allheading.get(i).getText().replaceAll("\n", "");
			System.out.println(Title);
		 }
			List<WebElement> alldata =driver.findElements(By.xpath("//table[@id ='main_table_countries_today']/tbody[1]/tr"));
			 for (int j = 0; j< alldata.size(); j++) {
		    String Titles = alldata.get(j).getText().replaceAll("\n", "");
					System.out.println(Titles);	
				
			
			
	}
	}
	}

	
