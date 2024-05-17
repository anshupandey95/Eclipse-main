package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readcnfig {

	Properties prop;

	public readcnfig() {

		File src = new File("./Configurations/config.properties");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		;
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String Launch() {
		String broooose = prop.getProperty("driver");
		return broooose;
	}

	public String appUrl() {
		String urll = prop.getProperty("url");
		return urll;
	}

}
