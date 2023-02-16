package com.kumaran.helper;

import java.time.Duration;

import com.kumaran.testBase.WebBrowser;

public class WaitHelper extends WebBrowser{
	
public static void timeOut() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
}
}
