import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AWS_Docker {

	@Test(priority = 1)
	public void AWS1() throws IOException
	{
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("headless");
      WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      System.out.println("PMO INDIA");
      driver.quit();
	}
}
