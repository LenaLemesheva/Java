package Seminars.Homework;

/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.LinkedList;

public class DZ10 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1); intList.add(2); intList.add(3); intList.add(4);
        intList.add(5); intList.add(6); intList.add(7);
        System.out.println("Задан список: " + intList);
        intList = invertedList(intList);
        System.out.println("Перевернутый список: " + intList);
    }

    static LinkedList<Integer> invertedList(LinkedList<Integer> list){
        LinkedList<Integer> newList = new LinkedList<>();
            while (!list.isEmpty()){
            newList.add(list.removeLast());
        }
        return newList;
    }
}    


       

