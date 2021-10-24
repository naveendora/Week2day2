package week2.assignments2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Driver.findElement(By.name("UserFirstName")).sendKeys("naveen");
		
		Driver.findElement(By.name("UserLastName")).sendKeys("kumar");
		
		Driver.findElement(By.name("UserEmail")).sendKeys("naveenchadnae@gmail.com");
		
	WebElement jobtitle = Driver.findElement(By.name("UserTitle"));
	
	Select DropDown = new Select(jobtitle);
	
	DropDown.selectByVisibleText("Marketing / PR Manager");
	
	Driver.findElement(By.xpath("//input[@name = 'CompanyName']")).sendKeys("MRAN and CO");
	
WebElement Employe = Driver.findElement(By.name("CompanyEmployees"));
	
	Select DropDown1 = new Select(Employe);
	
	DropDown1.selectByValue("250");
	
WebElement Countr = Driver.findElement(By.name("CompanyCountry"));
	
	Select DropDown2 = new Select(Countr);
	
	DropDown2.selectByVisibleText("India");
	
	Driver.findElement(By.name("UserPhone")).sendKeys("9551024822");
	
	Driver.findElement(By.className("checkbox-ui")).click();
	
	
	Driver.close();
	
	
		
		
	}

}
