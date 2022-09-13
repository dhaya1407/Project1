package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	
	WebDriver driver;

	@Given("User is on the facebook page")
	public void user_is_on_the_facebook_page() {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

	   
	}
	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("dhaya");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345");
	    
	}
	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();
	   
	}
	@Then("User should verify success msg")
	public void user_should_verify_success_msg() {
	   
	}
	@Then("User should verify success msg")
	public void user_should_verify_success_msg2() {
	   
	}

@Then("User should verify success msg")
public void user_should_verify_success_msg1() {
   
}




}
