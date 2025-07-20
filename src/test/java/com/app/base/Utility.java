package com.app.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	public static WebDriver driver = null;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	public static void main(String[] args) {
		
		Set<String> windowHandles = driver.getWindowHandles();
		//forloop -> 
		
		ChromeDriver ch = new ChromeDriver();
		
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id(""));
		
		
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.KEY_FIRST);
			Actions a  = new Actions(driver);
			a.keyDown(Keys.ADD);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserLaunch();
	}

}
