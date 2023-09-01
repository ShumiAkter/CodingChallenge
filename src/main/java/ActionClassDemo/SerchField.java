package ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerchField {
	
	
	
	@Test
	void m2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		
		driver.get("http://192.168.1.32:8081/");
		//driver.findElement(By.xpath("//a[starts-with(@id, 'dynamicAbout_')]")).click();
		
		//driver.findElement(By.xpath("//a[contains(@id, 'dynamicAbout_')]")).click();
		//driver.findElement(By.cssSelector("a[id^='dynamicAbout_']:matches[id$='[0-9]{4}']")).click();
		//driver.findElement(By.cssSelector("a[id^='dynamicAbout_']:matches([id$='[0-9]{4}'])"));
		//driver.findElement(By.cssSelector("a[id^='dynamicAbout_']:matches([id$='[0-9]{4}'])")).click();
		 
		//e2.click();
		
		//create object 
		Shumi sDemo = Shumi.getInstance(); //Shumi's object
		Shumi sDemo2 = Shumi.getInstance(); // Shumi's old object
		
	}
}
