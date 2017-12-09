package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;
@Test
public class TestInvalidLogin extends BaseTest{
	
	public void testInvslidLogin() throws InterruptedException {
		LoginPage l= new LoginPage(driver);
		
		int rowCount=Lib.getRowCount(EXCEL_PATH, "InVaidLogin");
		System.out.println(rowCount);
		for (int i = 1; i < rowCount; i++) {
			
			String userName = Lib.getCellValue(EXCEL_PATH, "InVaidLogin", i, 0);
			String passWord = Lib.getCellValue(EXCEL_PATH, "InVaidLogin", i, 1);
			l.setUsername(userName);
			Thread.sleep(1000);
			l.setPassword(passWord);
			l.clickLogin();
			Thread.sleep(2000);
			
		}

	}
	
    


}
