package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		//identify the drop down
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		//create the object of select class
		Select s = new Select(month);
		
		//use method
		//s.selectByValue("3");
		
		
		
		s.selectByVisibleText("Sep");
		
		
		
		
	}

}
