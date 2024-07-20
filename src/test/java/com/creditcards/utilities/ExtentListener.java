package com.creditcards.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListener implements ITestListener {

	private ExtentSparkReporter htmlReporter;
	private ExtentReports reports;
	private ExtentTest test;

	public void configureReports() {
		
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "CradidCards" +timestamp +".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Extentreports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		reports.setSystemInfo("Machine", "testPc1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("Browser", "Chrome");

		htmlReporter.config().setDocumentTitle("Automation Test Report");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	@Override
	public void onStart(ITestContext context) {
		configureReports();
		System.out.println("Test context started: " + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test result finished: " + context.getName());
		reports.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.FAIL,
				MarkupHelper.createLabel("Name of the failed test case: " + result.getName(), ExtentColor.RED));


		String screenshotPath = System.getProperty("user.dir") + "\\ScreenShots\\" + result.getName() + ".png";
		File screenShotFile = new File(screenshotPath);
		
		if(screenShotFile.exists())
		{
			test.fail("Captured screenshot is below: " + test.addScreenCaptureFromPath(screenshotPath));
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.PASS,
				MarkupHelper.createLabel("Name of the passed test case: " + result.getName(), ExtentColor.GREEN));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	    test = reports.createTest(result.getName());
	    test.log(Status.SKIP,
	            MarkupHelper.createLabel("Name of the skipped test case: " + result.getName(), ExtentColor.YELLOW));
	  
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Optional implementation
	}
}