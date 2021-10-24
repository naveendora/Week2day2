package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
	   Driver.manage().window().maximize();
	   
	   Driver.get("http://leaftaps.com/opentaps/control/login");
	   Driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
	     Driver.findElement(By.className("decorativeSubmit")).click();
	     Driver.findElement(By.linkText("CRM/SFA")).click();
	     Driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	     Driver.findElement(By.linkText("Find Leads")).click();
	     
	     Driver.findElement(By.xpath("//span[text()= 'Email']")).click();
	     
	     Driver.findElement(By.name("emailAddress")).sendKeys("naveenchandar@gmail.com");
	     
	     Driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	     
	     Driver.findElement(By.xpath("//a[@href = '/crmsfa/control/viewLead?partyId=19771']")).click();

	     Driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
	     
	     String Sts = Driver.getTitle();
	     System.out.println(Sts);
	     
	     Driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
	     
	     Driver.close();
	     
	}

}
