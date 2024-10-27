package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import genericLibrary.CustomeListener;
import genericLibrary.Flib;
import pompages.HomePage;
import pompages.LoginPage;

@Listeners(CustomeListener.class)
public class ValidLoginTest extends BaseTest {

	@Test(description = "verify the user is able to perform login or not", groups = { "ST", "RT" })
	public void login() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		//use hard assert]
		//Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Logi");
		
		//use softassert
		SoftAssert s = new SoftAssert();
		s.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
		
		Flib l = new Flib();
		String username = l.togetDataFromExcel(EXCEL_PATH, VALID, 1, 0);
		String password = l.togetDataFromExcel(EXCEL_PATH, VALID, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.toLoginIntoDemoWebShop(username, password);
		s.assertEquals(driver.getTitle(), "Demo Web Shop");
		s.assertAll();
	}

}
