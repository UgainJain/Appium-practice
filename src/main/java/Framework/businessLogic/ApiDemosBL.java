package Framework.businessLogic;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Point;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Framewoek.pageObjectRepository.ApiDemosPL;
import io.appium.java_client.MobileElement;
import utils.Base.Drivers;
import utils.common.CommonUtils;
import utils.screenshot.ScreenShotManager;

public class ApiDemosBL extends Drivers {
	ApiDemosPL apl;
	Point point_0,point_1_pre,point_2_pre,point_3_pre,point_1,point_2,point_3,point_0_upd,point_1_upd,point_2_upd,point_3_upd;
	ScreenShotManager screenlib = new ScreenShotManager();
	public ExtentTest test;
	public boolean check_for_hiding_feature() throws FileNotFoundException, IOException, ParseException {
		apl = new ApiDemosPL();
		test = reports.startTest("Hide Buttons");
		test.log(LogStatus.INFO, "Staring Test");
		try {
		CommonUtils.click(apl.getAnimationBtn());
		test.log(LogStatus.INFO, "Clicking on Animation btn");
		CommonUtils.click(apl.getHideShowBtn());
		test.log(LogStatus.INFO, "Clicking on Hide/Show btn");
		CommonUtils.click(apl.getHideBtn());
		test.log(LogStatus.INFO, "Clicking on Hide btn");
		
		MobileElement ele_0 = apl.get0Btn();
		point_0 = ele_0.getLocation();
		test.log(LogStatus.INFO, "Getting location tags info");
		MobileElement ele_1 = apl.get1Btn();
		point_1_pre = ele_1.getLocation();
		MobileElement ele_2 = apl.get2Btn();
		point_2_pre = ele_2.getLocation();
		MobileElement ele_3 = apl.get3Btn();
		point_3_pre = ele_3.getLocation();
		test.log(LogStatus.INFO, "Clicking on 0 btn");
		CommonUtils.click(ele_0);
		MobileElement ele_1_upd = apl.get1Btn();
		point_1 = ele_1_upd.getLocation();
		test.log(LogStatus.INFO, "Clicking on 1 btn");
		CommonUtils.click(ele_1_upd);
		if(point_1.equals(point_0))
		{	
			MobileElement ele_2_upd = apl.get2Btn();
			point_2 = ele_2_upd.getLocation();
			test.log(LogStatus.INFO, "Clicking on 2 btn");
			CommonUtils.click(ele_2_upd);
			if(point_2.equals(point_0))
			{
				MobileElement ele_3_upd = apl.get3Btn();
				point_3 = ele_3_upd.getLocation();
				test.log(LogStatus.INFO, "Clicking on 3 btn");
				CommonUtils.click(ele_3_upd);
				if(point_3.equals(point_0)) {
					test.log(LogStatus.PASS, "Buttons Hiding Passed ");
					reports.endTest(test);
					return true;
				}
				else {
					test.log(LogStatus.FAIL, "location tags of point 3 failed");
					test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("location tags of point 3 failed", driver)));
					reports.endTest(test);
					return false;
				}
			}
			else {
				test.log(LogStatus.FAIL, "location tags of point 2 failed");
				test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("location tags of point 2 failed", driver)));
				reports.endTest(test);
				return false;
			}
		}
		else {
			test.log(LogStatus.FAIL, "location tags of point 1 failed");
			test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("location tags of point 1 failed", driver)));
			reports.endTest(test);
			return false;
		}
		}
		catch(Exception e){
			test.log(LogStatus.FAIL, e.getMessage());
			test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot(e.getMessage(), driver)));
			reports.endTest(test);
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean showBtns() throws FileNotFoundException, IOException, ParseException {
		try {
			test = reports.startTest("Show Buttons");
			test.log(LogStatus.INFO, "Staring Test");
			test.log(LogStatus.INFO, "Clicking on Hide btn");
			CommonUtils.click(apl.getShowBtn());
			MobileElement ele_0 = apl.get0Btn();
			test.log(LogStatus.INFO, "Getting location tags info for 0");
			point_0_upd = ele_0.getLocation();
			if(point_0_upd.equals(point_0)) {
				MobileElement ele_1 = apl.get1Btn();
				point_1_upd = ele_1.getLocation();
				test.log(LogStatus.INFO, "Getting location tags info for 1");
				if(point_1_upd.equals(point_1_pre)) {
					MobileElement ele_2 = apl.get2Btn();
					point_2_upd = ele_2.getLocation();
					test.log(LogStatus.INFO, "Getting location tags info for 2");
					if(point_2_upd.equals(point_2_pre)) {
						MobileElement ele_3 = apl.get3Btn();
						point_3_upd = ele_3.getLocation();
						test.log(LogStatus.INFO, "Getting location tags info for 3");
						if(point_3_upd.equals(point_3_pre)) {
							test.log(LogStatus.PASS, "Buttons Showing Passed ");
							reports.endTest(test);
							return true;
						}
						else {
							test.log(LogStatus.FAIL, "location tags of point 3 failed");
							test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("location tags of point 3 failed", driver)));
							reports.endTest(test);
							return false;
						}
					}
					else {
						test.log(LogStatus.FAIL, "location tags of point 2 failed");
						test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("location tags of point 2 failed", driver)));
						reports.endTest(test);
						return false;
					}
				}
				else {
					test.log(LogStatus.FAIL, "location tags of point 1 failed");
					test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("location tags of point 1 failed", driver)));
					reports.endTest(test);
					return false;
				}
			}
			else {
				test.log(LogStatus.FAIL, "location tags of point 0 failed");
				test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("location tags of point 0 failed", driver)));
				reports.endTest(test);
				return false;
			}
		}
		catch (Exception e ){
			test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot(e.getMessage(), driver)));
			reports.endTest(test);
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean backtohmscrn() {
		try {
		CommonUtils.back();
		CommonUtils.back();
		return true;
	}catch(Exception e) {
		System.out.println(e.getMessage());
		return false;
	}
	}
	public boolean showtitlebtn() {
		try {
			test = reports.startTest("Checking Titles");
			test.log(LogStatus.INFO, "Staring Test");
			apl = new ApiDemosPL();
			test.log(LogStatus.INFO, "Clicking on App btn");
			CommonUtils.click(apl.getAppBtn());
			test.log(LogStatus.INFO, "Clicking on ActionBar btn");
			CommonUtils.click(apl.getActionBarBtn());
			test.log(LogStatus.INFO, "Clicking on Display options btn");
			CommonUtils.click(apl.getDisplayOptionBtn());
			test.log(LogStatus.INFO, "Clicking on ShowTitle btn");
			CommonUtils.click(apl.getShowTtlBtn());
			if(!CommonUtils.isDisplayed(apl.getTitle())) {
				test.log(LogStatus.INFO, "Title not found");
				test.log(LogStatus.INFO, "Clicking on ShowTitle btn");
				CommonUtils.click(apl.getShowTtlBtn());
				if(CommonUtils.isDisplayed(apl.getTitle())) {
					test.log(LogStatus.PASS, "Tilte btn check Passed ");
					reports.endTest(test);
					return true;
				}
				else {
					test.log(LogStatus.FAIL, "Title isnt found");
					test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("Title isnt found", driver)));
					reports.endTest(test);
					return false;
				}
			}
			else {
				test.log(LogStatus.FAIL, "Title still visible");
				test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot("Title still visible", driver)));
				reports.endTest(test);
				return false;
			}
				
		}
		catch(Exception e) {
			test.log(LogStatus.INFO, test.addScreenCapture(screenlib.CaptureScreenshot(e.getMessage(), driver)));
			reports.endTest(test);
			System.out.println(e.getMessage());
			return false;
		}
	}
	}
