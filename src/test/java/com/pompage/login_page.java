package com.pompage;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;

public class login_page extends Base_Class {

	public login_page() {
		PageFactory.initElements(driver, this);
	}

// login Page
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement passwd;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

// Flight Search page
	@FindBy(xpath = "//input[@id='downshift-0-input']")
	private WebElement from;

	@FindBy(xpath = "//span[text()='Chennai']")
	private WebElement fromClick;

	@FindBy(xpath = "//input[@id='downshift-1-input']")
	private WebElement to;

	@FindBy(xpath = "//li[@id='downshift-1-item-0']")
	private WebElement toClick;

	@FindBy(xpath = "//input[@id='date_picker_single_departure_date']")
	private WebElement departureDatePicker;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchFlightButton;

	public WebElement getDepartureDatePicker() {
		return departureDatePicker;
	}

	@FindBy(xpath = "//span[text()='30']")
	private WebElement departureDate;

	public WebElement getSearchFlightButton() {
		return searchFlightButton;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getFromClick() {
		return fromClick;
	}

	public WebElement getToClick() {
		return toClick;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

}
