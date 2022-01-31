package lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest2 {
    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(100000, 200000);
        // Then
        if (result != 300000) {
            Assert.fail();
        }
        Assert.assertEquals(result, 300000);
    }
}
