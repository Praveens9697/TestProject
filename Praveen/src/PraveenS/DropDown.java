package PraveenS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Chrome driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement birthmonth1 = driver.findElement(By.xpath("//select[@title='Month']"));
		Select month1 = new Select(birthmonth1);
		List<WebElement> dropdown = month1.getOptions();
		System.out.println(dropdown.size());
		for(int i = 0; i<dropdown.size();i++) {
			String dropdownValues = dropdown.get(i).getText();
			if(dropdownValues.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
				
				System.out.println("Pravee");
			}
		}
	}

	

}
