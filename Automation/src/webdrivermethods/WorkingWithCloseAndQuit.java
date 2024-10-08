package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseAndQuit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		//clicking on open a popup window
		driver.findElement(By.linkText("Open a popup window")).click();
		
		//use close 
		//driver.close();
		
		//use quit
		driver.quit();
		
	}

}
