package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import aapmodules.SignInAction;
import utility.Constants;
import utility.ExcelUtils;

public class Apachepoitc {
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
   //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
   ExcelUtils.setExcelFile(Constants.Pathtestdata + Constants.filetestdata,"Sheet1" );
   System.setProperty("webdriver.gecko.driver", "C:/Users/Prateek/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(Constants.URl);
	SignInAction.Execute(driver);
	System.out.println("Login Successfully now its the time to log off buddy");
	driver.quit();
	ExcelUtils.setCellData("Pass", 1, 3);
   
	}

}
