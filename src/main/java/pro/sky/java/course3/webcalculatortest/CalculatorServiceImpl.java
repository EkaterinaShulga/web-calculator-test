package pro.sky.java.course3.webcalculatortest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String showHelloCalculator() {
        return "Добро пожаловать в калькулятор программиста.";
    }


    public double returnAmount(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double returnDifference(double num1, double num2) {
        double dif = num1 - num2;
        return dif;

    }

    public double returnMultiplication(double num1, double num2) {
        double mult = num1 * num2;
        return mult;

    }

    public double returnDivision(double num1, double num2) {
        if (num2 == 0) {
            throw new CalculatorZeroException("На ноль делить нельзя");
        } else {
            double div = num1 / num2;
            return div;

        }
    }
}


