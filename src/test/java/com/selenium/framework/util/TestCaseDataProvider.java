package com.selenium.framework.util;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestCaseDataProvider {
	
	@DataProvider(name="getDataForSuiteA",parallel=true)
	public static Object[][] getDataForSuiteA(Method m){
		//System.out.println(m.getName());
		String testCase=m.getName();
		Xls_Reader xls = new Xls_Reader(Constants.SUITEA_XLS_PATH);
		return Utility.getData(testCase,xls);
	}
	

	@DataProvider(name="getDataForSuiteB",parallel=true)
	public static Object[][] getDataForSuiteB(Method m){
		//System.out.println(m.getName());
		String testCase=m.getName();
		Xls_Reader xls = new Xls_Reader(Constants.SUITEB_XLS_PATH);
		return Utility.getData(testCase,xls);
	}
	
	

}
