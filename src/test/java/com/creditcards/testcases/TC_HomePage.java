package com.creditcards.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.creditcard.actions.HomePage_BusinessCardsActions;
import com.creditcard.actions.HomePage_RewardsCardsActions;
import com.creditcard.actions.HomePage_TravelCardsActions;
import com.creditcards.utilities.ReadUrlValidation;

public class TC_HomePage extends BaseClass {

	ReadUrlValidation readUrl = new ReadUrlValidation();
	
	
//Rewards Cards Action Class
	@Test(enabled = true, priority = 1)
	public void verifyingHomePage_RewardsCardsActions() {
		// Capture main window handle
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl() + " : " + mainWindowHandle);

		// HomePage_RewardsCardsActions rewards class
		HomePage_RewardsCardsActions rewards = new HomePage_RewardsCardsActions(driver);

		/* Validating Sapphire Preferred Apply now */
		rewards.clickSapphirePreferredApply();
		logger.info("Clicked 'Apply now' button, a new window should open");

		// window handles
		windowHandles.gettingHandles();
		String actualSapphireApplyUrl = driver.getCurrentUrl();
		System.out.println(actualSapphireApplyUrl);

		String sapphireApplyURL = readUrl.getSapphireApplyNowUrl();

		if (actualSapphireApplyUrl.equals(sapphireApplyURL)) {
			logger.info("Expected Apply now URL and Actual Apply now URL are the same (verifying Apply URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are not the same (verifying Apply URL - Failed)");
			captureScreenshot(driver, "HomePage_RewardsCardsActions");
			Assert.assertTrue(false);
		}
		driver.close();

		// switch back to main window
		windowHandles.switchBackToMainWindow();

		/* Validating Sapphire Preferred Learn more */
		rewards.clickSapphirePreferredLearnMore();
		String actualSapphireLearnMore = driver.getCurrentUrl();
		System.out.println(actualSapphireLearnMore);

		String sapphireLearnMoreURL = readUrl.getSapphireLearnMore();

		if (actualSapphireLearnMore.equals(sapphireLearnMoreURL)) {
			logger.info(
					"Expected Sapphire Preferred learn more URL and actual Sapphire Preferred learn more URL are same (verifying learn more URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Sapphire Preferred learn more URL and actual Sapphire Preferred learn more URL are not same (verifying learn more URL - Failed)");
			captureScreenshot(driver, "verifyingHomePage");
			Assert.assertTrue(false);
		}

		driver.navigate().back();

		/* Validating the Freedom Unlimited Apply now */
		rewards.clickFreedomUnlimitedApply();
		logger.info("Clicked Freedom Unlimited Apply, new window should open");

		// window handles
		windowHandles.gettingHandles();
		String actualFreedomApplyUrl = driver.getCurrentUrl();
		System.out.println(actualFreedomApplyUrl);

		String freedomApplyURL = readUrl.getFreedomApplyNowUrl();

		// verifying the Apply now URL
		if (actualFreedomApplyUrl.equals(freedomApplyURL)) {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are the same (verifying Freedom Apply URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are not the same (verifying Freedom Apply URL - Failed)");
			captureScreenshot(driver, "HomePage_RewardsCardsActions");
			Assert.assertTrue(false);
		}
		driver.close();

		// switch back to main window
		windowHandles.switchBackToMainWindow();

		/* Validating Freedom Unlimited Learn more */
		rewards.clickFreedomUnlimitedLearnMore();

		String actualFreedomLearnMoreUrl = driver.getCurrentUrl();
		System.out.println(actualFreedomLearnMoreUrl);

		String freedomLearnMoreURL = readUrl.getFreedomLearnMoreUrl();

		if (actualFreedomLearnMoreUrl.equals(freedomLearnMoreURL)) {
			logger.info(
					"Expected Learn more URL and Actual Learn more URL are the same (verifying Freedom Learn moreURL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Learn more URL and Actual Learn more URL are not the same (verifying Freedom Learn more URL - Failed)");
			captureScreenshot(driver, "HomePage_RewardsCardsActions");
			Assert.assertTrue(false);
		}

		driver.navigate().back();

		rewards.clickAmazonLearnMore();
		logger.info("Clicked Amazon learn more, new window should open");

		// window handles
		windowHandles.gettingHandles();
		String actualAmazonLearnUrl = driver.getCurrentUrl();
		System.out.println(actualAmazonLearnUrl);

		String amazonLearnURL = readUrl.getAmazonLearnMoreUrl();

		if (actualAmazonLearnUrl.equals(amazonLearnURL)) {
			logger.info(
					"Expected Learn URL and Actual Learn more URL are the same (verifying Amazon learn more URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Learn more URL and Actual learn more URL are not the same (verifying Amazon learn more URL - Failed)");
			captureScreenshot(driver, "HomePage_RewardsCardsActions");
			Assert.assertTrue(false);
		}
		driver.navigate().back();

	}
	
	
/********************Travel Cards Action Class******************/
	@Test(enabled = false, priority = 2)
	public void verifyingHomePage_TravelCardsActions() {
		// Capture main window handle
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl() + mainWindowHandle);

