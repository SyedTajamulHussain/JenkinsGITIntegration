package com.amazon.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public Properties prop;
	
	public  BaseClass() {
	try {
		prop =new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +"/src/main/java/com/qa/Configs/config.properties");
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

}
}