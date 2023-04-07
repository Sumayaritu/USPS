package utils;

import java.io.IOException;
import java.util.Properties;
import static utils.IConstant.*;

public class Configuration {
	private Properties properties;

	public Configuration() {
		loadProperty();
	}

	public void loadProperty() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperties(String key) {
		return properties.getProperty(key);
	}

	/*
	 * public static void main(String[]args) { Configuration configuration=new
	 * Configuration(); //configuration.loadProperty();
	 * System.err.println(configuration.getProperties(URL));
	 * System.err.println(configuration.getProperties(BROWSER)); }
	 */
}
