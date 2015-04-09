package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetflixHomePageObject {

	@FindBy(name = "start")
	private WebElement startBtn;
	private WebDriver driver;
	
	
	public NetflixHomePageObject openNetflixHomePage(){
		driver.get("https://www.netflix.com/us/");
		return this;
	}

	public NetflixHomePageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public AccountCreationPageObject clickOnStartBtn(){
		startBtn.click();
		return PageFactory.initElements(driver,  AccountCreationPageObject.class);
	}
}
