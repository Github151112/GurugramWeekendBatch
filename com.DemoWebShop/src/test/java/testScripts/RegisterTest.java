package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import genericLibrary.WorkLib;
import pompages.HomePage;
import pompages.RegistrationPage;

public class RegisterTest extends BaseTest {

	String email = "hussain" + WorkLib.getRandomNo() + "@gmail.com";

	@Test(description = "verify the user is able to register or not",groups = "ST")
	public void register() throws EncryptedDocumentException, IOException, InterruptedException {
		// click on register link
		HomePage hp = new HomePage(driver);
		hp.getRegisterLink().click();
		// fetching the data
		Flib l = new Flib();
		String fn = l.togetDataFromExcel(EXCEL_PATH, REG_SHEET, 1, 0);
		String ln = l.togetDataFromExcel(EXCEL_PATH, REG_SHEET, 1, 1);
		String password = l.togetDataFromExcel(EXCEL_PATH, REG_SHEET, 1, 3);
		// to register
		RegistrationPage rp = new RegistrationPage(driver);
		rp.toRegisterIntoDemoWebShop(fn, ln, email, password);

	}

}
