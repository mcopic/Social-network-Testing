package postMake.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

//import logIn.tests.LogInTest;
import postMake.PostMake;

public class PostMakeManual {

	public static void fillForm(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		String data;

		PostMake.clickNewPost(dr);

		PostMake.clickNaziv(dr);
		System.out.println("Naziv:");
		data = sc.nextLine();
		PostMake.sendKeysNaziv(dr, data);

		PostMake.clickLokacija(dr);
		System.out.println("Lokacija:");
		data = sc.nextLine();
		PostMake.sendKeysLokacija(dr, data);

		PostMake.clickPost(dr);

		//sc.close();
	}

	public static void testWithData(WebDriver dr) throws Exception {

		//PostMake.openPage(dr);
		//LogInTest.testForPost(dr);

		fillForm(dr);

	}

}
