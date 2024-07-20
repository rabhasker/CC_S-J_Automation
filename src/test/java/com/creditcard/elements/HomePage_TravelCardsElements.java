package com.creditcard.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_TravelCardsElements {

	private WebDriver driver;

	public HomePage_TravelCardsElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@data-card-name= 'SapphireReserve']/descendant::a[@data-pt-name= 'cc_homepage_alltravel_AN1']")
	private WebElement sapphireReserveApplyNow;
	
	@FindBy(xpath = "//*[@data-card-name='SapphireReserve']/descendant::a[@data-pt-name= 'cc_homepage_alltravel_LM1']") 
	private WebElement sapphireReserveLearnMore;

	@FindBy(xpath = "//*[@data-card-name= 'SouthwestAirlinesPlus']/descendant::a[@data-pt-name= 'cc_homepage_alltravel_AN2']")
	private WebElement southwestRapidRewardsApplyNow;
	
	@FindBy(xpath = "//*[@data-card-name= 'SouthwestAirlinesPlus']/descendant::a[@data-pt-name= 'cc_homepage_alltravel_LM2']") 
	private WebElement southwestRapidRewardsLearnMore;

	@FindBy(xpath = "//*[@data-card-name= 'United']/descendant::a[@data-pt-name= 'cc_homepage_alltravel_AN3']") 
	private WebElement unitedApplyNow;

	@FindBy(xpath = "//*[@data-card-name= 'United']/descendant::a[@data-pt-name= 'cc_homepage_alltravel_LM3']") 
	private WebElement unitedLearnMore;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSapphireReserveApplyNow() {
		return sapphireReserveApplyNow;
	}

	public WebElement getSouthwestRapidRewardsApplyNow() {
		return southwestRapidRewardsApplyNow;
	}
	public WebElement getSouthwestRapidRewardsLearnMore() {
		return southwestRapidRewardsLearnMore;
	}

	public WebElement getUnitedApplyNow() {
		return unitedApplyNow;
	}

	public WebElement getSapphireReserveLearnMore() {
		return sapphireReserveLearnMore;
	}

	public WebElement getUnitedLearnMore() {
		return unitedLearnMore;
	}

}
