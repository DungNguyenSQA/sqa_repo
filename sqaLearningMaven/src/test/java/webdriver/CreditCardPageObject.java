package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreditCardPageObject {
	@FindBy(css = "span.payment-type.payment-type-CC ")
	//@FindBy(name = "mopType")
	private WebElement creditCardSection;
	
	@FindBy(id = "firstName-CC")
	private WebElement firstNameInput;

	@FindBy(id = "lastName-CC")
	private WebElement lastNameInput;

	@FindBy(id = "cardNumber-CC")
	private WebElement creditCardInput;

	@FindBy(id = "zipcode")
	private WebElement zipcodeInput;
		
	@FindBy(name = "expirationMonth")
	private WebElement expirationMonthDropdown;
		
	@FindBy(name = "expirationYear")
	private WebElement expirationYear;
		
	@FindBy(id = "securityCode_CC")
	private WebElement securityCodeInput;
		
	@FindBy(className = "terms-checkbox")
	private WebElement checkBox;
	
	@FindBy(css = "button.blue.btnlg")
	private WebElement startMemberShipBtn;
	
	@FindBy(css = "span.text")
	private WebElement signOutLink;

	@FindBy(css = "div.aerrors")
	private WebElement errorsMessage;
	//"A valid card number must be entered into the form."
	
	private WebDriver driver;
	
	public CreditCardPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public CreditCardPageObject clickOnCreditCardSection(){
		creditCardSection.click();
		return this;
	}
	
	public CreditCardPageObject enterFirstName(){
		firstNameInput.clear();
		firstNameInput.sendKeys("hdaldsfggfda");
		return this;
	}

	public CreditCardPageObject enterLastName(){
		lastNameInput.clear();
		lastNameInput.sendKeys("jhfldfk");
		return this;
	}

	public CreditCardPageObject enterCreditCard(){
		creditCardInput.sendKeys("1234567890");
		return this;
	}

	public CreditCardPageObject enterZipCode(){
		zipcodeInput.sendKeys("1234");
		return this;
	}

	public CreditCardPageObject selectExpirationMonth(){
		Select expMonthDropdown = new Select(expirationMonthDropdown);
		expMonthDropdown.selectByVisibleText("Jan (1)");
		return this;
	}

	public CreditCardPageObject selectExpirationYear(){
		Select expYearDropdown = new Select(expirationYear);
		expYearDropdown.selectByVisibleText("2020");
		return this;
	}
	
	public CreditCardPageObject enterSecurityCode(){
		securityCodeInput.sendKeys("123");
		return this;
	}

	public CreditCardPageObject clickOnCheckbox(){
		checkBox.click();
		return this;
	}
	
	public CreditCardPageObject clickOnStartMemberShipBtn(){
		startMemberShipBtn.click();;
		return this;
	}
	
	public CreditCardPageObject checkErrorMessage(){
		Assert.assertFalse(driver.getPageSource().contains("A valid card number must be entered."));
		return this;
	}
	
	public LogoutPageObjectNetflix clickOnSignOutLink(){
		signOutLink.click();
		return PageFactory.initElements(driver, LogoutPageObjectNetflix.class);
	}
	
	
}