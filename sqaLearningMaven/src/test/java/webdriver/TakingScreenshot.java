package webdriver;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakingScreenshot {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testResetPasswordMessage() {
		final String partialLinkText = "Forgot Password";
		final String email = "test@automation.com";
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
		
		//Take a screenShot
		takeScreenShot();
		//End of Take the ScreenShot
		
		// click on "Forgot Password?" link
		driver.findElement(By.partialLinkText(partialLinkText)).click();
		// timeout will happen in 20 sec
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
				.className("GPWX50PCMMD")));

		//Take a screenShot
		takeScreenShot();
		//End of Take the ScreenShot
		
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
	
	private void takeScreenShot(){
		String path = "C:\\git_repo\\screenshot"+getTimeInMilliseconds()+".png";
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot)augmentedDriver).
		                            getScreenshotAs(OutputType.FILE);
		try{
		FileUtils.copyFile(screenshot, new File(path));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

//	private Timestamp getTimestamp(){
//		   Date date= new Date();
//		         //getTime() returns current time in milliseconds
//		   long time = date.getTime();
//		         //Passed the milliseconds to constructor of Timestamp class 
//		   return new Timestamp(time);
//	}
	private long getTimeInMilliseconds(){
	   //getTime() returns current time in milliseconds
	   return new Date().getTime();
}
	

}