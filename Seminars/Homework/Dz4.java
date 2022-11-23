package Seminars.Homework;

/*
 * Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */

public class Dz4 {

    public static void main(String[] args) {

        System.out.println("Восстановите выражение: 2? + ?5 = 69.");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    count ++;
                    System.out.println("2" + i + " + " + j + "5" + " = 69");
                    System.out.println("Выражений восстановлено - " + count);
                }
            }
        }
        if (count == 0) {
            System.out.println("Нельзя восстановить такое выражение");
            }
        }
    }
