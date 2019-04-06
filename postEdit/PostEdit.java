package postEdit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostEdit {

	private static final String ELLIPS = "/html[1]/body[1]/div[1]/div[7]/div[3]/div[1]/div[1]/div[1]/a[1]/i[1]";
	private static final String EDIT = "/html[1]/body[1]/div[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/i[1]";
	private static final String OPIS = "//textarea[@id='description']";
	private static final String POST = "//div[@class='popupEdit']//input[@value='Post']";

	public static WebElement getEllips(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(ELLIPS));
		return wb;
	}

	public static void clickEllips(WebDriver dr) {
		getEllips(dr).click();
	}

	public static WebElement getEdit(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EDIT));
		return wb;
	}

	public static void clickEdit(WebDriver dr) {
		getEdit(dr).click();
	}

	// Opis
	public static WebElement getOpis(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(OPIS));
		return wb;
	}

	public static void clickOpis(WebDriver dr) {
		getOpis(dr).click();
	}

	public static void sendKeysOpis(WebDriver dr, String str) {
		getOpis(dr).sendKeys(str);
	}

	// Post
	public static WebElement getPost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(POST));
		return wb;
	}

	public static void clickPost(WebDriver dr) {
		getPost(dr).click();
	}

}
