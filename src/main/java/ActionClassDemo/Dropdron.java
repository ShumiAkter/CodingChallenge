package ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdron {
	
	
	@Test
	void dynamicId() {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();

	//	d.get("https://demo.guru99.com/test/web-table-element.php");

		// WebElement e = d.findElement(By.xpath("//div[starts-with(@id, 'site']"));

		// for xpath
		// div[starts-with(@class, 'item')]
		// tagname[starts-with(@attribute, 'value')]
		// tagname[contains(@attribute, 'value')]
		// tagname[text() = 'text_value']

		// for css, most selective and fast
		
		// id = 'site-0011'

		//WebElement e2 = d.findElement(By.cssSelector("div[id^='site'][id$='[0-9]{4}']"));
		//e2.click();
//		input[class^='button']
		
		
		
		d.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		WebElement dropDrown = d.findElement(By.xpath("//select[@id='first']"));
//		Select select= new Select(dropDrown);
//		select.selectByVisibleText("Iphone");
		
		WebElement dropDrown = d.findElement(By.cssSelector("select[id^='fi'][id$='st']"));
		
		
		
		//d.findElement(By.cssSelector("div[id^='site'][id$='[0-9]{4}']"));
		Select select= new Select(dropDrown);
		select.selectByVisibleText("Iphone");
		select.selectByValue("babycat");
		select.selectByIndex(2);
		
		
		

	}

}
