package org.stepdefinition;

import java.util.Date;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before()
	public void browserLaunch1() {
		System.out.println(new Date());
	}

	@After()
	public void quitBrowser1() {
		System.out.println(new Date());
	}

	@Before("@A")
	public void browserLaunch2() {
		System.out.println("@Before Running: @A Browser Launched");
	}

	@After("@A")
	public void quitBrowser2() {
		System.out.println("@After Running: @B Browser Quit");
	}

	@Before("@B")
	public void browserLaunch3() {
		System.out.println("@Before Running: @B Browser Launched");
	}

	@After("@B")
	public void quitBrowser3() {
		System.out.println("@After Running: @B Browser Quit");
	}

}
