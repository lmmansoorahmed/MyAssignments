package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesForceLogin {
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
	}

}
