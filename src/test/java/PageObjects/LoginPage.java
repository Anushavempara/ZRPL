package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//label[@class='radio-inline']/input)[2]")
     WebElement btnRadio;
	
	@FindBy(id="home_email")
	WebElement txtEmail;
	
	@FindBy(id="send_login_link")
	WebElement btnSendOtp;
	
	
	
	
	
	public void clickRadiobtn() {
		btnRadio.click();
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void clickSendOTPbtn() {
		btnSendOtp.click();
	}


}
