package com.creditcards.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

import com.creditcards.utilities.ReadConfig;
import com.creditcards.utilities.WindowHandles;

public class BaseClass {
	protected WebDriver driver;
	protected Logger logger;
	protected WindowHandles windowHandles;

	// For ReadConfig class
	private ReadConfig readConfig = new ReadConfig();
	protected String url = readConfig.getUrl();
	private String browser = readConfig.getBrowser();

	@BeforeClass
	public void setUp() {
		initializeLogger();
		try {
//			initializeDriver(); // Initialize WebDriver
			initializeHeadless(); // Initialize Headless
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			logger.info("URL opened successfully");
			driver.manage().window().maximize();
			logger.info("Navigating to URL: " + url);
			windowHandles = new WindowHandles(driver);
		} catch (Exception e) {
			logger.error("Error during setup: " + e.getMessage(), e);
			throw e;
		}
	}

	private void initializeLogger() {
		logger = LogManager.getLogger(BaseClass.class);
	}
	
	private void initializeHeadless()
	{
		switch (browser.toLowerCase()) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("headless");
			driver = new ChromeDriver(chromeOptions);
			break;
		case "msedge":
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--headless");
			driver = new EdgeDriver(edgeOptions);
			break;
		case "firefox":
			FirefoxOptions foxOptions = new FirefoxOptions();
			foxOptions.addArguments("headless");
			driver = new FirefoxDriver(foxOptions);
			default:
				logger.error("Unsupported browser: " + browser);
				throw new RuntimeException ("Unsupported browser: " + browser);
			}
	}

	private void initializeDriver() {
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "msedge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			logger.error("Unsupported browser: " + browser);
			throw new RuntimeException("Unsupported browser: " + browser);
		}
		logger.info(browser + " browser initialized successfully");
	}

	// Uncomment and use this method if you need to close the browser after each
	// test
	// @AfterClass
	// public void tearDown() {
	// if (driver != null) {
	// driver.quit();
	// logger.info("Browser closed successfully");
	// }
	// }

	public void captureScreenshot(WebDriver driver, String testName) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "//ScreenShots//" + testName + ".png");

		try {
			FileUtils.copyFile(scrFile, destination);
			logger.info("Screenshot captured: " + destination.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}