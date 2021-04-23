package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAndXPath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
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
		
		// 14- Write CSS Selector of highlighted Rectangular object (in Red) in below Image-
		WebElement pim = driver.findElementByCssSelector("a#menu_pim_viewPimModule>b");
		pim.click();
		System.out.println(driver.getCurrentUrl());
		
		WebElement time = driver.findElementByCssSelector("a#menu_time_viewTimeModule>b");
		time.click();
		System.out.println(driver.getCurrentUrl());
		
		WebElement maintenance = driver.findElementByCssSelector("a#menu_maintenance_purgeEmployee>b");
		maintenance.click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementById("menu_dashboard_index").click();
		
		WebElement assignLeave = driver.findElementByCssSelector("#dashboard-quick-launch-panel-menu_holder>table>tbody>tr>td:nth-child(1)>div>a>img");
		assignLeave.click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementById("menu_dashboard_index").click();
		WebElement timesheets = driver.findElementByCssSelector("#dashboard-quick-launch-panel-menu_holder>table>tbody>tr>td:nth-child(3)>div>a> img");
		timesheets.click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementById("menu_dashboard_index").click();
		WebElement employeeDistribution = driver.findElementByCssSelector("div#dashboard__employeeDistribution");
		boolean employeeDistributionValue = employeeDistribution.isDisplayed();
		System.out.println(employeeDistributionValue);
		
		// 15- Write Xpath Selector of highlighted Rectangular object (in Red) in below –
		WebElement admin = driver.findElementByXPath("//*[@id=\"menu_admin_viewAdminModule\"]");
		admin.click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementById("menu_dashboard_index").click();
		WebElement leaveList = driver.findElementByXPath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[2]/div/a/img");
		leaveList.click();
		System.out.println(driver.getCurrentUrl());
		
		WebElement marketplace = driver.findElementByXPath("//*[@id=\"MP_link\"]");
		marketplace.click();
		System.out.println(driver.getCurrentUrl());
		
		WebElement welcome = driver.findElementByXPath("//*[@id=\"welcome\"]");
		welcome.click();

		driver.quit();
	}

}
