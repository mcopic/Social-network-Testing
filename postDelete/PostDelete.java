package postDelete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostDelete {

	private static final String ELLIPS = "/html[1]/body[1]/div[1]/div[7]/div[3]/div[1]/div[1]/div[1]/a[1]/i[1]";
	private static final String DELETE = "/html[1]/body[1]/div[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]";

	public static WebElement getEllips(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(ELLIPS));
		return wb;
	}

	public static void clickEllips(WebDriver dr) {
		getEllips(dr).click();
	}

	public static WebElement getDelete(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(DELETE));
		return wb;
	}

	public static void clickDelete(WebDriver dr) {
		getDelete(dr).click();
	}

}
