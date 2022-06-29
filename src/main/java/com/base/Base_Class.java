package com.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	// Browser launch
	public static WebDriver BrowserLaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Javit\\eclipse-workspace\\maven\\Driver\\chromedriver2.exe");

			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Javit\\eclipse-workspace\\Mini_Project\\Driver\\chromedriver1.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		return driver;
	}

	// Click
	public static void ClickOnElement(WebElement element) {

		element.click();

	}

	// SendKeys
	public static void Sendkeys(WebElement element, String type) {

		element.sendKeys(type);
	}

	// GetUrl
	public static void geturl(String url) {

		driver.get(url);
	}

	// Close
	public static void close() {

		driver.close();
	}

	// Quit
	public static void quit() {

		driver.quit();
	}

	// implicitWait
	public static void ImplicitWait(int time, TimeUnit unit) {

		driver.manage().timeouts().implicitlyWait(time, unit);
	}

	// Screenshot
	public static void Screenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyDirectory(src, des);

	}

	// dropdown
	public static void dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("ByValue")) {

			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("ByIndex")) {

			int data = Integer.parseInt(value);
			s.selectByIndex(data);

		} else if (type.equalsIgnoreCase("ByVisibleText")) {

			s.selectByVisibleText(value);

		}

	}

	// deselect dropdown
	public static void deselect_dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("DeselectbyValue")) {

			s.deselectByValue(value);

		} else if (type.equalsIgnoreCase("DeselectbyIndex")) {

			int data2 = Integer.parseInt(value);
			s.deselectByIndex(data2);

		} else if (type.equalsIgnoreCase("DeselectbyVisibletext")) {

			s.deselectByVisibleText(value);
		}

	}

	// Navigate TO
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	// Navigate Forward
	public static void navigateforward() {
		driver.navigate().forward();
	}

	// Refresh
	public static void refresh() {
		driver.navigate().refresh();
	}

	// Alert
	public static void alert() {
		driver.switchTo().alert();

	}

	// mainpage to frame
	public static void frames(String element) {
		driver.switchTo().frame(element);

	}

	// frame to mainpage
	public static void iframe() {
		driver.switchTo().defaultContent();

	}

	// frame child to parent
	public static void parentframe() {
		driver.switchTo().parentFrame();

	}

	// isdisplayed
	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	// isenabled
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	// isselected
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}
	
	//GetOptions
	
	public static void getoption(WebElement element) {

		Select s = new Select(element);
		List<WebElement> alloptions = s.getOptions();
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);
		}
	}
	
	//javascript click
	
	 public static void jsClick(WebElement element) {
	    	JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	executor.executeScript("arguments[0].click()", element);
	    }
	
	//clear
	public static void clear(WebElement element) {

		element.clear();
		
	}
	
	

}
