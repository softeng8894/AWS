import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AWS_Docker {


	@Test
	public void AWS_headless() throws IOException
	{
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--headless");
	  co.addArguments("--remote-allow-origins");
      WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      System.out.println("PMO INDIA");
      driver.quit();
	}
}
