package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LinkedInBuildProfilePageObject {
	
	private WebDriver driver;
	
	@FindBy(id="countryCode-location-employedProfileForm")
	private WebElement countryCodelocationemployedProfileFormDropdown;

	@FindBy(id="postalCode-location-employedProfileForm")
	private WebElement postalCodelocationemployedProfileFormInput;

	@FindBy(id="employed-btn")
	private WebElement employedbtnRadio;

	@FindBy(id="looking-btn")
	private WebElement lookingbtnRadio;

	@FindBy(id="student-btn")
	private WebElement studentbtnRadio;

	@FindBy(id="workCompanyTitle-lookingProfileForm")
	private WebElement workCompanyTitlelookingProfileFormInput;

	@FindBy(id="selfEmployed-employeeCompany-lookingProfileForm")
	private WebElement selfEmployedemployeeCompanylookingProfileFormChkBox;

	@FindBy(id="companyName-companyInfo-employeeCompany-lookingProfileForm")
	private WebElement companyNamecompanyInfoemployeeCompanylookingProfileFormInput;
	
	@FindBy(id="industryChooser-employeeCompany-lookingProfileForm")
	private WebElement industryChooseremployeeCompanylookingProfileFormDropdown;
	
	@FindBy(id="startYear-previousStartEnd-lookingProfileForm")
	private WebElement startYearpreviousStartEndlookingProfileFormDropdown;

	@FindBy(id="endYear-previousStartEnd-lookingProfileForm")
	private WebElement endYearpreviousStartEndlookingProfileFormDropdown;
	
	@FindBy(id="looking-btn-submit")
	private WebElement lookingbtnsubmitBtn;
	
	public LinkedInBuildProfilePageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LinkedInBuildProfilePageObject clickOnCountryCodelocationemployedProfileForm(){
		Select countryCodelocationemployedProfileFormDropd = new Select(countryCodelocationemployedProfileFormDropdown);
		countryCodelocationemployedProfileFormDropd.selectByVisibleText("United States");
		return this;
	}
	
	public LinkedInBuildProfilePageObject enterPostalCodelocationemployedProfileForm(){
		postalCodelocationemployedProfileFormInput.sendKeys("95050");
		return this;
	}
	
	public LinkedInBuildProfilePageObject clickOnlookingbtn(){
		lookingbtnRadio.click();
		return this;
	}
	
	public LinkedInBuildProfilePageObject enterWorkCompanyTitlelookingProfileForm(){
		workCompanyTitlelookingProfileFormInput.sendKeys("gfdvzvsgad");
		return this;
	}
	
	public LinkedInBuildProfilePageObject clickOnselfEmployedemployeeCompanylookingProfileForm(){
		selfEmployedemployeeCompanylookingProfileFormChkBox.click();
		return this;
	}
	
	public LinkedInBuildProfilePageObject companyNamecompanyInfoemployeeCompanylookingProfileForm(){
		companyNamecompanyInfoemployeeCompanylookingProfileFormInput.sendKeys("fadgavfggdaf");
		return this;
	}
	
	public LinkedInBuildProfilePageObject industryChooseremployeeCompanylookingProfileForm(){
		Select industryChooseremployeeCompanylookingProfileFormDrop = new Select(industryChooseremployeeCompanylookingProfileFormDropdown);
		industryChooseremployeeCompanylookingProfileFormDrop.selectByVisibleText("Arts and Crafts");
		return this;
	}
	
	public LinkedInBuildProfilePageObject clickOnstartYearpreviousStartEndlookingProfileForm(){
		Select startYearpreviousStartEndlookingProfileFormDrop = new Select(startYearpreviousStartEndlookingProfileFormDropdown);
		startYearpreviousStartEndlookingProfileFormDrop.selectByVisibleText("2011");
		return this;
	}
	
	public LinkedInBuildProfilePageObject clickOnendYearpreviousStartEndlookingProfileForm(){
		Select endYearpreviousStartEndlookingProfileFormDrop = new Select(endYearpreviousStartEndlookingProfileFormDropdown);
		endYearpreviousStartEndlookingProfileFormDrop.selectByVisibleText("Present");
		return this;
	}
	
	public LinkedInBuildProfilePageObject clickOnlookingbtnsubmit(){
		lookingbtnsubmitBtn.click();
		return this;
	}
	
	

}
