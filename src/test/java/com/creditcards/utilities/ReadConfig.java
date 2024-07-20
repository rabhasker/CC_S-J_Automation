package com.creditcards.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadConfig {

    private Properties properties;
    private String configPath;
    private static final Logger logger = LogManager.getLogger(ReadConfig.class);

    public ReadConfig() {
        this("C:\\Users\\rbhasker\\eclipse-workspace\\CreditCard\\Configuration\\config.properties");
    }

    public ReadConfig(String configPath) {
        this.configPath = configPath;
        loadProperties();
    }

    private void loadProperties() {
        try (FileInputStream file = new FileInputStream(configPath)) {
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            logger.error("Failed to load properties from " + configPath, e);
            throw new RuntimeException("Failed to load properties from " + configPath, e);
        }
    }

    public String getUrl() {
        String url = properties.getProperty("baseUrl");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("URL not found in the config file");
        }
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser != null) {
            return browser;
        } else {
            throw new RuntimeException("Browser not found in the config file");
        }
    }
}