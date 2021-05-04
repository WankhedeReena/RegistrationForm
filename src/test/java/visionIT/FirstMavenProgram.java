package visionIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenProgram {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in//Index.html");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("reena.wankhede@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		String titleAfter=driver.getTitle();
		if(titleAfter.equalsIgnoreCase("Register"))
				{
			System.out.println("Test case is Pass");
				}
		else
		{
			System.out.println("Test case is fail");
		}
	}
}