package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInLogonSubmit {
	
	private WebDriver driver;
	
	@FindBy(name="session_key")
	private WebElement session_keyInput;
	
	@FindBy(name="session_password")
	private WebElement session_passwordInput;
	
	@FindBy(name="signin")
	private WebElement signinBtn;
	
	@FindBy(xpath="//a[contains(text(),'Join now')]")
	private WebElement joinnowLink;
	
	public LinkedInLogonSubmit (WebDriver driver){
		this.driver = driver;
	}
	
	public LinkedInLogonSubmit enterSession_passwordInput(){
		session_passwordInput.sendKeys("fdhfkddsafsjhf");
		return this;
	}
	
	public LinkedInLogonSubmit clickOnsignin(){
		signinBtn.click();
		return this;
	}
	
	public LinkedInSignUpPageObject clickOnjoinnowLink(){
		joinnowLink.click();
		return PageFactory.initElements(driver, LinkedInSignUpPageObject.class);
	}
}
