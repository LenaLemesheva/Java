package Seminars.Homework;

/*
 * К калькулятору из предыдущего дз добавить логирование. 
 */

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class DZ6 {
    private static Logger logger = Logger.getLogger(DZ6.class.getName());
    public static void main(String[] args) throws IOException {

        FileHandler fh = new FileHandler("DZ6.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Solve solve = new Solve();
        int answer = solve.decision();
        System.out.println(answer);
        solve.proverka();
    }
}

class Solve {
    private static Logger logger = Logger.getLogger(DZ6.class.getName());

    String operation;
    int answer;
    int x;
    int y;
    boolean test = false;

    Solve() {

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Введите х - ");
        x = inScanner.nextInt();
        System.out.print("Введите у - ");    
        y = inScanner.nextInt();
        logger.info("Числа введены");
        System.out.print("Выберите операцию (+, -, *, /) - ");
        operation = inScanner.next();
        inScanner.close(); 
    }
    int decision() 
    {
        int answer = 0;
       
        if (operation.equals("Сложение")) {
            answer = x + y;
            test = true;
            logger.info("Операция сложения");
        }
        else if (operation.equals("Вычитание")) {
            answer = x - y;
            test = true;
            logger.info("Операция вычитания");
        }
        else if (operation.equals("Умножение")) {
            answer = x * y;
            test = true;
            logger.info("Операция умножения");
        }
        else if (operation.equals("Деление")) {
            answer = x / y;
            test = true;
            logger.info("Операция деления");
        }
        System.out.println("Ответ равен - " + answer);
        return answer;
    }

    void proverka() {
        if (test) {
            logger.info("Операция произведена");

        } else {
            System.out.println("Вы ввели неправильную операцию");
            logger.log(Level.WARNING, "Ошибка ввода");
        }
    }
}

    