package com.acc_cucumber_demo3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature99"
		,glue= {"step_definition99"}
	//	,tags= {"@SmokeTest"}
		//,tags= {"@RegressionTest"}
	//	,tags= {"@FunctionalTest"}
	//	,tags= {"@SmokeTest","@RegressionTest"}// and tagged
	//	,tags= {"@SmokeTest,@RegressionTest"}// or tagged
	//	,tags= {"@SmokeTest","~@RegressionTest"}// ignoring test
		,tags= {"~@SmokeTest","~@RegressionTest","~@End2End"}// without tag scenario how many ?
		)

public class Testrunner {

}
