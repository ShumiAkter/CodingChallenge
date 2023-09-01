package get_title_test;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Test {
	@Test
	
	public void getTile() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get("https://www.statefarm.com/");
		String expected = "State Farm Insurance Companies | Like a Good Neighbor  | State Farm®";
		String actual = driver.getTitle();
		System.out.println(expected.equals(actual));
		//Assert.assertEquals(expected, actual);
		System.out.println("Tile is : " + actual);
		
		driver.close();
	}
	
}
	
	