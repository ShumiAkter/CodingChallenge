package ActionClassDemo;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeEveryMethod() {
	System.out.println("before every method");
		
	}
	
	@BeforeClass
	public void beforeClassDemo() {
		System.out.println("before class");
	}
	
	
	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement singin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(singin).perform();
		
	}
	
	@Test
	public void m4() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement singin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(singin).perform();
		
	}
	@Test
	public void m2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement singin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(singin).perform();
		
	}
	@Test
	public void m3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement singin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(singin).perform();
		
	}
	
//	
//	public static void main(String[] args) {
//		String s1 = "TAC"; 
//		String s2 = "CAT"; 
//		
//		char[] arr  = s1.toCharArray();
//		char[] arr2 = s2.toCharArray();
//	
//		Arrays.sort(arr);
//		Arrays.sort(arr2);
//	}
}
