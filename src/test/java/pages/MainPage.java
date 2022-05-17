package pages;

import core.BaseDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @AndroidFindBy(id="com.google.android.calculator:id/digit_0")
    public MobileElement zero;

    @AndroidFindBy(id="com.google.android.calculator:id/digit_2")
    public MobileElement two;

    @AndroidFindBy(id="com.google.android.calculator:id/digit_3")
    public MobileElement three;

    @AndroidFindBy(id="com.google.android.calculator:id/digit_4")
    public MobileElement four;

    @AndroidFindBy(id="com.google.android.calculator:id/digit_5")
    public MobileElement five;

    @AndroidFindBy(id="com.google.android.calculator:id/digit_6")
    public MobileElement six;

    @AndroidFindBy(id="com.google.android.calculator:id/digit_8")
    public MobileElement eight;

    @AndroidFindBy(id="com.google.android.calculator:id/digit_9")
    public MobileElement nine;

    @AndroidFindBy(id="com.google.android.calculator:id/op_div")
    public MobileElement divide;

    @AndroidFindBy(id="com.google.android.calculator:id/op_mul")
    public MobileElement multiply;

    @AndroidFindBy(id="com.google.android.calculator:id/op_sub")
    public MobileElement minus;

    @AndroidFindBy(id="com.google.android.calculator:id/op_add")
    public MobileElement plus;

    @AndroidFindBy(id="com.google.android.calculator:id/eq")
    public MobileElement equals;

    @AndroidFindBy(id="com.google.android.calculator:id/result_final")
    public MobileElement actualResult;

    @AndroidFindBy(id="com.google.android.calculator:id/result_preview")
    public MobileElement result;

    @AndroidFindBy(id="com.google.android.calculator:id/clr")
    public MobileElement clear;

    public MainPage() {PageFactory.initElements(new AppiumFieldDecorator(BaseDriver.getDriver()), this);
    }
}
