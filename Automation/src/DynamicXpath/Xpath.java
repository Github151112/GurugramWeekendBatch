package DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

//		WebElement productPrice = driver.findElement(By.xpath(
//				"//div[text()='Apple iPhone 15 (Blue, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
//		System.out.println(productPrice.getText());
		
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
	}

}
