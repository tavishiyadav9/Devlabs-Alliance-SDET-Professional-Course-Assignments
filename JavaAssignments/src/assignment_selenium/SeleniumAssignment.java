package assignment_selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment {

	public static void main(String[] args) {
		
		// 1- Open the above URL in Chrome browser.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// 2- Print the title of this application.
		System.out.println(driver.getTitle());
		
		// 3- Write Xpath and CssSelector of login page for following web objects - All Text box’s, All - Hyperlinks, All Images.
		
		// ------------- Xpath -------------
		// Text boxes
		WebElement username = driver.findElementByXPath("//*[@id=\"txtUsername\"]");
		WebElement password = driver.findElementByXPath("//*[@id=\"txtPassword\"]");
		WebElement loginButton = driver.findElementByXPath("//*[@id=\"btnLogin\"]");
		// Hyperlinks
		WebElement forgotPasswordLink = driver.findElementByXPath("//*[@id=\"forgotPasswordLink\"]/a");
		// Images
		WebElement logo = driver.findElementByXPath("//*[@id=\"divLogo\"]/img");
		WebElement loginImage = driver.findElementByXPath("//*[@id=\"divLoginImage\"]");
		
		// ------------- CssSelector -------------
		// Text boxes
		WebElement username_css = driver.findElementByCssSelector("input[name='txtUsername']");
		WebElement password_css = driver.findElementByCssSelector("input[name='txtPassword']");
		WebElement loginButton_css = driver.findElementByCssSelector("input[type='submit']");
		// Hyperlinks
		WebElement forgotPasswordLink_css = driver.findElementByCssSelector("div#forgotPasswordLink>a");
		// Images
		WebElement logo_css = driver.findElementByCssSelector("div#divLogo>img");
		WebElement loginImage_css = driver.findElementByCssSelector("#divLoginImage");
		
		// 4- Login with given User Name and Password and validate Dashboard.
		username.click();
		username_css.sendKeys("Admin");
		password.click();
		password_css.sendKeys("admin123");
		loginButton.click();
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			System.out.println("Dashboard validated!");
		}
		else
		{
			System.out.println("Dashboard not validated!");
		}
		
		/* 5- Click on Admin Link in Home Page and validate following text -
		• User Management
		• Job
		• Organization
		• Qualifications */
		WebElement admin = driver.findElementById("menu_admin_viewAdminModule");
		admin.click();
		WebElement userManagement = driver.findElementById("menu_admin_UserManagement");
		WebElement job = driver.findElementById("menu_admin_Job");
		WebElement organization = driver.findElementById("menu_admin_Organization");
		WebElement qualifications = driver.findElementById("menu_admin_Qualifications");
		if(userManagement.isDisplayed())
		{
			System.out.println("User Management validated!");
		}
		else
		{
			System.out.println("User Management not validated!");
		}
		if(job.isDisplayed())
		{
			System.out.println("Job validated!");
		}
		else
		{
			System.out.println("Job not validated!");
		}
		if(organization.isDisplayed())
		{
			System.out.println("Organization validated!");
		}
		else
		{
			System.out.println("Organization not validated!");
		}
		if(qualifications.isDisplayed())
		{
			System.out.println("Qualifications validated!");
		}
		else
		{
			System.out.println("Qualifications not validated!");
		}
		
		driver.quit();

	}

}
