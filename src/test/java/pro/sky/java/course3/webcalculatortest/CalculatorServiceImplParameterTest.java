package pro.sky.java.course3.webcalculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class CalculatorServiceImplParameterTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @MethodSource("giveArgumentsForCalculatorTests")
    @ParameterizedTest
    public void sum(double num1, double num2) {
        Assertions.assertEquals(num1 + num2, calculatorServiceImpl.returnAmount(num1, num2));

    }

    @MethodSource("giveArgumentsForCalculatorTests")
    @ParameterizedTest
    public void difference(double num1, double num2) {
        Assertions.assertEquals(num1 - num2, calculatorServiceImpl.returnDifference(num1, num2));
    }

    @MethodSource("giveArgumentsForCalculatorTests")
    @ParameterizedTest
    public void multiplication(double num1, double num2) {
        Assertions.assertEquals(num1 * num2, calculatorServiceImpl.returnMultiplication(num1, num2));
    }

    @MethodSource("giveArgumentsForCalculatorTests")
    @ParameterizedTest
    public void divide(double num1, double num2) {
        Assertions.assertEquals(num1 / num2, calculatorServiceImpl.returnDivision(num1, num2));
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(3.0, 1.0),
                Arguments.of(5.0, 7.0),
                Arguments.of(10.0, 3.0),
                Arguments.of(20.0, 5.0),
                Arguments.of(-20.0, 4.0),
                Arguments.of(-20.0, 6.0)

        );
    }


}
