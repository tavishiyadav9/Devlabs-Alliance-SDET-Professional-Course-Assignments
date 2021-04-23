package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass1 {

	public WebDriver driver;
	
	/* 
	 * 17- Automate another cucumber scenario – 
	 * Background: I am logged into Orange Application. 
	 * Given- When I click on Admin Link 
	 * Then-Click on Job 
	 * AND- validate text – Job Title
	 */
	
	@Given("I click on Admin Link")
	public void iClickOnAdminLink() {
		iAmInOrangeHRPApplication();
		loginToApplication();
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
	}

	@Then("Click on Job")
	public void clickOnJob() {
		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		job.click();
	}

	@Then("validate text Job Title")
	public void validateTextJobTitle() {
		clickOnJob();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	
	/*
	 * 16- Automate below cucumber scenario - 
	 * Given- When I am in OrangeHRP Application 
	 * Then- Login to Application 
	 * When- Dashboard page is available 
	 * AND- click on Admin menu
	 */

	@Given("I am in OrangeHRP Application")
	public void iAmInOrangeHRPApplication() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("Login to Application")
	public void loginToApplication() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		username.click();
		username.sendKeys("Admin");
		password.click();
		password.sendKeys("admin123");
		loginButton.click();
	}

	@When("Dashboard page is available")
	public void dashboardPageIsAvailable() {
		System.out.println(driver.getCurrentUrl());
	}

	@When("click on Admin menu")
	public void clickOnAdminMenu() {
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
		driver.quit();
	}
}
