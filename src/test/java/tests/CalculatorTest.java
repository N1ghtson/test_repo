package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class CalculatorTest extends BaseTest {

    @Test
    public void subtraction(){
        MainPage mainPage = new MainPage();
        mainPage.eight.click();
        mainPage.minus.click();
        mainPage.five.click();
        mainPage.equals.click();
        Assert.assertEquals(mainPage.actualResult.getText(), "3");
    }

    @Test
    public void addition(){
        MainPage mainPage = new MainPage();
        mainPage.six.click();
        mainPage.plus.click();
        mainPage.four.click();
        mainPage.equals.click();
        Assert.assertEquals(mainPage.actualResult.getText(), "10");
    }

    @Test
    public void multiplication(){
        MainPage mainPage = new MainPage();
        mainPage.clear.click();
        mainPage.two.click();
        mainPage.multiply.click();
        mainPage.two.click();
        mainPage.equals.click();
        Assert.assertEquals(mainPage.actualResult.getText(), "4");
    }

    @Test
    public void divideByZero(){
        MainPage mainPage = new MainPage();
        mainPage.three.click();
        mainPage.divide.click();
        mainPage.zero.click();
        mainPage.equals.click();
        Assert.assertEquals(mainPage.result.getText(), "Can't divide by 0");
    }

    @Test
    public void divide(){
        MainPage mainPage = new MainPage();
        mainPage.nine.click();
        mainPage.divide.click();
        mainPage.three.click();
        mainPage.equals.click();
        Assert.assertEquals(mainPage.actualResult.getText(), "3");
    }
}
