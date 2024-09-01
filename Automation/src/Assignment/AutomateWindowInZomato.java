package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWindowInZomato {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		
		driver.findElement(By.xpath("//a[contains(@href,'https://in.linked')]")).click();
		driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();
		
		
		Set<String> allId = driver.getWindowHandles();
		
		for(String id:allId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Zomato - YouTube"))
			{
				System.out.println(driver.getTitle());
			}
			else
			{
				driver.close();
			}
		}
		
		
	}

}
