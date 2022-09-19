package pro.sky.calculatorGrebneva;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path = "/calculator")
    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
    @GetMapping (path = "/calculator/plus?num1=5&num2=5")

}
