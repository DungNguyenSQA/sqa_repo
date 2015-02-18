package webdriver;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public final class ResetPasswordTestOld {
	private WebDriver driver;

	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testResetPasswordMessage(){
		final String partialLinkText = "Forgot Password";
		final String email = "testsjfla@idhfa.com";
		final String message_part1 = "Please check your ";
		final String message_part2 = " inbox for an email from Work.com containing your password reset instructions.";
		final String message = message_part1+email+message_part2;
		
		//Wait for 20sec 
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://app.work.com/#login");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialLinkText)));
		//Click on Forgot Password
		driver.findElement(By.partialLinkText(partialLinkText)).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("GPWX50PCPL GPWX50PCLMD")));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(),'Send me reset instructions']")));
		driver.findElement(By.cssSelector("input.gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD")).sendKeys(email);
		driver.findElement(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("GPWX50PCEND")));
		
		final String pageSource = driver.getPageSource();
		Assert.assertTrue("The text is not present on the page", pageSource.contains(message_part1) 
				&& pageSource.contains(message_part2) && pageSource.contains(email));
//		Assert.assertTrue("The text is not present on the page", driver.findElement(By.className("GPWX50PCCND")));
		Assert.assertTrue("The text is not present on the page", driver.findElement(By.className("GPWX50PCEND")).getText().contains(message));
	}		
}
