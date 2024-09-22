package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateBlinkit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.blinkit.com");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='2 - Dairy, Bread & Eggs']")));
	
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//img[@alt='2 - Dairy, Bread & Eggs']")).click();
		
		driver.findElement(By.xpath("//div[text()='Amul Taaza Toned Fresh Milk']/ancestor::div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']/descendant::div[text()='ADD']")).click();
		
		for(int i=1;i<=5;i++)
		{
			driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
		}
		
		
	}

}
