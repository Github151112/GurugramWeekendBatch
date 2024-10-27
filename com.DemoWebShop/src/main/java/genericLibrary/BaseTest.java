package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * @author AMAN SINGH Oct 19
 */
public class BaseTest implements IAutoConstant {
	
	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite(alwaysRun = true)
	public void toConnectServer() {
		Reporter.log("Server connected sucessfully", true);
	}
	
	@BeforeTest(alwaysRun = true)
	public void toConnectDatabase()
	{
		Reporter.log("Database connected successfully",true);
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void setUp(@Optional("chrome")String browser) throws IOException
	{
		Flib l = new Flib();
		//String browser = l.getDataFromProperty(PROP_PATH, "browser");
		String url = l.getDataFromProperty(PROP_PATH, "url");
		Reporter.log("Launching "+browser+" Successfully",true);
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			Reporter.log("Invalid Browser",true);
		sdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
		
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown()
	{
		driver.quit();
		Reporter.log("browser closed successfully",true);
	}
	
	@AfterTest(alwaysRun = true)
	public void toCloseDatabase()
	{
		Reporter.log("Database Closed successfully",true);
	}
	
	@AfterSuite(alwaysRun = true)
	public void toCloseServer()
	{
		Reporter.log("Server Closed successfully",true);
	}
	
	

}
