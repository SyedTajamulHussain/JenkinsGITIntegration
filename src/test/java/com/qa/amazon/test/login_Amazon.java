package com.qa.amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.Base.BaseClass;

public class login_Amazon extends BaseClass {

public WebDriver driver;
BaseClass baseclass;
String url;

	@BeforeMethod
	public void setup() {
		baseclass = new BaseClass();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url=prop.getProperty("URL");
		driver.get(url);
	}
	

@Test
public void Login() {


	
}

}
