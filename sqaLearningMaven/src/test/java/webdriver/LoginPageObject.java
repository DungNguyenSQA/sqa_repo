package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

public class LoginPageObject {
	@FindBy(name = "j_username")		//or @FindBy(how = How.CSS, using = "a.login")	
	private WebElement userNameInput;
	
	@FindBy(id = "10f609781286c67a")
	private WebElement passwordInput;
	
	@FindBy(id = "10f60978316c0ffb")
	private WebElement loginBtn;
	
	private WebDriver driver;
	
	public LoginPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LoginPageObject loginWithInvalidCredentials() throws InterruptedException{
		userNameInput.clear();
		userNameInput.sendKeys("ssdSDd@faksdDe.com");
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		passwordInput.sendKeys("Fesfssdsfzx");
		loginBtn.click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		return this;
	}
	
	public void navigateToLoginPage(){
		driver.get("https://app.work.com/#login");
	}
	
	public HomePageObject loginWithValidCredentials(){
		userNameInput.sendKeys("test@valid.com");
		passwordInput.sendKeys("password1334");
		loginBtn.click();
		return PageFactory.initElements(driver, HomePageObject.class);
	}

	public void checkErrorMessage(){
		final String error_message = "The email or password you entered is incorrect.";
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("10f6097864cda4c2")));
		
		AssertJUnit.assertTrue(driver.getPageSource().contains(error_message));
	}
}
