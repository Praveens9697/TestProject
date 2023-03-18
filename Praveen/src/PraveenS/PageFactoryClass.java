package PraveenS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryClass {
	static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement EmailField;
	

	@FindBy(xpath = "//input[@id='pass']")
	WebElement Password;
	
	//define the constructor of this class
	public PageFactoryClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void enterMail() {
		EmailField.sendKeys("abcd@gmail.com");
	}
	
	public void enterPassword() {
		Password.sendKeys("Pass12344");
	}
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Software\\Chrome driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	PageFactoryClass pfc = new PageFactoryClass(driver);
	pfc.enterMail();
	pfc.enterPassword();
	
	
	}
	
}
