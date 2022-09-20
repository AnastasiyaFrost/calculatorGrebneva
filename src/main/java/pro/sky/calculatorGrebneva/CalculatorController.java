package pro.sky.calculatorGrebneva;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        int plus = calculatorService.plus(num1,num2);
        return num1 + "+" + num2 + "=" + plus;
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        int minus = calculatorService.minus(num1, num2);
        return num1 + "-" + num2 + "=" + minus;
    }

    @GetMapping(path = "/calculator/multyply")
    public String multyply(@RequestParam Integer num1, @RequestParam Integer num2) {
        int multyply = calculatorService.multyply(num1, num2);
        return num1 + "*" + num2 + "=" + multyply;
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num2==0) {
            return "На ноль делить нельзя.";
        }
        double divide = calculatorService.divide(num1, num2);
        return num1 + "/" + num2 + "=" + divide;
    }
}
