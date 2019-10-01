package utils.screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import utils.Base.Drivers;

public class ScreenShotManager extends Drivers {

	public String CaptureScreenshot(String ScreenshotName, AppiumDriver driver) {
	String path = null;
	String relativepath = null;
	try {
		path = Drivers.testReportFolderPath+"Screenshots/"+ScreenshotName+".png";
		relativepath = "./Screnshots/"+ ScreenshotName +".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(path));
		return relativepath;
	}
	catch(Exception e) {
		System.out.println("Exception while taking the screenshot"+ e.getMessage());
	}
	return relativepath;
	}
}