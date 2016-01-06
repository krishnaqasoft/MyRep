package com.selenium.framework.suiteB;

import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.framework.util.Constants;
import com.selenium.framework.util.TestCaseDataProvider;
import com.selenium.framework.util.Utility;
import com.selenium.framework.util.Xls_Reader;

public class TestB2 {
	
	@Test(priority=1,dataProviderClass=TestCaseDataProvider.class,dataProvider="getDataForSuiteB")
	public void testB2(Hashtable<String,String> data){
		String testName ="testB2";
		Xls_Reader xls = new Xls_Reader(Constants.SUITEB_XLS_PATH);
		Utility.validateTestExecution(testName,"SUITEB",data.get(Constants.RUNMODE_COL),xls);

		Logger log = Utility.initLogs(testName+" - "+data.get(Constants.ITERATION_COL));
		log.debug("Executing  "+ testName+" - "+data.toString());
		// check the runmodes
		Utility.validateTestExecution(testName,"SUITEB",data.get(Constants.RUNMODE_COL),xls);
	}
}
