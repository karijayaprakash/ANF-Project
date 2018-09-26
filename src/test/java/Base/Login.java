package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
  @Test
  public void login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cert.abercrombie.com");
	driver.findElement(By.id("email-address")).sendKeys("seleniumtest1@gmail.com");
	driver.findElement(By.cssSelector("button.js-cam-continue")).click();
	driver.findElement(By.id("login-password-field-create-account")).sendKeys("seleniumtest1");
	driver.findElement(By.cssSelector("button.js-sign-in-submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#login-firstname-field")).sendKeys("Test");
	driver.findElement(By.cssSelector("input#login-lastname-field")).sendKeys("Test");
	driver.findElement(By.cssSelector("input#login-phone-field")).sendKeys("9854589875");
	driver.findElement(By.cssSelector("input#legalOptIn")).click();
	driver.findElement(By.cssSelector("button.js-create-account-submit")).click();
	//driver.quit();

}
}
 