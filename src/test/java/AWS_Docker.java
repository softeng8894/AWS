import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AWS_Docker {
    WebDriver driver;
	@Test
	public void AWS_Container() throws IOException
	{
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.setCapability("browserName","chrome");
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://43.204.140.65:4444/wd/hub"),chromeoption);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		System.out.println("chrome");
		driver.quit();
	}
}
