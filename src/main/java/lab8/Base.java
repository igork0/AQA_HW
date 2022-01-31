package lab8;

import org.testng.annotations.DataProvider;

public class Base {
    Calculator calc = new Calculator();
    @DataProvider(parallel = true)
    public Object[][] sumData() {
        return new Object[][]{
                {5, calc.sum(2, 3)},
                {0, calc.sum(0, 0)},
                {0, calc.sum(-2, 2)},
                {-100, calc.sum(-30, -70)},
                {10000, calc.sum(3000, 7000)},
        };
    }
    @DataProvider(parallel = true)
    public Object[][] minusData() {
        return new Object[][]{
                {2, calc.minus(5, 3)}
        };
    }
    @DataProvider(parallel = true)
    public Object[][] multiplyData() {
        return new Object[][]{
                {6, calc.multiply(2, 3)}
        };
    }
    @DataProvider(parallel = true)
    public Object[][] divideData() {
        return new Object[][]{
                {2, calc.divide(6, 3)}
        };
    }
}
