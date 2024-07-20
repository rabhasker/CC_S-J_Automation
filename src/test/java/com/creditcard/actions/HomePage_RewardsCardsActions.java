package com.creditcard.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.creditcard.elements.HomePage_RewardsCardsElements;

public class HomePage_RewardsCardsActions {
	
	private WebDriver driver;
	private HomePage_RewardsCardsElements rewardsCardsElements;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	
	public HomePage_RewardsCardsActions(WebDriver driver)
	{
		this.driver = driver;
		this.rewardsCardsElements = new HomePage_RewardsCardsElements(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void clickSapphirePreferredApply()
	{
		WebElement element = rewardsCardsElements.getSapphirePreferredApply();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickFreedomUnlimitedApply()
	{
		WebElement element = rewardsCardsElements.getfreedomUnlimitedApply();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickSapphirePreferredLearnMore()
	{
		WebElement element = rewardsCardsElements.getSapphirePreferredLearnMore();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickFreedomUnlimitedLearnMore()
	{
		WebElement element = rewardsCardsElements.getfreedomUnlimitedLearnMore();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js.executeScript("arguments[0].click()", element);
	}
	
	public void clickAmazonLearnMore()
	{
		WebElement element = rewardsCardsElements.getamazonLearnMore();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	
	

}
