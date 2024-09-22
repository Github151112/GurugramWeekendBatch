package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SS1 {

	public static void main(String[] args) throws IOException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 
		 TakesScreenshot sc=(TakesScreenshot)driver;
		 File fb = sc.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./FBSS/fbhome.png");
		 Files.copy(fb, dest);
	}

}
