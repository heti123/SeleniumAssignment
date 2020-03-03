package com.MakeMyTrip.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//li[@class= \"   menu_Flights \"] //a[contains(@class,'hrtlCenter')]")
	WebElement flightsTab;
	
	@FindBy(xpath="(//span[@class=\"tabsCircle appendRight5\"])[2]")
	WebElement roundTrip; 
	
	@FindBy(linkText="From")
	WebElement fromCity;
	
	@FindBy(id="fromCity")
	WebElement fromCityEnter;
	
	


}
