package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	public static String getConfig(String key) throws IOException {		
		Properties properties = new Properties();		
		FileInputStream file = new FileInputStream(new File("config.properties"));		
		properties.load(file);
		return properties.get(key).toString();
	}

	
	public  static void main(String[] args) throws IOException {
		String url = getConfig("AppUrl");
		System.out.println(url);
	
	}
}

