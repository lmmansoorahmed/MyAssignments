package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	//Launch a chrome browser
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("Demosalesmanager");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
	
	//click on the partial link text
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}
}