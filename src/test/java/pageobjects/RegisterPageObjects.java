package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageObjects {
	//1 thing variable
		WebDriver driver;
		
		//2 thing locators
		private By firstName = By.xpath("//input[@ng-model='FirstName']");
		private By lastName = By.xpath("//input[@ng-model='LastName']");
		private By address =By.xpath("//textarea[@ng-model='Adress']");
		private By email =By.xpath("//input[@ng-model='EmailAdress']");
		private By phone =By.xpath("//input[@ng-model='Phone']");
		private By genderRadioFemale =By.xpath("//input[@ng-model='radiovalue' and @value='FeMale']");
		private By cricketCheckbox =By.xpath("//input[@type='checkbox' and @value='Cricket']");
		private By movieCheckbox =By.xpath("//input[@type='checkbox' and @value='Movies']");
		private By skillsDropDown =By.id("Skills");
		
		//3rd thing parameterized constructor
		public RegisterPageObjects(WebDriver driver)
		{
			this.driver = driver;
		}
	public void setFirstNameTextBox(String arg) {
	driver.findElement(firstName).sendKeys(arg);
	}
	public void clickOnGenderAsFemale() {
		driver.findElement(genderRadioFemale).click();
	}
	public void selectSkillsFromList(String arg) {
		WebElement skillsList=driver.findElement(skillsDropDown);
		Select list = new Select(skillsList);
		list.deselectByVisibleText(arg);
	}
}
