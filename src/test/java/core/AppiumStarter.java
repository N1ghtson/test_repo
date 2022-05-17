package core;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.IOException;

import static java.lang.String.format;

public class AppiumStarter {

    private static AppiumDriverLocalService appiumDriver;

    private AppiumStarter() {
    }

        public static AppiumDriverLocalService getAppiumDriver(int port) {
            if (appiumDriver == null) startService(port);

            return appiumDriver;
        }

        public static void startService(int port){
            appiumDriver = new AppiumServiceBuilder()
                    .withIPAddress("127.0.0.1")
                    .usingPort(4723)
                    .build();
            appiumDriver.start();
        }

        public static void closeAppium() {
            appiumDriver.stop();
        }

    public static void closeEmulator() {
        try {
            Runtime.getRuntime().exec(format("adb -s %s emu kill", "emulator-5554"));
        } catch (IOException e) {
            e.getMessage();
        }
    }

    }

