package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
	     
	     Driver.findElement(By.xpath("//input[contains(@id,'ext-gen248')]")).sendKeys("Naveen");
	     
	     Driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	     
       // Driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/viewLead?partyId=19752')]")).click();
	     
	    // Driver.findElement(By.xpath("//a[contains(@class,'linktext')]")).click();
	     
	     //Driver.findElement(By.xpath("//a[contains(textvalue(),'19752')]")).click();
	     
	    Driver.findElement(By.xpath("//a[@href = '/crmsfa/control/viewLead?partyId=19752']")).click();
	     
	     String Sts = Driver.getTitle();
	     System.out.println(Sts);
	     
	     Driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	     
	     Driver.findElement(By.id("updateLeadForm_companyName")).clear();
	     
	     Driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("DevSai");
	     
	     Driver.close();
	     
	     

	}

}
