package Base;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class createorder {
	private static final String Try = null;

	@Test
	public void ordercreate() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ecom104.abercrombie.com");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
		WebElement Category = driver.findElement(By.cssSelector("a[aria-label=\"Womens\"]"));
		actions.moveToElement(Category).build().perform();
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("li#cat-12265-largescreen a[role=\"menuitem\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a.product-card__image-link")).click();
	    driver.findElement(By.cssSelector("label.attr-label.swatches__color")).click();
	    driver.findElement(By.cssSelector("ul.product-sizes label.attr-label")).click();
	    driver.findElement(By.cssSelector("ul.product-sizes.product-sizes-secondary")).click();
	    Thread.sleep(4000);
	    try {
	    	JavascriptExecutor jse = (JavascriptExecutor) driver;
	    	
	    	jse.executeScript("window.scrollBy(0,450)", "");
	    	
	         Thread.sleep(2000);
	    	
        driver.findElement(By.cssSelector("div.addToBagButtonContent.addToBagReady span.addToBagButtonText")).click();
	    }
	    catch (ElementNotVisibleException e) {
			// TODO: handle exception
	    	
	    	System.out.println("Exeception while adding to bag");
	    	driver.findElement(By.cssSelector("div.addToBagButtonContent.addToBagReady span.addToBagButtonText")).click();
	    	
		};
	    
        Thread.sleep(2000);
       
	    driver.findElement(By.cssSelector("a.js-menuitem-a11y-focus.rs-mini-bag__details")).click();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.link-as-primary-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#shipping-first-name")).sendKeys("Test");
		driver.findElement(By.cssSelector("input#shipping-last-name")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label = 'Address (or PO Box)']")).sendKeys("6301 Fitch Path");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
    	jse.executeScript("window.scrollBy(0,450)", "");
		driver.findElement(By.cssSelector("div.pcaitem.pcafirstitem.pcaselected")).click();
		//driver.findElement(By.cssSelector("input[aria-label = 'Address (or PO Box)']")).sendKeys("6301 Fitch Path");
		//driver.findElement(By.cssSelector("input#shipping-city")).sendKeys("New York");
		
		//Select Statedrpdwn = new Select(driver.findElement(By.cssSelector("Select#shipping-state")));
	//	Statedrpdwn.selectByVisibleText("Ohio");
		
		//driver.findElement(By.cssSelector("input#shipping-postal-code")).sendKeys("43054");
		Thread.sleep(2000);
		try {
			 driver.findElement(By.cssSelector("input#card-number-fmt-0")).sendKeys("5454 5454 5454 5454");
			  Thread.sleep(4000);
			  driver.findElement(By.cssSelector("input#expdate-0")).sendKeys("0819");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("input#cvv-0")).sendKeys("345");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	 
	
	  Thread.sleep(2000);
	  
	  driver.findElement(By.cssSelector("input#contact-info-email")).sendKeys("anf.test.orders@gmail.com");
	  driver.findElement(By.cssSelector("input#contact-info-phone")).sendKeys("9854589854");
	  driver.findElement(By.cssSelector("button.button.ds-override.primary-button")).click();
		
	}

}
