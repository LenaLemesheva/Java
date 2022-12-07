package Seminars.Homework;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: 
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;

public class DZ11 {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7 };
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        System.out.println("Задан список: " + linkList);
        enqueue(linkList, 8);
        System.out.println("Помещает элемент в конец очереди: " + linkList);
        int element = dequeue(linkList);
        System.out.println("Возвращает первый элемент: " + element);
        System.out.println("И удаляет его из очереди: " + linkList);
        int element1 = first(linkList);
        System.out.println("Возвращает первый элемент: " + element1);
        System.out.println("И не удаляет его из очереди: " + linkList);
    }

    static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}

