package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		List<WebElement> pName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));

		for (int i = 0; i < pName.size(); i++) {
			for (int j = i; j <= i; j++) {
				System.out.println(pName.get(i).getText() + "===>" + pPrice.get(j).getText());
			}
		}

	}

}
