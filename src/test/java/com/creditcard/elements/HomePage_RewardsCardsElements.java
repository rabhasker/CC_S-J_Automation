package com.creditcard.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_RewardsCardsElements {

	private WebDriver driver;

	public HomePage_RewardsCardsElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements with private access
	@FindBy(xpath = "//*[@data-card-name = 'SapphirePreferred']/descendant::a[@data-pt-name= 'cc_homepage_allreward_AN1']")
	private WebElement sapphirePreferredApply;

	@FindBy(xpath = "//*[@data-card-name= 'FreedomUnlimited']/descendant::a[@data-pt-name= 'cc_homepage_allreward_AN2']") 
	private WebElement freedomUnlimitedApply;

	@FindBy(xpath = "//*[@data-pt-name= 'cc_homepage_allreward_LM1']")
	private WebElement sapphirePreferredLearnMore;

	@FindBy(xpath = "//*[@data-card-name= 'FreedomUnlimited']/descendant::a[@data-pt-name= 'cc_homepage_allreward_LM2']") 
	private WebElement freedomUnlimitedLearnMore;

	@FindBy(xpath = "//*[@data-card-name= 'Amazon']/descendant::a[@data-pt-name= 'cc_homepage_allreward_AN3']") 
	private WebElement amazonLearnMore;

	// Getter methods for WebElements
	public WebElement getSapphirePreferredApply() {
		return sapphirePreferredApply;
	}

	public WebElement getfreedomUnlimitedApply() {
		return freedomUnlimitedApply;
	}

	public WebElement getfreedomUnlimitedLearnMore() {
		return freedomUnlimitedLearnMore;
	}

	public WebElement getamazonLearnMore() {
		return amazonLearnMore;
	}

	public WebElement getSapphirePreferredLearnMore() {
		return sapphirePreferredLearnMore;
	}

	public WebDriver getDriver() {
		return driver;
	}
}