		// Initializing the HomePage_TravelCardsActions class
		HomePage_TravelCardsActions travel = new HomePage_TravelCardsActions(driver);

		// validating the Sapphire Reserve Apply now
		travel.clickSapphireReserveApplyNow();
		windowHandles.gettingHandles();
		String actualSapphireReverseApply = driver.getCurrentUrl();
		System.out.println(actualSapphireReverseApply);

		String sapphirereserveapplynowURL = readUrl.getSapphireReserveApplyNow();

		// verifying the Apply now URL
		if (actualSapphireReverseApply.equals(sapphirereserveapplynowURL)) {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are same (verifying Sapphire Reserve Apply Now URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are not same (verifying Sapphire Reserve Apply Now URL - Failed)");
			Assert.assertTrue(false);
			captureScreenshot(driver, "verifyingHomePage_TravelCardsActions");
		}
		driver.close();

		// switch back to main window
		windowHandles.switchBackToMainWindow();

		// validating the Sapphire Reserve Learn more
		travel.clickSapphireReserveLearnMore();
		windowHandles.gettingHandles();
		String actualSapphireReserveLearn = driver.getCurrentUrl();
		System.out.println(actualSapphireReserveLearn);

		String sapphireReserveLearnMoreURL = readUrl.getSapphireReserveLearnMore();

		// verifying the Learn more URL
		if (actualSapphireReserveLearn.equals(sapphireReserveLearnMoreURL)) {
			logger.info(
					"Expected Learn more URL and Actual Learn more URL are same (verifying Sapphire Reserve Learn more URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Learn more URL and Actual Learn more URL are not same (verifying Sapphire Reserve Learn more URL - Failed)");
			Assert.assertTrue(false);
			captureScreenshot(driver, "verifyingHomePage_TravelCardsActions");
		}
		driver.navigate().back();

		// validating the South west Rapid Rewards Apply
		travel.clickSouthwestRapidRewardsApplyNow();
		windowHandles.gettingHandles();
		String actualSouthwestRapidRewardsApply = driver.getCurrentUrl();
		System.out.println(actualSouthwestRapidRewardsApply);

		String southwestRapidRewardsApplyURL = readUrl.getSouthwestRapidRewardsApplyNow();

		// verifying the Apply now URL
		if (actualSouthwestRapidRewardsApply.equals(southwestRapidRewardsApplyURL)) {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are same (verifying Southwest Rapid Rewards Apply URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are not same (verifying Southwest Rapid Rewards Apply URL - Failed)");
			Assert.assertTrue(false);
			captureScreenshot(driver, "verifyingHomePage_TravelCardsActions");
		}
		driver.close();

		// switch back to main window
		windowHandles.switchBackToMainWindow();

		// validating the South west Rapid Rewards Learn more
		travel.clickSouthwestRapidRewardsLearnMore();
		windowHandles.gettingHandles();
		String actualSouthwestRapidRewardsLearnMore = driver.getCurrentUrl();
		System.out.println(actualSouthwestRapidRewardsLearnMore);

		String southwestRapidRewardsLearnMoreURL = readUrl.getSouthwestRapidrewaRdsLearnMoreUrl();

		// verifying the Learn more URL
		if (actualSouthwestRapidRewardsLearnMore.equals(southwestRapidRewardsLearnMoreURL)) {
			logger.info(
					"Expected Learn more URL and Actual Learn more URL are same (verifying Southwest Rapid Rewards Learn more URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Learn more URL and Actual Learn more URL are not same (verifying Southwest Rapid Rewards Learn more URL - Failed)");
			Assert.assertTrue(false);
			captureScreenshot(driver, "verifyingHomePage_TravelCardsActions");
		}
		driver.navigate().back();

		// switch back to main window
		windowHandles.switchBackToMainWindow();

		// validating the United Apply now
		travel.clickUnitedApplyNow();
		windowHandles.gettingHandles();
		String actualUnitedApply = driver.getCurrentUrl();
		System.out.println(actualUnitedApply);

		String unitedApplyURL = readUrl.getUnitedApplyNow();

		// verifying the Apply now URL
		if (actualUnitedApply.equals(unitedApplyURL)) {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are same (verifying United Apply URL - Passed)");
			Assert.assertTrue(true);
		} else {
			logger.info(
					"Expected Apply now URL and Actual Apply now URL are not same (verifying United Apply URL - Failed)");
			Assert.assertTrue(false);
			captureScreenshot(driver, "verifyingHomePage_TravelCardsActions");
		}
		driver.close();

		// switch back to main window
		windowHandles.switchBackToMainWindow();

		// validating the United learn more
		travel.clickUnitedLearnMore();
		windowHandles.gettingHandles();
		String actualUnitedApplyNow = driver.getCurrentUrl();
		System.out.println(actualUnitedApplyNow);

		String unitedLearnMoreURL = readUrl.getUnitedLearnMore();

		// verifying the Learn more url
		if (actualUnitedApplyNow.equals(unitedLearnMoreURL)) {
			logger.info(
					"Expected Learn now URL and Actual Learn now URL is same (verifying United Learn more URL - Passed");
		} else {
			logger.info(
					"Expected Learn now URL and Actual Learn now URL are not same (verifying United Learn more URL - Failed");
			captureScreenshot(driver, "verifyingHomePage_TravelCardsActions");
		}
		driver.navigate().back();

	}
	
	
/**********Business Cards Action Class***************/
	
	@Test(enabled = true, priority = 3)
	public void verifyingHomePage_BusinessCardsActions()
	{
		//capture main page window handle
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl() + " : " + mainWindowHandle);
		
		//creating the object of business cards action class
		HomePage_BusinessCardsActions business = new HomePage_BusinessCardsActions(driver);
		
		//validating the Ink cash apply now
		business.clickInkCashApplyNow();
		windowHandles.gettingHandles();
		
		
		String actualInkCashApply = driver.getCurrentUrl();
		System.out.println(actualInkCashApply);
		
		String expectedInkCashApplyURL = readUrl.getInkCashApplyNow();
		
		if(actualInkCashApply.equals(expectedInkCashApplyURL))
		{
			logger.info("Expected Apply now URL and Actual Apply now URL is same ( Verifying Ink Cash Apply now URL - Passed");
		}else
		{
			logger.info("Expected Apply now URL and Actual Apply now URL is not same ( Verifying Ink Cash Apply now URL - Failed ");
			captureScreenshot(driver, "verifyingHomePage_BusinessCardsActions");
		}
		driver.close();
		
		windowHandles.switchBackToMainWindow();
		
		//validating the Ink cash Learn more
		business.clickInkCasshLearnMore();
		windowHandles.gettingHandles();
		String actualInkCashLearnUrl = driver.getCurrentUrl();
		System.out.println(actualInkCashLearnUrl);
		
		String expectedInkCashUrl = readUrl.getInkCashLearnMore();
		if(actualInkCashLearnUrl.equals(expectedInkCashUrl))
		{
			logger.info("Expected Ink cash learn more URL and Actual Ink cash URL is same (Verifying Ink cash Learn more URL - Passed ");
		}else
		{
			logger.info("\"Expected Ink cash learn more URL and Actual Ink cash URL is not same (Verifying Ink cash Learn more URL - Failed");
			captureScreenshot(driver, "verifyingHomePage_BusinessCardsActions");
		}
		
		driver.navigate().back();
		
		//validating the Ink Preferred Apply now
		business.clickInkPreferredApplyNow();
		windowHandles.gettingHandles();
		
		String actualInkPreferredUrl = driver.getCurrentUrl();
		System.out.println(actualInkPreferredUrl);
		
		String expectedInkPreferredApplyUrl = readUrl.getInkPreferredApplyNow();
		
		if(actualInkPreferredUrl.equals(expectedInkPreferredApplyUrl))
		{
			logger.info("Expected Ink Preferred Apply now URL and Actual Ink Preferred Apply now URL is same (Verifying Ink Preferred Apply now URL - PASSED");
		}else 
		{
			logger.info("Expected Ink Preferred Apply now URL and Actual Ink Preferred Apply now URL is not same (Verifying Ink Preferred Apply now URL - FAILED");
			captureScreenshot(driver, "verifyingHomePage_BusinessCardsActions");
		}
		driver.close();
		
		windowHandles.switchBackToMainWindow();
		
		//Validating the Ink Preferred Learn more
		business.clickInkPreferredLearnMore();
		
		String actualInkPreferredLearnUrl = driver.getCurrentUrl();
		System.out.println(actualInkPreferredLearnUrl);
		
		String expectedInkPreferredLearnUrl = readUrl.getInkPreferredLearnMore();
		
		if(actualInkPreferredLearnUrl.equals(expectedInkPreferredLearnUrl))
		{
			logger.info("Expected Ink Preferred Learn more URL and Actual Ink Preferred Learn more URL is same (Varifying Ink Preferred Learn more URL - PASSED");
		}else
		{
			logger.info("Expected Ink Preferred Learn more URL and Actual Ink Preferred Learn more URL is same (Varifying Ink Preferred Learn more URL - PASSED");
			captureScreenshot(driver, "verifyingHomePage_BusinessCardsActions");
		}
		driver.navigate().back();
		
		//Validating South West Performance Apply now
		business.clickSouthwestPerformanceApplyNow();
		windowHandles.gettingHandles();
		
		String actualSouthwestPerformanceApply = driver.getCurrentUrl();
		System.out.println(actualSouthwestPerformanceApply);
		
		String expectedSouthwestPerformanceApplyUrl = readUrl.getSouthwestPerformanceApply();
		
		if(actualSouthwestPerformanceApply.equals(expectedSouthwestPerformanceApplyUrl))
		{
			logger.info("Expected South West Performance Apply now URL and Actual South West Performance Apply URL is same (Varifying South West Performance Apply URL - PASSED");
		}else
		{
			logger.info("Expected South West Performance Apply now URL and Actual South West Performance Apply URL is not same (Varifying South West Performance Apply URL - FAILED");
			captureScreenshot(driver, "verifyingHomePage_BusinessCardsActions");
		}
		driver.close();
		
		windowHandles.switchBackToMainWindow();
		
		//Validating the South West Performance Learn More
		business.clickSouthwestPerformanceLearnMore();
		String actualSouthwestPerformanceLearnUrl = driver.getCurrentUrl();
		System.out.println(actualSouthwestPerformanceLearnUrl);
		
		String expectedouthwestPerformanceLearnUrl = readUrl.getSouthwestPerformanceLearn();
		
		if(actualSouthwestPerformanceLearnUrl.equals(expectedouthwestPerformanceLearnUrl))
		{
			logger.info("Expected South West Performance Learn more URL and Actual South West Performance Learn more Url is same (Varifying South West Performance Learn more URL - PASSED");
		}else
		{
			logger.info("\"Expected South West Performance Learn more URL and Actual South West Performance Learn more Url is not same (Varifying South West Performance Learn more URL - FAILED");
			captureScreenshot(driver, "verifyingHomePage_BusinessCardsActions");
		}
		driver.navigate().back();
		
		driver.quit();
		
		
		
		
		
	}
}
