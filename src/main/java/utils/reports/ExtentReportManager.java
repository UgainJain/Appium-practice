package utils.reports;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import utils.Base.Drivers;


public class ExtentReportManager {
	private static ExtentReports extent;
	public static ExtentReports getInstance() {
		if(extent == null) {
			Date d  = new Date();
				Drivers.timestamp = d.toString().replace(":", "_").replace(" ", "_");
				String reportFolderPath = System.getProperty("user.dir")+"\\Resources\\Reports\\"+"Test_Report_"+Drivers.timestamp+"\\";
				Drivers.testReportFolderPath =reportFolderPath;
				String filename = Drivers.timestamp+".html";
				extent = new ExtentReports(Drivers.testReportFolderPath+filename,true,DisplayOrder.NEWEST_FIRST);
				
				extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
				
				extent.addSystemInfo("Selenium version", "3.11.0");
		}
		return extent;
	}
}