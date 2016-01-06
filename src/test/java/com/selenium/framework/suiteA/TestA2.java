package com.selenium.framework.suiteA;

import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.framework.util.Constants;
import com.selenium.framework.util.TestCaseDataProvider;
import com.selenium.framework.util.Utility;
import com.selenium.framework.util.Xls_Reader;

public class TestA2 {
	
	@Test(priority=1,dataProviderClass=TestCaseDataProvider.class,dataProvider="getDataForSuiteA")
	public void testA2(Hashtable<String,String> data){
		String testName ="testA2";
		Xls_Reader xls = new Xls_Reader(Constants.SUITEA_XLS_PATH);
		Utility.validateTestExecution(testName,"SUITEA",data.get(Constants.RUNMODE_COL),xls);

		Logger log = Utility.initLogs(testName+" - "+data.get(Constants.ITERATION_COL));
		log.debug("Executing  "+ testName+" - "+data.toString());
		// check the runmodes
		Utility.validateTestExecution(testName,"SUITEA",data.get(Constants.RUNMODE_COL),xls);
	}
}
