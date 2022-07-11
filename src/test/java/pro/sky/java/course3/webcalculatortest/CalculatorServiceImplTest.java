package pro.sky.java.course3.webcalculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();


    @Test
    public void sum() {
        Number sum = calculatorServiceImpl.returnAmount(2.0, 3.0);
        Number sum1 = calculatorServiceImpl.returnAmount(3.0, 7.0);
        org.assertj.core.api.Assertions.assertThat(sum).isEqualTo(5.0);
        org.assertj.core.api.Assertions.assertThat(sum1).isEqualTo(10.0);
    }

    @Test
    public void difference() {
        Number dif = calculatorServiceImpl.returnDifference(3.0, 2.0);
        Number dif1 = calculatorServiceImpl.returnDifference(-3.0, -2.0);
        org.assertj.core.api.Assertions.assertThat(dif).isEqualTo(1.0);
        org.assertj.core.api.Assertions.assertThat(dif1).isEqualTo(-1.0);
    }

    @Test
    public void multiplication() {
        double mult = calculatorServiceImpl.returnMultiplication(10.0, 2.0);
        double mult1 = calculatorServiceImpl.returnMultiplication(10.0, -2.0);
        org.assertj.core.api.Assertions.assertThat(mult).isEqualTo(20);
        org.assertj.core.api.Assertions.assertThat(mult1).isEqualTo(-20);
    }

    @Test
    public void divide() {
        Number div = calculatorServiceImpl.returnDivision(6.0, 3.0);
        Number div1 = calculatorServiceImpl.returnDivision(-6.0, 3.0);
        org.assertj.core.api.Assertions.assertThat(div).isEqualTo(2.0);
        org.assertj.core.api.Assertions.assertThat(div1).isEqualTo(-2.0);
    }

    @Test
    public void returnDivisorNotZero() {
        Assertions.assertThrows(CalculatorZeroException.class, () -> calculatorServiceImpl.returnDivision(10.0, 0.0));


    }
}

