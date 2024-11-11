package xamprowebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ......web Driver initialization ......
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//*****Site Navigate*****
		driver.get("https://www.xampro.org/");
		driver.manage().window().maximize();
		// Sign In button click
				driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div[4]/div[2]/a[1]") ).click();
				
				//**** Login Fucntion ****
				// *** email 
				driver.findElement(By.id("email")).sendKeys("md.abdul.wadud.sorker@gmail.com");
				
				//*** password
				driver.findElement(By.id("password")).sendKeys("87654321");
				
				//Login Button Click
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/div/div[1]/form/div[4]/div/button/div")).click();
				
				// Update profile click
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div[1]/div/p/a") ).click();
				

				
	}
	
	
	

}
