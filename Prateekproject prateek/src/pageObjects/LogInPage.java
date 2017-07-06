package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	private static WebElement element = null;
	public static WebElement txtbx_Username(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='user']"));
		return element;
		
	}
public static WebElement txtbx_Password(WebDriver driver)
{
	element = driver.findElement(By.xpath("//input[@id='pass']"));
	return element;
}
public static WebElement btn_LogIn(WebDriver driver)
{
	element = driver.findElement(By.xpath(".//*[@id='content']/form/div/div/div[1]/button"));
	return element;
}
}
