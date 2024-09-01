package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateMakeMyTripl {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/railways/']")).click();
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Lucknow");
		
		driver.findElement(By.xpath("//span[text()='LKO']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");
		
		driver.findElement(By.xpath("//span[text()='NDLS']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Sat Sep 21 2024']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='3A']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		List<WebElement> allTrains = driver.findElements(By.xpath("//div[@class='train-name']"));
		
		for(WebElement trains:allTrains) {
			System.out.println(trains.getText());
			System.out.println("----------------------------");
		}
		
		
		
		
	}

}
