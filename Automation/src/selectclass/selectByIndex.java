package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();

		//identify the dropdown
		WebElement dropdown = driver.findElement(By.id("day"));
		
		//create the object of select class
		Select s = new  Select(dropdown);
	
		WebElement option = s.getWrappedElement();
		System.out.println(option.getText());
		
		
	}

}
