package aapmodules;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import utility.ExcelUtils;

public class SignInAction {
	public static void Execute(WebDriver driver)
	{
		String sUsername = ExcelUtils.getCellData(1,1);
		String sPassword = ExcelUtils.getCellData(1,2);
		//Home_Page.link_MyAccount(driver).click();
		LogInPage.txtbx_Username(driver).sendKeys(sUsername);
		LogInPage.txtbx_Password(driver).sendKeys(sPassword);
		LogInPage.btn_LogIn(driver).click();
	}

}
