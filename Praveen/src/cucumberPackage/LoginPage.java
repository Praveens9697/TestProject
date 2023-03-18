package cucumberPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	public void enterUsername() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}
	public void enterPassword() {
		driver.findElement(By.id("pass")).sendKeys("12345");
	}
	
public void clickLoginButton() {
	System.out.println("Login button clicked");
}
public void verifyLogin() {
	System.out.println("Verified Login Case");
}

}
