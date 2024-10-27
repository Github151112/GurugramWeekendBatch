package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingIntoFrames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		//switch into frame by way 1
		//driver.switchTo().frame(0);
		
		//way 2
		//driver.switchTo().frame("send-sms-iframe");
		
		//way 3
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']")));
		
		driver.findElement(By.id("regEmail")).sendKeys("85585216549");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
	}

}
