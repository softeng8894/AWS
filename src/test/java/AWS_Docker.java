import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AWS_Docker {
    public WebDriver driver;
	
	@Test
	public void AWS_headless() throws IOException
	{
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--headless");
	  driver = new ChromeDriver(co);
      //WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      System.out.println("PMO INDIA");
      driver.quit();
	}
}
