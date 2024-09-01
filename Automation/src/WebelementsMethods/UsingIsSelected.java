package WebelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsSelected {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		
		Thread.sleep(2000);
		
		WebElement checkBox = driver.findElement(By.id("domain1"));
		checkBox.click();
		if(checkBox.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			checkBox.click();
		}
	}

}
