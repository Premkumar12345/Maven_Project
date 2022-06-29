package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public static WebDriver driver;
	
	public Book_Hotel(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="first_name")
	private WebElement first;
	
	@FindBy(id="last_name")
	private WebElement last;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardno;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cardmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement booknow;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
