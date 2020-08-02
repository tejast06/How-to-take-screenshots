package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HowToTakeScreenShot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Desktop\\selenium4\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// applicable for all the elements.
		driver.get("https://www.amazon.com/");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\DELL\\eclipse-workspace\\CRM\\src\\main\\java\\screenshots\\screenshot.png"));
		
		
		
	}

}
