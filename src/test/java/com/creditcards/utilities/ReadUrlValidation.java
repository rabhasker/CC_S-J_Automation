package com.creditcards.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadUrlValidation {

	private Properties prop;
	private String configLocation;
	private static final Logger logger = LogManager.getLogger(ReadUrlValidation.class);

	public ReadUrlValidation() {
		this("C:\\Users\\rbhasker\\eclipse-workspace\\CreditCard\\UrlForValidation\\urls.properties");
	}

	public ReadUrlValidation(String configLocation) {
		this.configLocation = configLocation;
		loadUrlProperties();
	}

	private void loadUrlProperties() {
		try (FileInputStream file = new FileInputStream(configLocation)) {
			prop = new Properties();
			prop.load(file);
		} catch (IOException e) {
			logger.error("Failed to load properties from " + configLocation, e);
			throw new RuntimeException("Failed to load properties from " + configLocation, e);
		}
	}

	// Rewards cards
	public String getSapphireApplyNowUrl() {
		String sapphireApplyUrl = prop.getProperty("RewardsSapphireApplyNow");
		if (sapphireApplyUrl != null) {
			return sapphireApplyUrl;
		} else {
			throw new RuntimeException("URL not found in the config file");
		}
	}

	public String getSapphireLearnMore() {
		String urlLearnMore = prop.getProperty("RewardsSapphireLearnMore");
		if (urlLearnMore != null) {
			return urlLearnMore;
		} else {
			throw new RuntimeException("URL not found in the config file");
		}
	}

	public String getFreedomApplyNowUrl() {
		String freedomApplyUrl = prop.getProperty("RewardsFreedomApplyNow");
		if (freedomApplyUrl != null) {
			return freedomApplyUrl;
		} else {
			throw new RuntimeException("URL not found in the config file");
		}
	}

	public String getFreedomLearnMoreUrl() {
		String freedomLearnURL = prop.getProperty("RewardsFreedomLearnMore");
		if (freedomLearnURL != null) {
			return freedomLearnURL;
		} else {
			throw new RuntimeException("URL not found in the config file");
		}
	}

	public String getAmazonLearnMoreUrl() {
		String amazonLearnMoreUrl = prop.getProperty("RewardsAmazonLearnMore");
		if (amazonLearnMoreUrl != null) {
			return amazonLearnMoreUrl;
		} else {
			throw new RuntimeException("URL not found in the config file");
		}
	}
	
	/* Travel Cards */
	public String getSapphireReserveApplyNow()
	{
		String sapphirereserveapplynowUrl = prop.getProperty("TravelSapphirereserveApplyNow");
		
		if(sapphirereserveapplynowUrl != null)
		{
			return sapphirereserveapplynowUrl;
		}else {
			throw new RuntimeException("URL not found in the config file");
		}
	}
	
	public String getSapphireReserveLearnMore()
	{
		String sapphireReserveLearnMoreUrl = prop.getProperty("TravelSapphirereserveLearnMore");
		
		if(sapphireReserveLearnMoreUrl != null)
		{
			return sapphireReserveLearnMoreUrl;
		}else {
			throw new RuntimeException("URL not found in the config file");
		}
	}
	
	public String getSouthwestRapidRewardsApplyNow()
	{
		String southwestRapidRewardsapplynowUrl = prop.getProperty("TravelSouthwestrapidrewardsApplyNow");
		
		if(southwestRapidRewardsapplynowUrl != null)
		{
			return southwestRapidRewardsapplynowUrl;
		}else {
			throw new RuntimeException("URL not found in the config file");
		}
	}
	
	public String getSouthwestRapidrewaRdsLearnMoreUrl()
	{
		String southwestRapidRewardsLearnMore = prop.getProperty("TravelsouthwestrapidrewardsLearnMore");
		
		if(southwestRapidRewardsLearnMore != null)
		{
			return southwestRapidRewardsLearnMore;
		}else {
			throw new RuntimeException("URL not found in the config file");
		}
	}
	
	public String getUnitedApplyNow()
	{
		String unitedApplyNowUrl = prop.getProperty("TravelUnitedApplyNow");
		
		if(unitedApplyNowUrl != null)
		{
			return unitedApplyNowUrl;
		}else {
			throw new RuntimeException("URL not found in the config file");
		}
	}
	
	public String getUnitedLearnMore()
	{
		String unitedLearnMoreUrl = prop.getProperty("TravelUnitedLearnMore");
		
		if(unitedLearnMoreUrl != null)
		{
			return unitedLearnMoreUrl;
		}else {
			throw new RuntimeException("URL not found in the config file");
		}
	}
	
	/* Business cards */
	public String getInkCashApplyNow()
	{
		String inkCashApplyNowUrl = prop.getProperty("BusinessInkCashApplyNow");
		
		if(inkCashApplyNowUrl != null)
		{
			return inkCashApplyNowUrl;
		}else {
			throw new RuntimeException ("URL not found in the config file");
		}
	}
	
	public String getInkCashLearnMore()
	{
		String inkCashLearnMoreUrl = prop.getProperty("BusinessInkCashLearnMore");
		
		if(inkCashLearnMoreUrl != null)
		{
			return inkCashLearnMoreUrl;
		}else
		{
			throw new RuntimeException("URL not found in the config");
		}
	}
	
	public String getInkPreferredApplyNow()
	{
		String inkPreferredApplyUrl = prop.getProperty("BusinessInkPreferredApplyNow");
		
		if(inkPreferredApplyUrl != null)
		{
			return inkPreferredApplyUrl;
		}else 
		{
			throw new RuntimeException("URL not found in the config");
		}
	}
	
	public String getInkPreferredLearnMore()
	{
		String inkPreferredLearnUrl = prop.getProperty("BusinessInkPreferredLearnMore");
		
		if(inkPreferredLearnUrl != null)
		{
			return inkPreferredLearnUrl;
		}else 
		{
			throw new RuntimeException("URL not found in the config");
		}
	}
	
	public String getSouthwestPerformanceApply()
	{
		String southwestPerformanceApplyUrl = prop.getProperty("BusinessSouthwestPerformanceApplyNow");
		
		if(southwestPerformanceApplyUrl != null)
		{
			return southwestPerformanceApplyUrl;
		}else
		{
			throw new RuntimeException("URL not found in the config");
		}
	}
	
	public String getSouthwestPerformanceLearn()
	{
		String southwestPerformanceLearnUrl = prop.getProperty("BusinessSouthwestPerformanceLearnMore");
		
		if(southwestPerformanceLearnUrl != null)
		{
			return southwestPerformanceLearnUrl;
		}else 
		{
			throw new RuntimeException("URL not found in the config");
		}
	}

}