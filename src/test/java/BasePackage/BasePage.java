package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import Utilities.ReadingData;

public class BasePage {
	
	public static WebDriver driver;
	ReadingData rd=new ReadingData();
	public String EMail=rd.getEmail();
	
	
	@Parameters({"browser","URL"})
	@BeforeClass
	public void openApplication(String br,String url ) {
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
	
	
	}
	
	
	@AfterClass
	public void CloseApplication() {
		
		driver.close();
	}
	
	
	

}
