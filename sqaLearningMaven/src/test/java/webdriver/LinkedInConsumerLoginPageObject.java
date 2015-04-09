package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInConsumerLoginPageObject {
	
	private WebDriver driver;
	
	@FindBy(id="first-name")
	private WebElement firstnameInput;
	
	@FindBy(id="last-name")
	private WebElement lastnameInput;
	
	@FindBy(id="join-email")
	private WebElement joinemailInput;
	
	@FindBy(id="join-password")
	private WebElement joinpasswordInput;
	
	@FindBy(css="button.btn.btn-primary.join-btn.join-btn-control")
	private WebElement joinNowBtn;
	
	@FindBy(css="button.fb-btn")
	private WebElement fbbtnBtn;
	
	public LinkedInConsumerLoginPageObject(WebDriver driver){
		this.driver = driver;
	}

	public LinkedInConsumerLoginPageObject enterFirstName(){
		firstnameInput.sendKeys("gfljfglHF");
		return this;
	}
	
	public LinkedInConsumerLoginPageObject enterLastname(){
		lastnameInput.sendKeys("gkahglk");
		return this;
	}
	
	public LinkedInConsumerLoginPageObject enterJoinEmail(){
		joinemailInput.sendKeys("jgkdgha@alkjfh.com");
		return this;
	}
	
	public LinkedInConsumerLoginPageObject enterJoinPassword(){
		joinpasswordInput.sendKeys("ldhfglajdhfal");
		return this;
	}
	
	public LinkedInConsumerLoginPageObject clickOnjoinNow(){
		joinNowBtn.click();
		return this;
	}
}
