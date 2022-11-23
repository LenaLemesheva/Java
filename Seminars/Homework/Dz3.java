package Seminars.Homework;

/*
 * Реализовать простой калькулятор.
 */

import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Введите х - ");
        int x = inScanner.nextInt();
        System.out.print("Введите у - ");    
        int y = inScanner.nextInt();
        System.out.print("Выберите операцию (+, -, *, /) - ");
        char arithmeticОperation = inScanner.next().charAt(0);
        decision(x, y, arithmeticОperation);
        inScanner.close(); 
    }
    public static int decision(int x, int y, char arithmeticОperation) 
    {
        int answer = 0;
       
        if (arithmeticОperation == '+') {
            answer = x + y;
        }
        else if (arithmeticОperation == '-') {
            answer = x - y;
        }
        else if (arithmeticОperation == '*') {
            answer = x * y;
        }
        else if (arithmeticОperation == '/') {
            answer = x / y;
        }
        System.out.println("Ответ равен - " + answer);
        return answer;
    }
}

