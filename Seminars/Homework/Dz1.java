package Seminars.Homework;

/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner inScanner = new Scanner(System.in);
        int a = inScanner.nextInt();
        inScanner.close(); 
        System.out.println("Треугольное число = " + triangularNumber(a));
        System.out.println("Фактариал числа = " + factorialNumber(a));
    }

static int triangularNumber(int n){
    int a = n * (n + 1) / 2;
    return a;
}

static int factorialNumber (int n){
    if (n == 0) 
        return 1;
    else 
        return n * factorialNumber(n - 1);
    }
}
