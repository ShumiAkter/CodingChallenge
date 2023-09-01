package ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import ActionClassDemo.ActionClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChallengingCode {
	// public static void main(String[] args) {

	// int[] odd = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		WebElement dropdrown = driver.findElement(By.xpath("sdfghjk"));
		Select select = new Select(dropdrown);
		select.selectByVisibleText(null);
		
		Dropdron dr1 = new Dropdron();
		Dropdron dr2 = new Dropdron();
		ActionClass ac = new ActionClass();
		ActionClass ac2 = new ActionClass();

	}

//		for( int i = 1; i<21; i++) {
//			if (i%2 !=0 ) {
//				System.out.println(i);
//				
//			}
//	
//		
//			
//			
//		}
//		System.out.println("............");	
//		for( int i = 1; i<21; i++) {
//			if (i%2 !=0 ) {
//				System.out.println(i);
//				
//			}
//	
//		
//	}

//}

}
