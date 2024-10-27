package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.CustomeListener;
import genericLibrary.Flib;
import pompages.HomePage;
import pompages.LoginPage;

@Listeners(CustomeListener.class)
public class InValidLoginTest extends BaseTest {

	@DataProvider(name = "TestData")
	public Object[][] invalidData() throws EncryptedDocumentException, IOException {
	
		return Flib.toGetMultipleDataFromExcel(EXCEL_PATH, INVALID);
		
	}

	@Test(dataProvider = "TestData",groups = {"FT","RT"})
	public void invalidLogin(String username, String password) {
		HomePage h = new HomePage(driver);
		h.getLoginLink().click();
		LoginPage l = new LoginPage(driver);
		l.toInvalidLoginIntoDemoWebShop(username, password);
	}

}
