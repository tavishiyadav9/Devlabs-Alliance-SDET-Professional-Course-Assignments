import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Listeners(SeleniumAssignmentTest.class)

public class SeleniumAssignment {

	public WebDriver driver;
	// 6- Launch a browser in @Beforesuite annotation and open url . url - https://opensource-demo.orangehrmlive.com/
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	// 7- Login to application again in @Test method, set priority 1 of the same method After logging	
	@Test(priority = 1)
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

	// 8- Write Test method and page title for different menus- in order(Admin, PIM, Leave, Dashboard, Directory and Maintenance)
	@Test(priority = 2)
	public void admin() {
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();
		System.out.println("Title for Admin: "+driver.getTitle());
	}

	@Test(priority = 3)
	public void pim() {
		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
		pim.click();
		System.out.println("Title for PIM: "+driver.getTitle());
	}

	@Test(priority = 4)
	public void leave() {
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		leave.click();
		System.out.println("Title for Leave: "+driver.getTitle());
	}

	@Test(priority = 5)
	public void dashboard() {
		WebElement dashboard = driver.findElement(By.id("menu_dashboard_index"));
		dashboard.click();
		System.out.println("Title for Dashboard: "+driver.getTitle());
	}

	@Test(priority = 6)
	public void directory() {
		WebElement directory = driver.findElement(By.id("menu_directory_viewDirectory"));
		directory.click();
		System.out.println("Title for Directory: "+driver.getTitle());
	}

	@Test(priority = 7)
	public void maintenance() {
		WebElement maintenance = driver.findElement(By.id("menu_maintenance_purgeEmployee"));
		maintenance.click();
		System.out.println("Title for Maintenance: "+driver.getTitle());
	}

	// 9- Write a method (avoid using Test annotation) to minimize the window.
	@AfterTest
	public void afterTest() {
		Dimension minimize = new Dimension(100,500);
		driver.manage().window().setSize(minimize);
	}

	// 10- Read Dashboard heading using [driver.findelement(by.xpath()).gettext()]
	@Test(priority = 8)
	public void dashboardHeading() {
		String dashboardHeading = driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]")).getText();
		System.out.println("Dashboard Heading: "+dashboardHeading);
	}

	// 12- Implement Retry analyzer – retry 3 times only for the above scenario.
	// Test for failing deliberately
	@Test(priority = 9, retryAnalyzer = RetryAnalyzerTest.class)
	public void deliberateFail() {
		System.out.println("This method is to test fail listener.");					
		Assert.assertTrue(false);	
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	//11- Implement ITestListener for above scenario where full-page screenshot needs to be capture where ever test is pass or failed. Hint – Please use Shutterbug class
	@AfterMethod
	public void afterMethod() {
		Shutterbug.shootPage(driver).save("C:\\OneDrive\\Desktop\\Selenium Assignment Screenshots");
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

}
