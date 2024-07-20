package com.creditcard.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_BusinessCardsElements {
	
	private WebDriver driver;
	
	public HomePage_BusinessCardsElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@data-card-name= 'InkCash']/descendant::a[@data-pt-name= 'cc_homepage_allbiz_AN1']")
	private WebElement inkCashApplyNow;
	
	@FindBy(xpath = "//*[@data-card-name= 'InkCash']/descendant::a[@data-pt-name= 'cc_homepage_allbiz_LM1']")
	private WebElement inkCasshLearnMore;
	
	@FindBy(xpath = "//*[@data-card-name= 'InkPreferred']/descendant::a[@data-pt-name= 'cc_homepage_allbiz_AN2']")
	private WebElement inkPreferredApplyNow;
	
	@FindBy(xpath = "//*[@data-card-name= 'InkPreferred']/descendant::a[@data-pt-name= 'cc_homepage_allbiz_LM2']")
	private WebElement inkPreferredLearnMore;
	
	@FindBy(xpath = "//*[@data-card-name= 'SouthwestPerformanceBusiness']/descendant::a[@data-pt-name= 'cc_homepage_allbiz_AN3']")
	private WebElement southwestPerformanceApplyNow;
	
	@FindBy(xpath = "//*[@data-card-name= 'SouthwestPerformanceBusiness']/descendant::a[@data-pt-name= 'cc_homepage_allbiz_LM3']")
	private WebElement southwestPerformanceLearnMore;
	
	//get methods for above web elements
	public WebElement getInkCashApplyNow()
	{
		return inkCashApplyNow;
	}
	
	public WebElement getInkCasshLearnMore()
	{
		return inkCasshLearnMore;
	}
	
	public WebElement getInkPreferredApplyNow()
	{
		return inkPreferredApplyNow;
	}
	
	public WebElement getInkPreferredLearnMore()
	{
		return inkPreferredLearnMore;
	}
	
	public WebElement getSouthwestPerformanceApplyNow()
	{
		return southwestPerformanceApplyNow;
	}
	
	public WebElement getSouthwestPerformanceLearnMore()
	{
		return southwestPerformanceLearnMore;
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	

}
