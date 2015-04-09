package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetFlixRegistrationPageObject {

	@FindBy(name = "start")
	private WebElement startFreeButton;

	@FindBy(id = "cont_tiers_button")
	private WebElement continueButton;

	@FindBy(id = "email")
	private WebElement emailInput;

	@FindBy(id = "password")
	private WebElement passwordInput;
	
	//or @FindBy(how = How.CSS, using = "input.gwt-...")	
	@FindBy(id = "regFormButton")	
	private WebElement registerButton;
	
	@FindBy(css = "span.payment-type.payment-type-CC ")
	private WebElement creditCardSpan;
	
	@FindBy(id = "firstName-CC")
	private WebElement firstNameInput;

	@FindBy(id = "lastName-CC")
	private WebElement lastNameInput;

	@FindBy(id = "cardNumber-CC")
	private WebElement creditCardInput;

	@FindBy(id = "zipcode")
	private WebElement zipcodeInput;
		
	@FindBy(name = "expirationMonth")
	private WebElement selectexpirationMonth;
		
	@FindBy(name = "expirationYear")
	private WebElement selectexpirationYear;
		
	@FindBy(id = "securityCode_CC")
	private WebElement securityCodeInput;
		
	@FindBy(id = "terms_agree_CC")
	private WebElement termCheck;
	
	@FindBy(css = "button.blue.btnlg")
	private WebElement memberShipButton;
	
	@FindBy(css = "div.aerrors")
	private WebElement errorsMessage;
	//"A valid card number must be entered into the form."

	@FindBy(css = "span.text")
	private WebElement logoutButton;

	
	private WebDriver driver;
	
	public NetFlixRegistrationPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public void navigateToLoginPage(){
		driver.get("https://www.netflix.com/us/");
	}
	
	
}
