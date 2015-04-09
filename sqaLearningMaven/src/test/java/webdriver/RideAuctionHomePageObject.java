package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RideAuctionHomePageObject {

	private WebDriver driver;
	
	@FindBy(id = "toairport")
	private WebElement toairportRadioBtn;

	@FindBy(id = "fromairport")
	private WebElement fromairportRadioBtn;

	@FindBy(name = "submit")
	private WebElement submitBtn;
	
	@FindBy(id = "close")
	private WebElement closeBtn;
	
	@FindBy(id="passengers")
	private WebElement passengersDropdown;
	
//	@FindBy(xpath="//a[contains(text(),'19')]")
//	private WebElement toto;
	
//	@FindBy(css="a.ui-state-default.ui-state-hover")
//	private WebElement toto;
	
	@FindBy(name="PickUpTime[Date]")
	private WebElement toto;
	@FindBy(id="datepicker")
	private WebElement datepickerInput;

	@FindBy(id="hour")
	private WebElement hourDropdown;
	
	@FindBy(id="minute")
	private WebElement minuteDropdown;
	
	@FindBy(id="ToAirport")
	private WebElement toAirportDropdown;
	
	@FindBy(id="FromAirport")
	private WebElement FromAirportDropdown;
	
	@FindBy(name="OriginationAddress")
	private WebElement OriginationAddressInput;
	
	@FindBy(name="InternationalDomestic")
	private WebElement InternationalDomesticRadio;
	
	@FindBy(name="Airline")
	private WebElement AirlineInput;
	
	@FindBy(name="Gate")
	private WebElement GateRadio;
	
	@FindBy(name="DestinationAddress")
	private WebElement DestinationAddressInput;	
	
	@FindBy(id="Car")
	private WebElement carDropdown;
	
	@FindBy(name="PromoCode")
	private WebElement PromoCodeInput;
	
	@FindBy(id="extralink")
	private WebElement extralinkBtn;
	
	@FindBy(name="NoOfStops")
	private WebElement NoOfStopsDropdown;
	
	@FindBy(id="ExtraStop")
	private WebElement ExtraStopChkBox;
	
	@FindBy(name="Extras[]")
	private WebElement Extra1ChkBox;
	
	
	@FindBy(id="pricecheck")
	private WebElement pricecheckBtn;
	
	@FindBy(id="termscheck")
	private WebElement termscheckBox;
	
	@FindBy(id="garantserv")
	private WebElement garantservBtn;
	
	@FindBy(id="bidsubmit")
	private WebElement bidsubmitBtn;
	
	@FindBy(id="bidprice")
	private WebElement bidpriceInput;
	
	@FindBy(id="FN")
	private WebElement FNInput;
	
	@FindBy(name="Mail")
	private WebElement MailInput;
	
	@FindBy(id="Phone")
	private WebElement PhoneInput;
	
	@FindBy(id="sameabrove")
	private WebElement sameabroveChkBox;
	
	@FindBy(id="BillingFirstName")
	private WebElement BillingFirstNameInput;
	
	@FindBy(id="CCNum")
	private WebElement CCNumInput;
	
	@FindBy(id="expDateMonth_inpyt")
	private WebElement expDateMonth_inpytDropdown;
	
	@FindBy(id="expDateYear_inpyt")
	private WebElement expDateYear_inpytDropdown;
	
	@FindBy(id="CCThreeDig")
	private WebElement CCThreeDigInput;
	
	@FindBy(id="finishorder")
	private WebElement finishorderBtn;
	
	public RideAuctionHomePageObject openRideAuctionHomePage(){
		driver.get("http://www.rideauction.com/");
		return this;
	}
	
	public RideAuctionHomePageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public RideAuctionHomePageObject clickOnToAirPortRadio(){
		toairportRadioBtn.click();
		return this;
	}
	
	public RideAuctionHomePageObject clickfromairportRadio(){
		fromairportRadioBtn.click();
		return this;
	}
	
	public RideAuctionHomePageObject clickOnSubmitBtn(){
		submitBtn.click();
		return this;
	}
	
	public RideAuctionHomePageObject clickOnCloseBtn(){
		closeBtn.click();
		return this;
	}
	
	public RideAuctionHomePageObject selectPassengers(){
		Select selpassengersDropdown = new Select(passengersDropdown);
		selpassengersDropdown.selectByVisibleText("2");
		return this;
	}
	
	public RideAuctionHomePageObject enterDatePicker(){
		datepickerInput.click();
		datepickerInput.sendKeys("4");
//		toto.click();
//		toto.sendKeys("//div[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a");
//		toto.sendKeys("DP_jQuery_1425798639682.datepicker._selectDay('#datepicker',2,2015, this);return false;");
		return this;
	}
	
	public RideAuctionHomePageObject selectHour(){
		Select selhourDropdown = new Select(hourDropdown);
		selhourDropdown.selectByVisibleText("2 AM");
		return this;
	}
	
	public RideAuctionHomePageObject selectMinute(){
		Select selminuteDropdown = new Select(minuteDropdown);
		selminuteDropdown.selectByVisibleText(":10");
		return this;
	}
	
	public RideAuctionHomePageObject selectToAirport(){
		Select selToAirportDropdown = new Select(toAirportDropdown);
		selToAirportDropdown.selectByVisibleText("SFO-San Francisco International");
		return this;
	}
	
	public RideAuctionHomePageObject enterOriginationAddress(){
		OriginationAddressInput.sendKeys("123 N FIRST ST SAN JOSE, CA 95123");
		return this;
	}
	
	public RideAuctionHomePageObject selectCar(){
		Select selcarDropdown = new Select(carDropdown);
		selcarDropdown.selectByVisibleText("Luxury");
		return this;
	}
	
	public RideAuctionHomePageObject enterPromoCode(){
		PromoCodeInput.sendKeys("khfadfa");
		return this;
	}
	
	public RideAuctionHomePageObject clickOnExtra(){
		extralinkBtn.click();
		return this;
	}
	
	public RideAuctionHomePageObject clickOnExtraStop(){
		ExtraStopChkBox.click();
		return this;
	}
	
	public RideAuctionHomePageObject selectNoOfStops(){
		Select selNoOfStopsDropdown = new Select(NoOfStopsDropdown);
		selNoOfStopsDropdown.selectByVisibleText("2");
		return this;
	}
	
	public RideAuctionHomePageObject clickOnExtra1(){
		Extra1ChkBox.click();
		return this;
	}

	public RideAuctionHomePageObject clickOnPriceCheck(){
		pricecheckBtn.click();
		return this;
	}
	
	public RideAuctionHomePageObject clickOnTermscheck(){
		termscheckBox.click();
		return this;
	}
	
	public RideAuctionHomePageObject clickOnGarantserv(){
		garantservBtn.click();
		return this;
	}
	
	public RideAuctionHomePageObject enterBidprice(){
		bidpriceInput.click();
		bidpriceInput.sendKeys("117");
		return this;
	}
	
	public RideAuctionHomePageObject clickOnbidsubmit(){
		bidsubmitBtn.click();
		return this;
	}

	public RideAuctionHomePageObject selectFromAirport(){
		Select selFromAirport = new Select(FromAirportDropdown);
		selFromAirport.selectByVisibleText("SFO-San Francisco International");
		return this;
	}
	
	public RideAuctionHomePageObject clickInternationalDomestic(){
		InternationalDomesticRadio.click();
		return this;
	}

	public RideAuctionHomePageObject enterAirline(){
		AirlineInput.sendKeys("AA123");
		return this;
	}

	public RideAuctionHomePageObject clickGate(){
		GateRadio.click();
		return this;
	}
	
	public RideAuctionHomePageObject enterDestinationAddress(){
		DestinationAddressInput.sendKeys("123 N FIRST ST SAN JOSE, CA 95123");
		return this;
	}
	
	public RideAuctionHomePageObject enterFN(){
		FNInput.sendKeys("kdjfahakjhf");
		return this;
	}
	
	public RideAuctionHomePageObject enterMail(){
		MailInput.sendKeys("dlfhafka@att.com");
		return this;
	}
	
	public RideAuctionHomePageObject enterPhone(){
		PhoneInput.sendKeys("650-254-1234");
		return this;
	}
	
	public RideAuctionHomePageObject clicksameabrove(){
		sameabroveChkBox.click();
		return this;
	}
	
	public RideAuctionHomePageObject enterBillingFirstName(){
		BillingFirstNameInput.sendKeys("lahglhgdhgdkj");
		return this;
	}
	
	public RideAuctionHomePageObject enterCCNum(){
		CCNumInput.sendKeys("1234567890");
		return this;
	}
	
	public RideAuctionHomePageObject selectexpDateMonth_inpyt(){
		Select selexpDateMonth_inpyt = new Select(expDateMonth_inpytDropdown);
		selexpDateMonth_inpyt.selectByVisibleText("03 — March");
		return this;	
	}
	
	public RideAuctionHomePageObject selectexpDateYear_inpyt(){
		Select selexpDateYear_inpyt = new Select(expDateYear_inpytDropdown);
		selexpDateYear_inpyt.selectByVisibleText("2016");
		return this;
	}
	
	public RideAuctionHomePageObject enterCCThreeDig(){
		CCThreeDigInput.sendKeys("123");
		return this;
	}
	
	public RideAuctionHomePageObject clickfinishorder(){
		finishorderBtn.click();
		return this;
	}
	
}
