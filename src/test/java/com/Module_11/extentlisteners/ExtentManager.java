package com.Module_11.extentlisteners;
import com.Module_11.base.BaseTest;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.microsoft.playwright.Page;


public class ExtentManager {

	private static ExtentReports extent;
	public static String fileName;

	public static ExtentReports createInstance(String fileName) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);

		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(fileName);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("QA", "Deep Mangi");
		extent.setSystemInfo("Organization", "RadixWeb");
		extent.setSystemInfo("Build no", "M11-1");

		return extent;
	}

	public static void captureScreenshot() throws IOException {

		Date d = new Date();
		fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		BaseTest.getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./reports/"+fileName)));
	}

}
