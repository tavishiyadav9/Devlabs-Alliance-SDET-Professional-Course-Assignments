import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/* 
13- Execute following scenario
• Login to OrangeHRM
• Click on PIM
• Enter Employee Name-Linda Anderson in Search box (refer below image)
• Validate and capture screenshot */
public class PIM {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login() { 
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		username.click();
		username.sendKeys("Admin");
		password.click();
		password.sendKeys("admin123");
		loginButton.click();
	}
	
	@Test(priority = 1)
	public void pim() {
		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
		pim.click();
	}
	
	@Test(priority = 2)
	public void search() {
		WebElement searchBox = driver.findElement(By.id("empsearch_employee_name_empName"));
		searchBox.click();
		searchBox.sendKeys("Linda Anderson");
		WebElement searchButton = driver.findElement(By.id("searchBtn"));
		searchButton.click();
	}
	
	@Test(priority = 3, dependsOnMethods = "search")
	public void validate() {
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
		Shutterbug.shootPage(driver).save("C:\\OneDrive\\Desktop\\Selenium Assignment Screenshots");
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
	
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}
}
