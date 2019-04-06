package logIn.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import logIn.LogIn;

public class LogInManual {

	public static void fillForm(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		String data;

		LogIn.clickUsername(dr);
		System.out.println("Username:");
		data = sc.nextLine();
		LogIn.sendKeysUsername(dr, data);

		LogIn.clickPassword(dr);
		System.out.println("Password:");
		data = sc.nextLine();
		LogIn.sendKeysPassword(dr, data);

		LogIn.clickLogIn(dr);

		//sc.close();
	}

	public static void testWithData(WebDriver dr) throws Exception {

		LogIn.openPage(dr);

		fillForm(dr);
		// LogIn.navigateTo(dr);

	}

}
