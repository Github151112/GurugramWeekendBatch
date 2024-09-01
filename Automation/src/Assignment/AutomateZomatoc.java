package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateZomatoc {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		
		//identify the search text field
		WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search for restaurant, cuisine or a dish']"));
		search.sendKeys("roti");
		Thread.sleep(2000);
		search.click();
		Thread.sleep(5000);
		//click on the suggestion
		driver.findElement(By.cssSelector("p[class='sc-1hez2tp-0 sc-bLJvFH isBcSC']")).click();

	}

}
