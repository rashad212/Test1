package Tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    {

        char operator;
        double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Her hansi bir emeliyyat secin: +, -, * ve ya /");
        operator = input.next().charAt(0);

        System.out.println("Birinci ededi daxil edin:");
        number1 = input.nextDouble();

        System.out.println("Ikinci ededi daxil edin:");
        number2 = input.nextDouble();

        switch (operator){
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Sehv emeliyyat");
                break;

        }
        input.close();
      }
    }
}
