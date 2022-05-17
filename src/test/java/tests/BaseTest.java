package tests;

import core.AppiumStarter;
import core.BaseDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    @BeforeAll
    public static void start(){
        BaseDriver.getDriver();
    }

    @BeforeEach
    public void waiter() throws InterruptedException {
        Thread.sleep(2000);
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
