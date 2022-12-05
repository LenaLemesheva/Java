package Seminars.Homework;

/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа.
 */

import java.util.ArrayList;
import java.util.Random;

public class DZ8 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = randomList(10,99,10);
        System.out.println("Создали список:   " + integerList);
        deleteEvenNumbers(integerList);
        System.out.println("Удали из списка четные числа: " + integerList);
    }

    static ArrayList<Integer> randomList(int start, int end, int size){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <size; i++) {
            list.add(random.ints(start,(end)).findFirst().getAsInt());
        }
        return list;
    }

    static void deleteEvenNumbers(ArrayList<Integer> numbers){
        numbers.removeIf(integer -> integer % 2 == 0);
    }
}
