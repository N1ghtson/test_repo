import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import tests.BaseTest;

public class CalculatorTest extends BaseTest {

    @Test
    public void subtraction(){
        MainPage mainPage = new MainPage();
        mainPage.eight.click();
        mainPage.minus.click();
        mainPage.five.click();
        mainPage.equals.click();
        Assertions.assertEquals("3", mainPage.actualResult.getText());
    }

    @Test
    public void addition(){
        MainPage mainPage = new MainPage();
        mainPage.six.click();
        mainPage.plus.click();
        mainPage.four.click();
        mainPage.equals.click();
        Assertions.assertEquals("10", mainPage.actualResult.getText());
    }

    @Test
    public void multiplication(){
        MainPage mainPage = new MainPage();
        mainPage.clear.click();
        mainPage.two.click();
        mainPage.multiply.click();
        mainPage.two.click();
        mainPage.equals.click();
        Assertions.assertEquals("4", mainPage.actualResult.getText());
    }

    @Test
    public void divideByZero(){
        MainPage mainPage = new MainPage();
        mainPage.three.click();
        mainPage.divide.click();
        mainPage.zero.click();
        mainPage.equals.click();
        Assertions.assertEquals("Can't divide by 0", mainPage.result.getText());
    }

    @Test
    public void divide(){
        MainPage mainPage = new MainPage();
        mainPage.nine.click();
        mainPage.divide.click();
        mainPage.three.click();
        mainPage.equals.click();
        Assertions.assertEquals("3", mainPage.actualResult.getText());
    }
}
