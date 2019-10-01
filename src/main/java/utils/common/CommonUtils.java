package utils.common;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import utils.Base.Drivers;
import utils.DataSource.JSONLib;

public class CommonUtils extends Drivers{
	static JSONLib jlib;
	public static void set_capabilities() throws FileNotFoundException, IOException, ParseException {
		capabilities = new DesiredCapabilities();
		jlib = new JSONLib();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,JSONLib.ReadFromJson("config", "DeviceName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,JSONLib.ReadFromJson("config", "PlatformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,JSONLib.ReadFromJson("config", "PlatformVer"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,JSONLib.ReadFromJson("config", "AppPackage"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,JSONLib.ReadFromJson("config", "AppMainAct"));
	}
	public static void click(MobileElement element) {
		element.click();
	}
	public static void waiting() throws InterruptedException {
		Thread.sleep(2000);
		}
	public static void back () {
		driver.navigate().back();
	}
	public static boolean isDisplayed(MobileElement e) {
		try{
			if(e != null) {
			boolean b = e.isDisplayed();
			if(b == true)
				return true;
			else 
				return false;
		}
		else 
			return false;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}
		
	
}
