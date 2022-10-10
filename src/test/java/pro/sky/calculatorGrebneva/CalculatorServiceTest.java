package pro.sky.calculatorGrebneva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static pro.sky.calculatorGrebneva.CalculatorServiceTestConstants.*;

class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorService();

    @Test
    void shouldReturnCorrectPlusCalculationIfValuesCorrect() {
        double result = out.plus(CORRECT_VALUE, CORRECT_VALUE);
        Assertions.assertEquals(CORRECT_PLUS_CALCULATION, result);
    }

    @Test
    void shouldReturnCorrectMinusCalculationIfValuesCorrect() {
        double result = out.minus(CORRECT_VALUE, CORRECT_VALUE);
        Assertions.assertEquals(CORRECT_MINUS_CALCULATION, result);
    }

    @Test
    void shouldReturnCorrectMultiplyCalculationIfValuesCorrect() {
        double result = out.multiply(CORRECT_VALUE, CORRECT_VALUE);
        Assertions.assertEquals(CORRECT_MULTIPLY_CALCULATION, result);
    }

    @Test
    void shouldReturnCorrectDivideCalculationIfValuesCorrect() {
        double result = out.divide(CORRECT_VALUE, CORRECT_VALUE);
        Assertions.assertEquals(CORRECT_DIVIDE_CALCULATION, result);
    }
    @Test
    void shouldThrowIllegalArgumentExceptionIfNum2IsZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.divide(CORRECT_VALUE, ZERO_VALUE_FOR_NUM2));
    }
}