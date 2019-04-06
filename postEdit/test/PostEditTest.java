package postEdit.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import postEdit.PostEdit;

public class PostEditTest {

	public static void fillForm(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		String data;

		PostEdit.clickEllips(dr);

		PostEdit.clickEdit(dr);

		PostEdit.clickOpis(dr);
		System.out.println("Opis:");
		data = sc.nextLine();
		PostEdit.sendKeysOpis(dr, data);

		PostEdit.clickPost(dr);

		sc.close();
	}

	public static void testWithData(WebDriver dr) throws Exception {

		fillForm(dr);

	}

}
