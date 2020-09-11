package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	public static void main(String[] args) {
		getProperties();
		setProperties();

	}

	public static void getProperties() {
		try {		
			InputStream is = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(is);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browserName = browser;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setProperties() {
		try {
			OutputStream os = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			prop.setProperty("Result", "pass");
			prop.store(os, null);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
