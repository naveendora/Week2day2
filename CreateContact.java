package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
	     
	     Driver.findElement(By.linkText("Contacts")).click();
	     
	     Driver.findElement(By.linkText("Create Contact")).click();
	     
	     Driver.findElement(By.id("firstNameField")).sendKeys("Naveen");
		Driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
			 Driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mr.Naveen");
				Driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("KumarChandar");
	     
				Driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");	
				
				Driver.findElement(By.id("createContactForm_description")).sendKeys("Company name description");
				
				Driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("naveenchandar2212@gmail.com");
				
				WebElement elsei = Driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				
				Select DropDown = new Select(elsei);
				
				DropDown.selectByVisibleText("New York");
				
				Driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				Driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
				
				Driver.findElement(By.id("updateContactForm_description")).clear();
				
				Driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("All is well");
				
				Driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				
				String stc = Driver.getTitle();
				
				Driver.close();
				
				
				System.out.println(stc);
				
				
				
				
		
	}

}
