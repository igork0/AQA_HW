package lab8;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest extends Base {

    @Test(dataProvider = "sumData")
    public void testSum(int result, int sumNumbers) {
        Assert.assertEquals(result, sumNumbers, "error");
    }

    @Test(dataProvider = "minusData")
    public void testMinus(int result, int minusNumbers) {
        Assert.assertEquals(result, minusNumbers );
    }

    @Test(dataProvider = "multiplyData")
    public void testDivide(int result, int multiplyNumbers) {
        Assert.assertEquals(result, multiplyNumbers);
    }

    @Test(dataProvider = "divideData")
    public void testMultiply(int result, int divideNumbers) {
        Assert.assertEquals(result, divideNumbers);

    }
}