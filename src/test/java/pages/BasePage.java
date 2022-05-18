package pages;

import core.BaseDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

abstract public class BasePage {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(BaseDriver.getDriver()), this);
    }
}
