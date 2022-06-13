import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        try {
            System.out.println("Калькулятор: \"Число1 Операция Число2 (также - Числа)\", через пробел Числа и Операции. Допустимые Числа: от 1 до 10 или от I до X включительно. Операции: + - * /");
            System.out.print("Введите выражение: ");
            Scanner scanner = new Scanner(System.in);
            String calcString = scanner.nextLine();
            Calculator calc = new Calculator();
            String result = calc.result(calcString);
            System.out.println("Ответ: " + result);

             } catch (CalcException e)
        {
            throw new RuntimeException(e);
}
         }

}

