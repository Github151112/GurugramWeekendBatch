package Takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ParticularWebelement {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.swiggy.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='restaurants curated for samosa']"))));
		
		WebElement samosa = driver.findElement(By.xpath("//img[@alt='restaurants curated for samosa']"));
		//use getScreenshotAs()
		File src = samosa.getScreenshotAs(OutputType.FILE);
		//create the new file
		File dest = new File("./Screenshot/samosa.png");
		//copy
		Files.copy(src, dest);
		
		
		
	}

}
