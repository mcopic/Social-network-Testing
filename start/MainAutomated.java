package start;

import org.openqa.selenium.chrome.ChromeDriver;

import logIn.tests.LogInTest;
import postDelete.test.PostDeleteTest;
import postEdit.test.PostEditTest;
import postMake.tests.PostMakeTest;
import registration.tests.RegistTest;

//import registration.Register;

import org.openqa.selenium.*;

public class MainAutomated {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		try {

			RegistTest.testWithAllData(driver);
			LogInTest.testWithAllData(driver);
			PostMakeTest.testWithAllData(driver);
			PostDeleteTest.test(driver);
			PostEditTest.testWithData(driver);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
