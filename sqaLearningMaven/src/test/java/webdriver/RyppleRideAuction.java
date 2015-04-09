package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RyppleRideAuction {

	private WebDriver driver;
	private boolean toairportRadio=true;
	
	@BeforeMethod
	private void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	private void teardown(){
		driver.quit();
	}
	
	@Test(invocationCount = 1)
	public void testRideAuction(){
		RideAuctionHomePageObject RideAuctionHomePageObj = PageFactory.initElements(driver, RideAuctionHomePageObject.class);
		RideAuctionHomePageObj.openRideAuctionHomePage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RideAuctionHomePageObj.clickOnToAirPortRadio();
		RideAuctionHomePageObj.clickfromairportRadio();
		toairportRadio=false;
		RideAuctionHomePageObj.clickOnSubmitBtn();

		RideAuctionHomePageObj.selectPassengers();
		RideAuctionHomePageObj.enterDatePicker();
		RideAuctionHomePageObj.selectHour();
		RideAuctionHomePageObj.selectMinute();
		if (toairportRadio) {
			RideAuctionHomePageObj.selectToAirport();
			RideAuctionHomePageObj.enterOriginationAddress();
		}else{
			RideAuctionHomePageObj.selectFromAirport();
			RideAuctionHomePageObj.enterAirline();
			RideAuctionHomePageObj.enterDestinationAddress();
			RideAuctionHomePageObj.clickInternationalDomestic();
			RideAuctionHomePageObj.clickGate();
		}
		RideAuctionHomePageObj.clickOnExtra();
		RideAuctionHomePageObj.clickOnExtraStop();
		RideAuctionHomePageObj.selectNoOfStops();
		RideAuctionHomePageObj.clickOnExtra1();
		RideAuctionHomePageObj.selectCar();
		RideAuctionHomePageObj.enterPromoCode();
		
		RideAuctionHomePageObj.clickOnPriceCheck();
		
		
		RideAuctionHomePageObj.enterBidprice();
		RideAuctionHomePageObj.clickOnTermscheck();
		RideAuctionHomePageObj.clickOnbidsubmit();
		
		
		RideAuctionHomePageObj.enterFN();
		RideAuctionHomePageObj.enterMail();
		RideAuctionHomePageObj.enterPhone();
		RideAuctionHomePageObj.enterBillingFirstName();
		RideAuctionHomePageObj.enterCCNum();
		RideAuctionHomePageObj.selectexpDateMonth_inpyt();
		RideAuctionHomePageObj.selectexpDateYear_inpyt();
		RideAuctionHomePageObj.enterCCThreeDig();
		RideAuctionHomePageObj.clickfinishorder();
		
		Assert.assertTrue(driver.getPageSource().contains("Please Enter Valid Credit Card Number"));
		
		RideAuctionHomePageObj.clickOnCloseBtn();
			
	}
}
