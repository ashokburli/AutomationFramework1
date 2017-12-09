package scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestLogin extends BaseTest{
	
	@Test
	public void testLogin() throws InterruptedException{
		LoginPage loginPage = new LoginPage(driver);
		String userName = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		String passWord = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		String ExpectedTiltle = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 2);
		
		loginPage.setUsername(userName);
		loginPage.setPassword(passWord);
		loginPage.clickLogin();
		Thread.sleep(2000);
		
		String actualtitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, ExpectedTiltle);
		s.assertAll();
		
		
	}
}