package core;

import org.openqa.selenium.remote.DesiredCapabilities;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION;
import static io.appium.java_client.remote.MobileCapabilityType.UDID;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class BaseConfiguration {

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(PLATFORM_NAME, "Android");
        capabilities.setCapability(PLATFORM_VERSION, "10.0");
        capabilities.setCapability(AVD, "Pixel_2_API_29");
        capabilities.setCapability(UDID, "emulator-5554");
        capabilities.setCapability(APP_ACTIVITY, "com.android.calculator2.Calculator");
        capabilities.setCapability(APP_PACKAGE, "com.google.android.calculator");
        return capabilities;
    }
}
