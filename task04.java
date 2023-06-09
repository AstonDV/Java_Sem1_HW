// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

package Seminars.Sem01HW;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            System.out.print("Выберите операцию (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Операция не распознана");
                    return;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}