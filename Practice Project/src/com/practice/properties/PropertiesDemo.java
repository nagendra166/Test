package com.practice.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String args[]) throws IOException
	{
	Properties prop = new Properties();
	try {
		//OutputStream output = new FileOutputStream("config.properties");
		//prop.setProperty("database", "localhost");
		//prop.setProperty("dbuser", "mkyong");
		//prop.setProperty("dbpassword", "password");
		InputStream input = new FileInputStream("config.properties");
		// save properties to project root folder
		//prop.store(output, null);
		prop.load(input);
		System.out.println(prop.getProperty("database"));
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	
		
	}

}
