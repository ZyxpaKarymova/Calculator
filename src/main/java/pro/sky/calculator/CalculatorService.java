package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class CalculatorService {


    public String answerWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;

    }

    public String substraction(int num1, int num2) {
        int sub = num1 - num2;
        return num1 + " - " + num2 + " = " + sub;
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplication(int num1, int num2) {
        int mul = num1 * num2;
        return num1 + " * " + num2 + " = " + mul;
    }

    @GetMapping(path = "/calculator/divide")
    public String division(int num1, int num2) {
        int div = num1 / num2;
        return num1 + " / " + num2 + " = " + div;
    }
}



