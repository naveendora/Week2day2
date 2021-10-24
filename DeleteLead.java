package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		     
		     Driver.findElement(By.xpath("//span[contains(text(),'Name and ID')]")).click();
		     
		     Driver.findElement(By.xpath("(//input[@name = 'companyName'])[2]")).sendKeys("RanaDev");
		     
		     Driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		     
		     Driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/viewLead?partyId=18588')]")).click();
		     		     
		     
		     Driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		
		     Driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		     
		     Driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys("18588");
		     
		     Driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		     
		     Driver.close();
		     
	}

}
