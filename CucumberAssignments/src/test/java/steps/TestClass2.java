package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestClass2 {
	
	// 18- Create 4 scenarios and tag them with smoke and Regression, and run with cucumber
	public WebDriver driver;

	@Given("I am on Admin menu")
	public void iAmOnAdminMenu() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		username.click();
		username.sendKeys("Admin");
		password.click();
		password.sendKeys("admin123");
		loginButton.click();
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
	}

	@Then("Click on job")
	public void clickOnJob() {
		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		job.click();
	}

	@Then("Validate the url")
	public void validateTheUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	@Given("I am on Dashboard")
	public void iAmOnDashboard() {
		driver.findElement(By.id("menu_dashboard_index")).click();
	}

	@Then("Click on leave")
	public void clickOnLeave() {
		WebElement assignLeave = driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder>table>tbody>tr>td:nth-child(1)>div>a>img"));
		assignLeave.click();
		System.out.println(driver.getCurrentUrl());
	}

	@Given("I have to click on PIM tab")
	public void iHaveToClickOnPIMTab() {
		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
		pim.click();
	}

	@Then("Search for LindaAnderson")
	public void searchForLindaAnderson() {
		WebElement searchBox = driver.findElement(By.id("empsearch_employee_name_empName"));
		searchBox.click();
		searchBox.sendKeys("Linda Anderson");
		WebElement searchButton = driver.findElement(By.id("searchBtn"));
		searchButton.click();
	}

	@Then("Validate the result")
	public void validateTheResult() {
		WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
		String text = table.getText();
		if(text.contains("Linda Jane Anderson"))
		{
			System.out.println("Validation successful!");
		}
		else
		{
			System.out.println("Validation failed!");
		}
	}

}
