package pro.sky.calculatorGrebneva;

import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Service
public class Service {
    public int sum(int num1, int num2) {
        int sum;
        if (num1 = null || num2 = null) {
            throw new RuntimeException("Требуется ввести оба параметра.");
        } else {
            sum = num1 + num2;
        }
        return sum;
    }
}
