package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOne {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on the partial link text
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First Name");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last Name");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department Name");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a sample text");
		driver.findElement(By.name("primaryEmail")).sendKeys("testleaf@example.com");
		WebElement stateorprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(stateorprovince);
		sec.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String TitleofthePage = driver.getTitle();
		System.out.println(TitleofthePage);
		
		
		
	}

}
