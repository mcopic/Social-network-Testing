package postMake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostMake {

	public static final String PAGE_URL = "http://localhost/izlet/";
	private static final String NEW_POST = "//a[contains(text(),'Make a post')]";
	private static final String NAZIV = "//input[@placeholder='Naziv']";
	private static final String LOKACIJA = "//input[@placeholder='Lokacija']";
	private static final String TRANSPORT = "//div[@class='popupPost']//select[@name='transport']";
	private static final String OPIS = "//textarea[@placeholder='Opis']";
	private static final String POST = "//div[@class='popupPost']//input[@value='Post']";

	// New Post
	public static WebElement getNewPost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(NEW_POST));
		return wb;
	}

	public static void clickNewPost(WebDriver dr) {
		getNewPost(dr).click();
	}

	// Naziv
	public static WebElement getNaziv(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(NAZIV));
		return wb;
	}

	public static void clickNaziv(WebDriver dr) {
		getNaziv(dr).click();
	}

	public static void sendKeysNaziv(WebDriver dr, String str) {
		getNaziv(dr).sendKeys(str);
	}

	// Lokacija
	public static WebElement getLokacija(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOKACIJA));
		return wb;
	}

	public static void clickLokacija(WebDriver dr) {
		getLokacija(dr).click();
	}

	public static void sendKeysLokacija(WebDriver dr, String str) {
		getLokacija(dr).sendKeys(str);
	}

	// Transport
	public static WebElement getTransport(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(TRANSPORT));
		return wb;
	}

	public static void selectTransport(WebDriver dr, String transport) {
		Select sel = new Select(getSelect(dr));
		sel.selectByVisibleText(transport);
	}

	private static WebElement getSelect(WebDriver dr) {

		return null;
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

	public static void openPage(WebDriver dr) {
		dr.get(PAGE_URL);
	}

	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(PAGE_URL);
	}

}
