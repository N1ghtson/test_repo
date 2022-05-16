package tests;

import core.AppiumStarter;
import core.BaseDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void start(){
        BaseDriver.getDriver();
    }

    @AfterMethod
    public void reset(){
        BaseDriver.getDriver().resetApp();
    }

    @AfterTest
    public void close(){
        BaseDriver.closeDriver();
        AppiumStarter.closeAppium();
        AppiumStarter.closeEmulator();
    }
}
