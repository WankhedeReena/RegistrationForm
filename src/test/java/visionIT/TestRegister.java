package visionIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRegister {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in//Register.html");
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Reena");
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
		countryDropDown.selectByVisibleText("India");
		//WebElement countriesListElement = driver.findElement(By.xpath("//li[text()='India']"));
		//Select countriesDropDown = new Select(countriesListElement);
		//countriesDropDown.deselectByVisibleText("India");
		;
		
	}

}
