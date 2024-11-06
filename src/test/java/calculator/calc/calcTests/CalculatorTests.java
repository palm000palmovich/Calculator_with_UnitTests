package calculator.calc.calcTests;

import calculator.calc.Services.CalculatorService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTests {
    private CalculatorService cSer = new CalculatorService();


    //Сложение
    @ParameterizedTest
    @CsvSource("9,3")
    public void checkPlus(int num1, int num2){

        String expected = cSer.plus(num1,num2);
        String actual  = num1 + " + " + num2 + " = " + (num1+num2);

        assertEquals(expected, actual);

    }

    //Вычитание
    @ParameterizedTest
    @CsvSource("7,4")
    public void checkMinus(int num1, int num2){

        String expected = cSer.minus(num1,num2);
        String actual  = num1 + " - " + num2 + " = " + (num1-num2);

        assertEquals(expected, actual);

    }

    //Умножение
    @ParameterizedTest
    @CsvSource("8,3")
    public void checkMultiply(int num1, int num2){

        String expected = cSer.multiply(num1,num2);
        String actual  = num1 + " * " + num2 + " = " + (num1*num2);

        assertEquals(expected, actual);
    }

    //Деление
    @ParameterizedTest
    @CsvSource("240,3")
    public void checkDivide(int num1, int num2){

        String expected = cSer.divide(num1,num2);
        String actual  = num1 + " / " + num2 + " = " + (num1/num2);

        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource("240,0")
    public void checkDivideException(int num1, int num2){

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class ,
                () -> cSer.divide(num1, num2));
    }

}
