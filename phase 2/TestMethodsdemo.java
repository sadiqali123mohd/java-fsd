package listenerdemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
// @Listeners(ItestListernerClass.class)
public class TestMethodsdemo {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void Closebrowser()
	{
		driver.close();
	}
	
	
	@Test(priority='1')
	public void method1()
	{
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
	}
	// this will also pass
	@Test(priority='2')
	public void method2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		
	} // This will pass
	
	@Test(priority='3')
	public void method3()
	{
	
		driver.get("https://www.selenium.dev/documentation/");
		String expectedtitle = "Selenium";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedtitle); // test will failed as titles will not match.
	}
	//this test will fail due to assertion
	
	
	@Test(priority='4')
	public void method4()
	{
		
		driver.get("https://www.selenium.dev/projects/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);
		
	}  // this will fail due to assertion
	
	//The maximum number of milliseconds this test should take to complete.
	//If it hasn't returned after thistime, it will be marked as a FAIL
	
	@Test(priority='5',timeOut = 1000)
	public void method5() throws InterruptedException
	{
		Thread.sleep(3000);  // wait for 3 sec, test will not complete in given time
		driver.get("https://www.selenium.dev/projects/");
		
		
	}  // test will fail with timeout error
}
