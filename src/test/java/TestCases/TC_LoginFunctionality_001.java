package TestCases;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import PageObjects.LoginPage;

public class TC_LoginFunctionality_001 extends BasePage {

	@Test
	public void LoginTest() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.clickRadiobtn();
		lp.setEmail(EMail);
		lp.clickSendOTPbtn();
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter url..");
		String url=sc.next();
		
		Thread.sleep(10000);
		driver.get(url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		

		//Set<String>ids=driver.getWindowHandles();
		
		//List<String>windows=new ArrayList(ids);
		
		//System.out.println(windows.size());
		//String parentid=windows.get(0);
		//String childid=windows.get(1);
		//driver.switchTo().window(childid);
		
		
		
		
		
	}
}
