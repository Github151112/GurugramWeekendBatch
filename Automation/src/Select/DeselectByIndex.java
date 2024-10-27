package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		
		
		//create the object of select class
		Select s = new Select(driver.findElement(By.id("select-multiple-native")));
		
		s.selectByIndex(1);
		//select 
		for(int i=0;i<4;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		
//		for(int i=0;i<4;i++)
//		{
//			s.deselectByIndex(i);
//			Thread.sleep(2000);
//		}
		
		s.deselectAll();
		
		
		
	}

}
