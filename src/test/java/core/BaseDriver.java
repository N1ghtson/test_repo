package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseDriver {
    private static AppiumDriver<MobileElement> driver;

    private BaseDriver(){
    }

    private static AppiumDriver<MobileElement> createDriver() {
        driver = new AndroidDriver<>(AppiumStarter.getAppiumDriver(4723), BaseConfiguration.getCapabilities());
        return driver;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }


}
