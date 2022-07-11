package pro.sky.java.course3.webcalculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

    }

    @GetMapping()
    public String showHelloCalculator() {
        return calculatorService.showHelloCalculator();
    }

    @GetMapping(path = "/plus")
    public String returnAmount(@RequestParam(value = "num1") Double i,
                               @RequestParam(value = "num2") Double j) {
        return "Сложение " + calculatorService.returnAmount(i, j);

    }

    @GetMapping(path = "/minus")
    public String returnDifference(@RequestParam(value = "num1", required = false) Double i,
                                   @RequestParam(value = "num2", required = false) Double j) {
        if (Objects.isNull(i) || Objects.isNull(j)) {
            return "Не верно переданы параметры!";
        }
        return "Вычетание " + calculatorService.returnDifference(i, j);
    }

    @GetMapping(path = "/multiply")
    public String returnMultiplication(@RequestParam(value = "num1", required = false) Double i,
                                       @RequestParam(value = "num2", required = false) Double j) {
        if (Objects.isNull(i) || Objects.isNull(j)) {
            return "Не верно переданы параметры!";
        }
        return "Умножение " + calculatorService.returnMultiplication(i, j);
    }

    @GetMapping(path = "/divide")
    public String returnDivision(@RequestParam(value = "num1", required = false) Double i,
                                 @RequestParam(value = "num2", required = false) Double j) {
        if (Objects.isNull(i) || Objects.isNull(j)) {
           return "Не верно переданы параметры!";
        }
        return "Деление " + calculatorService.returnDivision(i, j);
    }
}