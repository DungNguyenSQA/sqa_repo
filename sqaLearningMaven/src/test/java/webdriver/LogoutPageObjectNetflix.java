package webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPageObjectNetflix {
	
	@FindBy(css = "a.msil")
	private WebElement signInBtn;
	
}
