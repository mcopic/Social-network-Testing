package postMake.tests;

import org.openqa.selenium.WebDriver;

import logIn.LogIn;
import logIn.tests.LogInTest;
import postMake.PostMake;
import utility.Constant;
import utility.ExcelUtils;

public class PostMakeTest {

	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME2);

		PostMake.clickNewPost(dr);

		PostMake.clickNaziv(dr);
		data = ExcelUtils.getCellData(i, 1);
		PostMake.sendKeysNaziv(dr, data);

		PostMake.clickLokacija(dr);
		data = ExcelUtils.getCellData(i, 2);
		PostMake.sendKeysLokacija(dr, data);

		PostMake.clickPost(dr);
	}

	public static void testWithAllData(WebDriver dr) throws Exception {

		LogIn.openPage(dr);
		LogInTest.testForPost(dr);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {

			fillForm(dr, i);

		}

	}
}
