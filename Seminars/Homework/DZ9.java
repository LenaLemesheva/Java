package Seminars.Homework;

/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Random;


public class DZ9 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = randomList(10,99,10);
        System.out.println("Создали список:   " + integerList);
        System.out.println(integerList);
        IntSummaryStatistics stats = integerList.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);
    }

    static ArrayList<Integer> randomList(int start, int end, int size){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <size; i++) {
            list.add(random.ints(start,(end)).findFirst().getAsInt());
        }
        return list;
    }
}
