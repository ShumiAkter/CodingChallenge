package ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {
	
	@Test
	
	
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kroger.com/");
		d
		
		
		
		
		driver.close(); 
	}
	
	public void getTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.statefarm.com/");
		String expected = "State Farm Insurance Companies | Like a Good Neighbor  | State Farm®";
		String act = driver.getTitle();
		System.out.println(expected. equals(act));
		//Assert.assertEquals(expected, act);
		System.out.println(act);
		
		driver.close();
	}
	
	
//	public void titile() throws InterruptedException {
//		WebDriverManager.chromedriver().setup(); // setup the driver
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.kroger.com/");
//		
//
//		Assert.assertEquals(driver.getTitle(), )
//				
//				
//				
//				.getAttribute("innerText"));
//		
//		// WebElement x --> driver.finElement(locator)
//			WebElement e1 =	driver.findElement(By.tagName("title"));
//			WebElement e2 =	driver.findElement(By.xpath("//@title = 'kroger title'"));
//			WebElemnt e2 = driver.findElement(By.cssSelector(".myTilet"));
//		
//		
	
		
		//commend  + tab = open the chome to exlips 
		
		//html tag [text() = 'inner text']			
		//html tag [normalize-space(text())='attribute value']
		//html tag [contains(text(), 'partial or complete inner text value') ]
		//html tag [starts-with(text(), 'attribute value')]
		
		
		
		
		
		
								
		
		
		
		
		
		
				
		
		
		
		
	//}

}
