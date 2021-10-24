package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		
		Driver.get("https://acme-test.uipath.com/login");
		
		Driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		Driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		Driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		String nam = Driver.getTitle();
		System.out.println(nam);
		
		Driver.findElement(By.linkText("Log Out")).click();
		
		Driver.close();
		
		

	}

}
