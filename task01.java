// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

package Seminars.Sem01HW;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер треугольного числа: ");
        int n = scanner.nextInt();
        int triangularNumber = (n * (n + 1)) / 2;
        System.out.println("n-ое треугольное число: " + triangularNumber);
        scanner.close();
    }
}