package logIn.tests;

import org.openqa.selenium.WebDriver;

import logIn.LogIn;

import utility.Constant;
import utility.ExcelUtils;

public class LogInTest {

	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);

		LogIn.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysUsername(dr, data);

		LogIn.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysPassword(dr, data);

		LogIn.clickLogIn(dr);
	}

	public static void testWithAllData(WebDriver dr) throws Exception {

		LogIn.openPage(dr);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(dr, i);
			LogIn.navigateTo(dr);
		}

	}

	public static void testForPost(WebDriver dr) throws Exception {

		LogIn.openPage(dr);

		fillForm(dr, 2);

	}

}
