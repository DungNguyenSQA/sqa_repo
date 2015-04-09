package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPageObject {

	@FindBy(id = "cont_tiers_button")
	private WebElement continueButton;

	@FindBy(id = "email")
	private WebElement emailInput;

	@FindBy(id = "password")
	private WebElement passwordInput;
	
	//or @FindBy(how = How.CSS, using = "input.gwt-...")	
	@FindBy(id = "regFormButton")	
	private WebElement registerBtn;
	
	private WebDriver driver;
	
	public AccountCreationPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public AccountCreationPageObject clickOnContinue(){
		continueButton.click();
		return this;
	}
	
	public CreditCardPageObject createAccount(){
		emailInput.sendKeys("lkadshfla@kdjfha.com");
		passwordInput.sendKeys("kfjlkhfds");
		registerBtn.click();
		return PageFactory.initElements(driver,  CreditCardPageObject.class);
	}
}
