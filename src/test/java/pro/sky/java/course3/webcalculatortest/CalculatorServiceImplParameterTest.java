package pro.sky.java.course3.webcalculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class CalculatorServiceImplParameterTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @MethodSource("giveArgumentsForCalculatorTestsSum")
    @ParameterizedTest
    public void sum(double num1, double num2, double expected) {
        Assertions.assertEquals(expected, calculatorServiceImpl.returnAmount(num1, num2));

    }

    @MethodSource("giveArgumentsForCalculatorTestsMinus")
    @ParameterizedTest
    public void minus(double num1, double num2, double expected) {
        Assertions.assertEquals(num1 - num2, calculatorServiceImpl.returnDifference(num1, num2));
    }

    @MethodSource("giveArgumentsForCalculatorTestsMultiplication")
    @ParameterizedTest
    public void multiplication(double num1, double num2, double expected) {
        Assertions.assertEquals(expected, calculatorServiceImpl.returnMultiplication(num1, num2));
    }

    @MethodSource("giveArgumentsForCalculatorTestsDivide")
    @ParameterizedTest
    public void divide(double num1, double num2, double expected) {
        Assertions.assertEquals(expected, calculatorServiceImpl.returnDivision(num1, num2));
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsSum() {
        return Stream.of(
                Arguments.of(3.0, 1.0, 4.0),
                Arguments.of(7.0, 5.0, 12.0),
                Arguments.of(10.0, 3.0, 13.0),
                Arguments.of(20.0, 5.0, 25.0),
                Arguments.of(-20.0, 4.0, -16.0)

        );
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsMinus() {
        return Stream.of(
                Arguments.of(3.0, 1.0, 2.0),
                Arguments.of(7.0, 5.0, 2.0),
                Arguments.of(10.0, 3.0, 7.0),
                Arguments.of(20.0, 5.0, 15.0),
                Arguments.of(-20.0, 4.0, -16.0)
        );
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsMultiplication() {
        return Stream.of(
                Arguments.of(3.0, 1.0, 3.0),
                Arguments.of(7.0, 5.0, 35.0),
                Arguments.of(10.0, 3.0, 30.0),
                Arguments.of(20.0, 5.0, 100.0),
                Arguments.of(-20.0, 4.0, -80.0)
        );
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsDivide() {
        return Stream.of(
                Arguments.of(3.0, 1.0, 3.0),
                Arguments.of(70.0, 5.0, 14.0),
                Arguments.of(9.0, 3.0, 3.0),
                Arguments.of(20.0, 5.0, 4.0),
                Arguments.of(-20.0, 4.0, -5.0)
        );
    }

}
