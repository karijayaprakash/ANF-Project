package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class createorder {
	@Test
	public void ordercreate()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cert.abercrombie.com");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
		WebElement Category = driver.findElement(By.cssSelector("li#cat-12202 a[href=/shop/us/mens]"));
		actions.moveToElement(Category).build().perform();
		
		
	}

}
