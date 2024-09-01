package WebelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetSize {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Dimension size = search.getSize();
		System.out.println(size);
		
		Point loc = search.getLocation();
		System.out.println(loc);
		
		
		Rectangle rect = search.getRect();
		
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		
	}

}
