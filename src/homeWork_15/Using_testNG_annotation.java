package homeWork_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_testNG_annotation {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamil\\eclipse-workspace\\SeleniumHW\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void test01() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='nav-search-submit-button']"));
		Thread.sleep(4000);
	}
	
	@Test
	public void test02() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.findElement(By.className("hm-icon-label")).click();
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
