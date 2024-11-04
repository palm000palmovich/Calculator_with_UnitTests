package calculator.calc.Constructors;


import calculator.calc.Services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorConstructor {

    @Autowired
    private final CalculatorService calcSer = new CalculatorService();

    //Интро
    @GetMapping()
    public String printIntro(){
        return calcSer.printHello();
    }

    //Сложение
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calcSer.plus(num1, num2);
    }

    //Вычитание
    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calcSer.minus(num1, num2);
    }

    //Умножение
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calcSer.multiply(num1, num2);
    }

    //Деление
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calcSer.divide(num1, num2);
    }
}
