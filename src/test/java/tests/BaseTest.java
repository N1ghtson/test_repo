package tests;

import core.AppiumStarter;
import core.BaseDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {
    @BeforeAll
    public static void start(){
        BaseDriver.getDriver();
    }

    @AfterEach
    public void reset(){
        BaseDriver.getDriver().resetApp();
    }

    @AfterAll
    public static void close(){
        BaseDriver.closeDriver();
        AppiumStarter.closeAppium();
        AppiumStarter.closeEmulator();
    }
}
