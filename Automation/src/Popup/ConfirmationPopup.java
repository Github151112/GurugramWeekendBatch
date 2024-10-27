package Popup;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public interface ConfirmationPopup {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		
		driver.findElement(By.id("buttonAlert5")).click();
		
		Thread.sleep(2000);
		/*if we want to handle the confirmation popup we have to switch the control from main page 
		to alert popup 
		 */
		Alert a = driver.switchTo().alert();
		//a..accept();//click on ok
		a.dismiss();//click on cancel
	}

}
