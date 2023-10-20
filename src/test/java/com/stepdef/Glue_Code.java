package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;
import com.pompage.login_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Glue_Code extends Base_Class {

	login_page lo = new login_page();

//	private login_page lo;	
	@Given("user land on home page without login")
	public void user_land_on_home_page_without_login() {

		browserLaunch("chrome");
		urlLaunch("https://fluid.travel/login");
		dynamicWait(10);
		lo = new login_page();

	}

	@When("user Enter The {string}")
	public void user_enter_the(String mail) {
		webelementClick(lo.getEmail());
		sendKeys(lo.getEmail(), mail);

	}

	@When("User Enter The {string}")
	public void User_enter_the(String pwd) {
		webelementClick(lo.getPasswd());
		sendKeys(lo.getPasswd(), pwd);

	}

	@When("User Verify The {string}")
	public void user_verify_the_login_card_label(String val) {
		WebElement label1 = driver.findElement(By.xpath("//h1[text()='Login to Fluid!']"));
		String logInCardLabel = label1.getText();
		org.junit.Assert.assertEquals(logInCardLabel, val);
	}

	@Then("user Click The Login button")
	public void user_click_the_login_button() {
		webelementClick(lo.getLoginButton());
		webelementClick(lo.getPasswd());
		sendKeys(lo.getPasswd(), "corptravelisfun");
		webelementClick(lo.getLoginButton());
	}

// Flight Search Page
	@When("user Enter The {string} and {string}")
	public void user_enter_the_and(String from, String to) {

		webelementClick(lo.getFrom());
		sendKeys(lo.getFrom(), from);
		webelementClick(lo.getFromClick());
		webelementClick(lo.getTo());
		sendKeys(lo.getTo(), to);
		webelementClick(lo.getToClick());

	}

	@When("user Select The departureDate")
	public void user_select_the_departure_date() {
		webelementClick(lo.getDepartureDatePicker());
		webelementClick(lo.getDepartureDate());
	}

	@Then("user Click The Search button")
	public void user_click_the_search_button() {

		webelementClick(lo.getSearchFlightButton());

	}

}
