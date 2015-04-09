package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResetPasswordPageObject {

	@FindBy(partialLinkText = "Forgot Password")
	private WebElement forgotPasswordLink;
	
	//or @FindBy(how = How.CSS, using = "input.gwt-...")
	@FindBy(css = "input.gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD")
	private WebElement emailInput;
	
	@FindBy(css = "button.GPWX50PCPL.GPWX50PCLMD")	
	private WebElement resetButton;
	
	@FindBy(className = "GPWX50PCEND")
	private WebElement passwordInput;
	
	private WebDriver driver;
	
	public ResetPasswordPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public void navigateToLoginPage(){
		driver.get("https://app.work.com/#login");
	}

	public ResetPasswordPageObject resetPasswordPageObj(){	// throws InterruptedException{
		forgotPasswordLink.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		emailInput.sendKeys("ssdSDd@faksdDe.com");
		resetButton.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Thread.sleep(3000);
		
		return this;
	}
		
	public void checkMessage(){
		final String error_message = "inbox for an email from Work.com containing your password reset instructions.";
		Assert.assertTrue(driver.getPageSource().contains(error_message));
	}
}

