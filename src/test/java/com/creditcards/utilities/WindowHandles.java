package com.creditcards.utilities;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class WindowHandles {
    protected WebDriver driver;
    protected Set<String> windowHandles;
    protected String mainWindowHandle;

    // Constructor: Receives WebDriver instance
    public WindowHandles(WebDriver driver) {
        this.driver = driver;
        this.mainWindowHandle = driver.getWindowHandle();
    }

    public void gettingHandles() {
        windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the new window
                break;
            }
        }
    }

    public void switchBackToMainWindow() {
        driver.switchTo().window(mainWindowHandle); // Switch back to the main window
    }
}