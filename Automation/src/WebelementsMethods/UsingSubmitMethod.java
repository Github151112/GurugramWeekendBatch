package WebelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSubmitMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		

		 WebElement searchtextField = driver.findElement(By.name("q"));
		 searchtextField.sendKeys("iphone");
		 System.out.println(searchtextField.getTagName());
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']"));
		searchButton.submit();
		
		
	}

}
