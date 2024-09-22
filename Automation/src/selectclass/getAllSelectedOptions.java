package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		Select s = new Select(driver.findElement(By.id("select-multiple-native")));

		for (int i = 0; i < 3; i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for(WebElement allSelected:allSelectedOptions)
		{
			System.out.println(allSelected.getText());
		}
	
		
		
		
		
		

	}

}
