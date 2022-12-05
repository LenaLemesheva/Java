package Seminars.Homework;

/*
 * Реализовать алгоритм сортировки слиянием.
 */

import java.util.ArrayList;
import java.util.Random;

public class DZ7 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = randomList(10,99,9);
        System.out.println("Создали список:       " + integerList);
        System.out.println("Выполнена сортировка слиянием:" +mergeSort(integerList));

    }

    static ArrayList<Integer> randomList(int start, int end, int size){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <size; i++) {
            list.add(random.ints(start,(end)).findFirst().getAsInt());
        }
        return list;
    }
    static ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
        if(arr.size()<2) return arr;
        ArrayList<Integer> left = mergeSort(new ArrayList<>(arr.subList(0, arr.size() / 2)));
        ArrayList<Integer> right = mergeSort(new ArrayList<>(arr.subList(arr.size() / 2, arr.size())));
        return merge(left, right, arr);
    }

    static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> merged){
        int leftCursor =0 ;
        int rightCursor = 0;
        while ((leftCursor<left.size()) && (rightCursor <right.size())){
            if(left.get(leftCursor) <= right.get(rightCursor)){
                merged.set(leftCursor+rightCursor, left.get(leftCursor));
                leftCursor++;
            }
            else {
                merged.set(leftCursor+rightCursor, right.get(rightCursor));
                rightCursor++;
            }
        }
        for (int i = leftCursor; i < left.size(); i++) {
            merged.set(i+rightCursor, left.get(i));
        }
        for (int i = rightCursor; i < right.size(); i++) {
            merged.set(leftCursor+i, right.get(i));
        }
        return merged;
    }
}
