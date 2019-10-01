package utils.Base;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.common.CommonUtils;
import utils.reports.ExtentReportManager;

public class Drivers {
	public static AppiumDriverLocalService service;
	public static AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities capabilities;
	public static ExtentReports reports = ExtentReportManager.getInstance();
	public static String timestamp;
	public static String snapshotpathfolderPath;
	public static String testReportFolderPath;
	public void invokeDriver() throws FileNotFoundException, IOException, ParseException {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		CommonUtils.set_capabilities();
		URL serverURL = new URL("http://localhost:"+4723+"/wd/hub");
		driver = new AndroidDriver<MobileElement>(serverURL,capabilities);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	public void closeDriver() {
		driver.quit();;
		service.stop();
	}
}
