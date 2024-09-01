package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirts",Keys.ENTER);
		
		
		List<WebElement> allProductDetails = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		
		
		for(int i=0;i<allProductDetails.size();i++)
		{
			System.out.println(allProductDetails.get(i).getText());
			System.out.println("===============================================");
		}
		
		
	}

}
