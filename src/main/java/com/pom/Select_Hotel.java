package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement nextpage;

	public Select_Hotel(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getNextpage() {
		return nextpage;
	}
	
	
	
	

}
