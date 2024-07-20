package com.creditcard.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.creditcard.elements.HomePage_TravelCardsElements;

public class HomePage_TravelCardsActions {
	
	private WebDriver driver;
	private HomePage_TravelCardsElements travelCardsElement;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	private WebElement element;
	
	public HomePage_TravelCardsActions(WebDriver driver)
	{
		this.driver = driver;
		this.travelCardsElement = new HomePage_TravelCardsElements(driver);
		this.js = (JavascriptExecutor)driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void clickSapphireReserveApplyNow()
	{
		element = travelCardsElement.getSapphireReserveApplyNow();
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickSapphireReserveLearnMore()
	{
		element = travelCardsElement.getSapphireReserveLearnMore();
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickSouthwestRapidRewardsApplyNow()
	{
		element = travelCardsElement.getSouthwestRapidRewardsApplyNow();
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickSouthwestRapidRewardsLearnMore()
	{
		element = travelCardsElement.getSouthwestRapidRewardsLearnMore();
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickUnitedApplyNow()
	{
		element = travelCardsElement.getUnitedApplyNow();
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickUnitedLearnMore()
	{
		element = travelCardsElement.getUnitedLearnMore();
		js.executeScript("arguments[0].click()", element);
	}
	
	

}
