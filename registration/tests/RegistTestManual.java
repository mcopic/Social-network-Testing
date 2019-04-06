package registration.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import registration.Register;

public class RegistTestManual {

	public static void fillForm(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		String data;

		Register.clickFirstName(dr);
		System.out.println("First name:");
		data = sc.nextLine();
		Register.sendKeysFirstName(dr, data);

		Register.clickLastName(dr);
		System.out.println("Last name:");
		data = sc.nextLine();
		Register.sendKeysLastName(dr, data);

		Register.clickUsername(dr);
		System.out.println("Username:");
		data = sc.nextLine();
		Register.sendKeysUsername(dr, data);

		Register.clickEmail(dr);
		System.out.println("Email:");
		data = sc.nextLine();
		Register.sendKeysEmail(dr, data);

		Register.clickPassword(dr);
		System.out.println("Password:");
		data = sc.nextLine();
		Register.sendKeysPassword(dr, data);

		Register.clickRegister(dr);

		//sc.close();
	}

	public static void testWithData(WebDriver dr) throws Exception {
		Register.openPage(dr);

		fillForm(dr);
		// Register.navigateTo(dr);
	}

}
