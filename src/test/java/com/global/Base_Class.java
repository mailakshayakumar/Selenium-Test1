package com.global;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;
		public static WebDriver launch() {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 return driver;
		}
		public static void loadurl(String s)
		{
			driver.get(s);
		}
		public static void type(WebElement element,String s)
		{
			element.sendKeys(s);
		}
			public static void clicked(WebElement element)
			{
				element.click();
			}
		public static void scroll(WebElement element)
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)", element);
			}
		public static void down(int times) throws AWTException {
			Robot r=new Robot();
			for (int i = 0; i < times; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_DOWN);
	}

		}
