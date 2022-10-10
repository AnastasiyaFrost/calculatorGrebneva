package pro.sky.calculatorGrebneva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculatorGrebneva.CalculatorServiceTestConstants.*;

class CalculatorServiceTest2 {
    private final CalculatorService out = new CalculatorService();
    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(CORRECT_VALUE, CORRECT_VALUE, CORRECT_PLUS_CALCULATION)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void shouldGenerateCorrectPlusCalculationIfValuesCorrect (Integer num1, Integer num2,
                                                                     double expectedResult){
        double result = out.plus(num1,num2);
        Assertions.assertEquals(expectedResult, result);
    }
    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(CORRECT_VALUE, CORRECT_VALUE, CORRECT_MINUS_CALCULATION)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void shouldGenerateCorrectMinusCalculationIfValuesCorrect (Integer num1, Integer num2,
                                                                     double expectedResult){
        double result = out.minus(num1,num2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(CORRECT_VALUE, CORRECT_VALUE, CORRECT_MULTIPLY_CALCULATION)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void shouldGenerateCorrectMultiplyCalculationIfValuesCorrect (Integer num1, Integer num2,
                                                                     double expectedResult){
        double result = out.multiply(num1,num2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(CORRECT_VALUE, CORRECT_VALUE, CORRECT_DIVIDE_CALCULATION)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void shouldGenerateCorrectDivideCalculationIfValuesCorrect (Integer num1, Integer num2,
                                                                         double expectedResult){
        double result = out.divide(num1,num2);
        Assertions.assertEquals(expectedResult, result);
    }

}