package visionIT;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import pageobjects.RegisterPageObjects;
import pageobjects.SignUpPageObjects;

public class TestScriptJunit2 extends TestBase{
	/*WebDriver driver;
	String baseURL = "http://demo.automationtesting.in";
	//hooks method to avoid repetition of below steps
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	@After
	public void cleanUp()
	{
		driver.quit();
	}*/
	@Test
	public void t_01_sign_up()
	{
		//steps
		
		driver.get(baseUrl + "/Index.html");
		SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);
		//actual test steps
		//wrapper method call instead of this below two lines
		signUpPageObjects.signUpUser("reena.wankhede@gmail.com");
		/*signUpPageObjects.setEmail("reena.wankhede@gmail.com");
		signUpPageObjects.clickOnSubmitButton();*/
		
		
		/*WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("reena.wankhede@gmail.com");
		driver.findElement(By.id("enterimg")).click();*/
		//String titleAfter=driver.getTitle();
		//validation 
		signUpPageObjects.verifyTheTitle("Register");
		//Assert.assertEquals("Register", titleAfter);
		/*if(titleAfter.equalsIgnoreCase("Register"))
				{
			System.out.println("Test case is Pass");
				}
		else
		{
			System.out.println("Test case is fail");
		}*/
	}
	@Test
    public void t_02_registration_form()
    {
		
		driver.get(baseUrl + "/Register.html");
		
		RegisterPageObjects registerPageObjects = new RegisterPageObjects(driver);
		registerPageObjects.setFirstNameTextBox("Reena");
		registerPageObjects.clickOnGenderAsFemale();
		registerPageObjects.selectSkillsFromList("Analytics");
		/*driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Reena");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Wankhede");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("reena.wankhede@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9845445445");
		driver.findElement(By.xpath("//input[@ng-model='radiovalue' and @value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();
		WebElement skillsListElement = driver.findElement(By.id("Skills"));
		Select skillsDropDown = new Select(skillsListElement);
		skillsDropDown.selectByVisibleText("Analytics");
		WebElement countryListElement = driver.findElement(By.id("countries"));
		Select countryDropDown = new Select(countryListElement);
		countryDropDown.selectByVisibleText("India");*/	
		//AssertionJunit
    }
}



