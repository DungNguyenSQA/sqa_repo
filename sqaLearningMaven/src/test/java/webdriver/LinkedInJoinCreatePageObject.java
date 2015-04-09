package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedInJoinCreatePageObject {
	
	private WebDriver driver;
	
	@FindBy(id="li-logo")
	private WebElement lilogoBtn;
	
	@FindBy(id="phoneNumber-phone_challenge")
	private WebElement phoneNumberphone_challengeInput;
	
	@FindBy(css="input.cta.btn-primary")
	private WebElement cta_btnprimaryBtn;
	
	@FindBy(id="PinVerificationForm_pinParam-pin_verification")
	private WebElement PinVerificationForm_pinParampin_verification;
	
	
	public LinkedInJoinCreatePageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LinkedInJoinCreatePageObject clickOnlilogo(){
		lilogoBtn.click();
		return this;
	}
	
	public LinkedInJoinCreatePageObject enterphoneNumberphone_challenge(){
		phoneNumberphone_challengeInput.sendKeys("5102905467");
		return this;
	}
	
	public LinkedInJoinCreatePageObject clickOnCta_btnprimary(){
		cta_btnprimaryBtn.click();
		return this;
	}
	
	public LinkedInJoinCreatePageObject enterPinVerificationForm_pinParampin_verification(){
		PinVerificationForm_pinParampin_verification.sendKeys("1234");
		return this;
	}
	
	

}
