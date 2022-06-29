package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private Home_Page hp;
	private Select_Hotel sl;
	private Search_Hotel sh;
	private Book_Hotel bh;
	public Page_Object_Manager(WebDriver driver2) {

		Page_Object_Manager.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}
	public Home_Page getHp() {
		hp = new Home_Page(driver);
		return hp;
	}
	public Select_Hotel getSl() {
		sl = new Select_Hotel(driver);
		return sl;
	}
	public Search_Hotel getSh() {
		sh = new Search_Hotel(driver);
		return sh;
	}
	public Book_Hotel getBh() {
		bh = new Book_Hotel(driver);
		return bh;
	}

}
