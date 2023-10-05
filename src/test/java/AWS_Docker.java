import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AWS_Docker {

	@Test(priority = 1)
	public void AWS1() throws IOException
	{
      WebDriver driver = WebDriverManager.chromedriver().create();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      System.out.println("PMO INDIA");
      driver.quit();
	}
}
