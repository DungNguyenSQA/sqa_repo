package webdriver;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class ResetPasswordTest_ {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	//Reset password exe on 2/14/15
	 @DataProvider(name = "email")
	 public Object[][] createData() {
	  return new Object[][] {
	    {"affhlhf@lfddsd.com","ufafuf"},
	    {"kdjhfldf@ldfh.com","kudfus"},
	    {"dflhdshfs@lhdf.com","gfdffds"}
	  	};
	 }
	 
	//End exe on 2/14/15
	
	
//	@Test
//	public void testResetPasswordMessage() {
	@Test (dataProvider = "email")								//Added for exe 2/14/15
	public void testResetPasswordMessage(String email, String password) {		//Added for exe 2/14/15
		
		final String partialLinkText = "Forgot Password";
//		final String email = "test@automation.com";				//Comment for exe 2/14/15
		final String message_part1 = "Please check your ";
		final String message_part2 = " inbox for an email from Work.com containing your password reset instructions.";
		
		final String message = message_part1
				+ email
				+ message_part2;
		// timeout will happen in 20 sec
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// navigate to https://app.work.com/#login
		driver.get("https://app.work.com/#login");
		// wait until "Forgot Password?" link gets displayed
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
				.partialLinkText(partialLinkText)));
		// click on "Forgot Password?" link
		driver.findElement(By.partialLinkText(partialLinkText)).click();
		// timeout will happen in 20 sec
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
				.className("GPWX50PCMMD")));
		// type email into input field
		driver.findElement(By.cssSelector("input.gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD"))
				.sendKeys(email);
		// hit the button
		driver.findElement(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")).click();
		// wait 20 ses
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.className("GPWX50PCEND")));
		final String pageSource = driver.getPageSource();
		
		Assert.assertTrue("The text is not present on the page", pageSource.contains(message_part1) && pageSource.contains(message_part2) && pageSource.contains(email));
		Assert.assertTrue("The text is not present on the page", driver.findElement(By.className("GPWX50PCEND")).getText().contains(message));
	}

}
