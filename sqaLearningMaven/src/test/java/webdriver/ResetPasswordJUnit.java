package webdriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(value=Parameterized.class)
public class ResetPasswordJUnit {
	private String email; 
		
	WebDriver driver;

	@Before
	public void setup() {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	public ResetPasswordJUnit(String oper1){
		this.email = oper1;
	}
	
	@Parameters
	public static Collection<String[]> getAddData(){
		String[][] dataArr = null;
		dataArr = new String[][]{		
	    {"affhlhf@lfddsd.com"},
	    {"kdjhfldf@ldfh.com"},
	    {"dflhdshfs@lhdf.com"}
	  	};
		List<String[]> intArrList = Arrays.asList(dataArr);
		return intArrList;
	}
	

//	@Test
//	public void testResetPasswordMessage() {
	@Test							//Added for exe 2/14/15
	public void testResetPasswordMessage() {		//Added for exe 2/14/15
		
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

