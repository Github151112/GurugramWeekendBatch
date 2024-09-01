package WebelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsEnabled {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		WebElement usernameTextField = driver.findElement(By.name("username"));

		if (usernameTextField.isEnabled()) {
			usernameTextField.sendKeys("Admin");
		} else
			System.out.println("It is disabled");

		WebElement logo = driver.findElement(By.cssSelector("img[alt='company-branding']"));

		if (logo.isDisplayed())
			System.out.println("Logo is displayed");
		else
			System.out.println("Logo is not displayed");

	}

}
