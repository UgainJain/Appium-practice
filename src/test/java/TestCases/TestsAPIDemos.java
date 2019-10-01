package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Framework.businessLogic.ApiDemosBL;
import utils.Base.Drivers;
public class TestsAPIDemos extends Drivers{
	ApiDemosBL abl;
	@BeforeSuite
	public void beforeConfig() throws FileNotFoundException, IOException, ParseException {
		abl = new ApiDemosBL();
		invokeDriver();
	}
	@Test
	public void  HideShowBtns() throws FileNotFoundException, IOException, ParseException  {
		Assert.assertTrue(abl.check_for_hiding_feature());
		Assert.assertTrue(abl.showBtns());
		Assert.assertTrue(abl.backtohmscrn());
		}
	@Test
	public void verify_show_titlebtn() {
		Assert.assertTrue(abl.showtitlebtn());
	}
	@AfterMethod
	public void afterMethod() {
		if (reports != null) {
			reports.flush();
		}
	}
	@AfterSuite
	public void close() {
		closeDriver();
	}

}