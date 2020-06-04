package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_Files", glue = "org.stepdefinition", dryRun = false,plugin= {"pretty","html:src\\test\\resources\\Reports\\HTML Reports","json:src\\test\\resources\\Reports\\Json Reports\\login.json","junit:src\\test\\resources\\Reports\\Junit xml Reports\\login.xml"})
public class TestRunner {

	@AfterClass
	public static void jvmReportGeneration() {

		JVMReports.generateJVMReport("src\\test\\resources\\Reports\\Json Reports\\login.json");
	}
}
