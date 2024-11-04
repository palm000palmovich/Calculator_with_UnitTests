package calculator.calc.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {

    //Интро
    public String printHello(){
        return "Добро пожаловать в калькулятор!";
    }

    //Сложение
    public String plus(Integer num1, Integer num2){
        if (num1 == null || num2 == null){throw new IllegalArgumentException("значение не задано");}
        return num1 + " + " + num2 + " = " + (num1+num2);
    }

    //Вычитание
    public String minus(Integer num1, Integer num2){
        if (num1 == null || num2 == null){throw new IllegalArgumentException("значение не задано");}
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    //Умножение
    public String multiply(Integer num1, Integer num2){
        if (num1 == null || num2 == null){throw new IllegalArgumentException("значение не задано");}
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    //Деление
    public String divide(Integer num1, Integer num2){
        if (num1 == null || num2 == null){throw new IllegalArgumentException("значение не задано");}
        if (num2 == 0){throw new IllegalArgumentException("недопустимое значение делителя!");}
        return num1 + " / " + num2 + " = " + (num1/num2);
    }

}
