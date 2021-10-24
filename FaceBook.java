package week2.assignments2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Download and set the path 
	
		
		WebDriverManager.chromedriver().setup();
		
		// Launch the chromebrowser
		ChromeDriver Driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com
			
		Driver.get(" https://en-gb.facebook.com/");
		
		//Maximise the window
		
		Driver.manage().window().maximize();
		
		//Add implicit wait
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Click on Create New Account button
		
		Driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		//Enter the first name
		
		Driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Naveen");
		
		//Enter the last name
		
		Driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Chandar");
		
		//Enter the mobile number

		Driver.findElement(By.name("reg_email__")).sendKeys("9962820422");
		
		
		// Enterthe password
		
		Driver.findElement(By.id("password_step_input")).sendKeys("Dev@2405!");
		
		// Handle all the three drop downs
		
		WebElement elseSource = Driver.findElement(By.id("day"));
		
		Select Dropdown = new Select(elseSource);
		
		Dropdown.selectByValue("22");
		
    WebElement elseSss = Driver.findElement(By.id("month"));
		
		Select Dropdown1 = new Select(elseSss);
		
		Dropdown1.selectByValue("12");
		
       WebElement elseS = Driver.findElement(By.id("year"));
		
		Select Dropdown2 = new Select(elseS);
		
		Dropdown2.selectByValue("1997");
		
		Driver.findElement(By.xpath("//input[@class ='_8esa']")).click();
		
		
	
		
	}

}
