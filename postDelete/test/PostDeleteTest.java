package postDelete.test;

import org.openqa.selenium.WebDriver;

import postDelete.PostDelete;

public class PostDeleteTest {

	public static void test(WebDriver dr) throws Exception {

		for (int i = 0; i < 3; i++) {
			PostDelete.clickEllips(dr);
			PostDelete.clickDelete(dr);
		}

	}

}
