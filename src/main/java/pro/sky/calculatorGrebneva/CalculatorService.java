package pro.sky.calculatorGrebneva;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public double plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException("Нужно передать оба параметра.");
        }
        return num1 + num2;
    }

    public double minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException("Нужно передать оба параметра.");
        }
        return num1 - num2;
    }

    public double multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException("Нужно передать оба параметра.");
        }
        return num1 * num2;
    }

    public double divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException("Нужно передать оба параметра.");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return (double) num1 / num2;
    }
}
