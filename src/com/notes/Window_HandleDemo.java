package com.notes;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_HandleDemo {
	public static void main(String[] args) throws  Throwable{
		System.setProperty("webdriver.edge.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe ");
		WebDriver driver = new EdgeDriver();
		driver.get(" https://www.amazon.in/ ");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		WebElement best  = driver.findElement(By.xpath("//a[text() ='Best Sellers'][1]"));
		a.contextClick(best).build().perform();
		Thread.sleep(5000);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mob).build().perform();
		Thread.sleep(5000);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		

		WebElement cs = driver.findElement(By.xpath("//a[text()='Customer Service'][1]"));
		a.contextClick(cs).build().perform();
		Thread.sleep(5000);
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		//to get size of window
		int size =driver.getWindowHandles().size();
		System.out.println("Total window count:"+size);
		System.out.println("********************************************");
		//to get title of particular window
		String pw =driver.getWindowHandle();
		System.out.println(pw);
		System.out.println("********************************************");
		//get title for all window
		Set<String> allwind =driver.getWindowHandles();
		for (String cp: allwind) {
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println("All window Title:"+title);
			}
		Thread.sleep(2000);
		String actual_title ="Mobiles";
		for (String c1 : allwind) {
        if (driver.switchTo().window(c1).getTitle().equals(actual_title)) {
        	break;
		}			
		}
	WebElement search = driver.findElement(By.xpath("//input[@ type='text']"));
	search.sendKeys("IPhone");
	Thread.sleep(2000);
	WebElement enter_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	enter_btn.click();
	
	}
}

