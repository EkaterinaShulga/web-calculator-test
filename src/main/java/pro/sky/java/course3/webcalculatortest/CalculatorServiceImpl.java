package pro.sky.java.course3.webcalculatortest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String showHelloCalculator() {
        return "Добро пожаловать в калькулятор программиста.";
    }


    public String returnAmount(Double num1, Double num2) {
        double sum = num1 + num2;
        return num1 + "+" + num2 + " = " + sum;

    }

    public String returnDifference(Double num1, Double num2) {
       double dif = num1 - num2;
        return num1 + "-" + num2 + " = " + dif;

    }

    public String returnMultiplication(Double num1, Double num2) {
      double mult =  num1 * num2;
        return num1 + "*" + num2 + " = " + mult;

    }

    public String returnDivision(Double num1, Double num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя";
        } else {
            double div = num1 / num2;
            return num1 + "/" + num2 + " = " + div;

        }
    }
}


