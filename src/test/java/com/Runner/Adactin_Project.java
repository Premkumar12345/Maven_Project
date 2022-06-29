package com.Runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.Base_Class;
import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.sdp.Page_Object_Manager;

public class Adactin_Project extends Base_Class {
	
	public static WebDriver driver= Base_Class.BrowserLaunch("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {
		

		geturl("https://adactinhotelapp.com/");

		//Login Page

		Sendkeys(pom.getHp().getUsername(), "premkumar007");
     
		Sendkeys(pom.getHp().getPassword(),"90ZPS7");

		ClickOnElement(pom.getHp().getLogin());
		
		dropdown(pom.getSh().getLocation(), "byvalue", "London");

		dropdown(pom.getSh().getHotels(), "byvisibletext", "Hotel Creek");

		dropdown(pom.getSh().getRoom_type(), "byvalue", "Double");

		dropdown(pom.getSh().getRoom_nos(), "byindex", "1");
		
		clear(pom.getSh().getDatepick_in());
		Sendkeys(pom.getSh().getDatepick_in(), "01/07/2022");

		clear(pom.getSh().getDatepick_out());
		Sendkeys(pom.getSh().getDatepick_out(), "08/07/2022");

		dropdown(pom.getSh().getAdult_room(), "byvalue", "2");

		dropdown(pom.getSh().getChild_room(), "byvalue", "1");

		ClickOnElement(pom.getSh().getSubmit());

		// Select Hotel
		ClickOnElement(pom.getSl().getRadiobutton());

		ClickOnElement(pom.getSl().getNextpage());

		// Book Hotel
		Sendkeys(pom.getBh().getFirst(), "Prem");

		Sendkeys(pom.getBh().getLast(),"kumar");

		Sendkeys(pom.getBh().getAddress(), "T.nagar");

		Sendkeys(pom.getBh().getCardno(), "2345 2345 2345 2345");

		dropdown(pom.getBh().getCardtype(), "byvalue", "VISA");

		dropdown(pom.getBh().getCardmonth(), "byvalue", "3");

		dropdown(pom.getBh().getYear(), "byvalue", "2022");

		Sendkeys(pom.getBh().getCvv(), "123");

		ClickOnElement(pom.getBh().getBooknow());

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Javit\\eclipse-workspace\\New_Maven\\Screenshot\\First.png");
		FileUtils.copyFile(src, des);
		

	}

}
