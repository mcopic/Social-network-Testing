package registration.tests;

import org.openqa.selenium.*;

import registration.Register;
import utility.Constant;
import utility.ExcelUtils;

public class RegistTest {

	public static void fillForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);
		Register.clickFirstName(dr);
		data = ExcelUtils.getCellData(i, 0);
		Register.sendKeysFirstName(dr, data);

		Register.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		Register.sendKeysLastName(dr, data);

		Register.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		Register.sendKeysUsername(dr, data);

		Register.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		Register.sendKeysEmail(dr, data);

		Register.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		Register.sendKeysPassword(dr, data);

		Register.clickRegister(dr);
	}

	public static void testWithAllData(WebDriver dr) throws Exception {

		Register.openPage(dr);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(dr, i);
			Register.navigateTo(dr);
		}

	}

}
