package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import logIn.tests.LogInManual;
import postDelete.test.PostDeleteTest;
import postMake.tests.PostMakeManual;
import registration.tests.RegistTestManual;

public class MainManual {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		try {
			RegistTestManual.testWithData(driver);
			LogInManual.testWithData(driver);
			PostMakeManual.testWithData(driver);
			PostDeleteTest.test(driver);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
