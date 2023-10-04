import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AWS_Docker {
	public WebDriver driver;

	@Test(priority = 1)
	public void AWS1() throws IOException
	{
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.selenium.dev/");
		//driver.findElement(By.xpath("//*[@class='nav-link'][1]")).click();
		System.out.println("PMO INDIA");
	}
	@AfterMethod
	public void aftermethod()
	{
		//driver.quit();
	}
}
