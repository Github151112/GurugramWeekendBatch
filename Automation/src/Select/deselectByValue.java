package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByValue {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		WebElement multiselect = driver.findElement(By.id("select-multiple-native"));
		
		// create the object of select class
		Select s = new Select(multiselect);
		
		s.selectByValue("Running Shoes");
		
		Thread.sleep(5000);
		
		//s.deselectByValue("Running Shoes");
		
		s.deselectByVisibleText("Running Shoes");
		
		

	}

}
