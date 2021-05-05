package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageObjects {
	//1 thing variable
	WebDriver driver;
	
	//2 thing locators
	private By email = By.id("email");
	private By clickSubmitButton = By.id("enterimg");
	
	//3rd thing parameterized constructor
	public SignUpPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	// 4th thing methods
	public void setEmail(String arg)
	{
		driver.findElement(email).sendKeys(arg);
	}
	public void clickOnSubmitButton()
	{
		driver.findElement(clickSubmitButton).click();
	}
	//5th wrapper methods/business/keyword methods
	public void signUpUser(String arg)
	{
		setEmail(arg);
		clickOnSubmitButton();
	}
//assertion
	public void verifyTheTitle(String expectedTitle)
	{
		String titleAfter=driver.getTitle();
		Assert.assertEquals("Register", titleAfter);
	}
	}

