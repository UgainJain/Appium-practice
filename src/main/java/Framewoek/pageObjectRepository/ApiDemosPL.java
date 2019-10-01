package Framewoek.pageObjectRepository;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import io.appium.java_client.MobileElement;
import utils.Base.Drivers;
import utils.DataSource.JSONLib;

public class ApiDemosPL extends Drivers{
	JSONLib jlib = new JSONLib();
	
public MobileElement getAnimationBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase1", "Animation"));
	}
public MobileElement getHideShowBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase1", "Hide/show"));
	}
public MobileElement getHideBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementById(jlib.ReadFromJson("LocatorsTestCase1", "HideBtn"));
	}
public MobileElement get0Btn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase1", "0"));
	}
public MobileElement get1Btn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase1", "1"));
	}
public MobileElement get2Btn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase1", "2"));
	}
public MobileElement get3Btn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase1", "3"));
	}
public MobileElement getShowBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementById(jlib.ReadFromJson("LocatorsTestCase1", "ShowBtn"));
	}
public MobileElement getAppBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase2", "App"));
	}
public MobileElement getActionBarBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase2", "ActionBar"));
	}
public MobileElement getDisplayOptionBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase2", "Displayopt"));
	}
public MobileElement getShowTtlBtn() throws FileNotFoundException, IOException, ParseException {
	return driver.findElementById(jlib.ReadFromJson("LocatorsTestCase2", "ShowTtlBtn"));
	}
public MobileElement getTitle() throws FileNotFoundException, IOException, ParseException {
	try {
		return driver.findElementByXPath(jlib.ReadFromJson("LocatorsTestCase2", "Title"));
		}
	catch(Exception e) {
		return null;
		}
  		}

}


