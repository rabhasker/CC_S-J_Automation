package com.creditcard.actions;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.creditcard.elements.HomePage_BusinessCardsElements;

public class HomePage_BusinessCardsActions {
	
	private WebDriver driver;
	private HomePage_BusinessCardsElements businessCards;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	private WebElement element;
	
	public HomePage_BusinessCardsActions(WebDriver driver)
	{
		this.driver = driver;
		businessCards = new HomePage_BusinessCardsElements(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		js = (JavascriptExecutor)driver;
	}
	
	public void clickInkCashApplyNow()
	{
		element = businessCards.getInkCashApplyNow();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickInkCasshLearnMore()
	{
		element = businessCards.getInkCasshLearnMore();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickInkPreferredApplyNow()
	{
		element = businessCards.getInkPreferredApplyNow();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickInkPreferredLearnMore()
	{
		element = businessCards.getInkPreferredLearnMore();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickSouthwestPerformanceApplyNow()
	{
		element = businessCards.getSouthwestPerformanceApplyNow();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickSouthwestPerformanceLearnMore()
	{
		element = businessCards.getSouthwestPerformanceLearnMore();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}

}
