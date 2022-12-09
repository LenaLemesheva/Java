package Seminars.Homework;

/*
 * Написать метод, который переведет число из римского формата записи в арабский. 
 * Например, MMXXII = 2022
 */

import java.util.*;

public class DZ14 {
    public static void main(String[] args) {
        int num = 2022;
        System.out.println(convertToRoman(num));
    }

    static String convertToRoman(int num){
        HashMap<Integer,Character> convert = new HashMap<>();
        convert.put(1, 'I');
        convert.put(5, 'V');
        convert.put(10,'X');
        convert.put(50,'L');
        convert.put(100,'C');
        convert.put(500,'D');
        convert.put(1000,'M');
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> numbers = new TreeMap<>();
        int i = 1;
        while (num!=0){
            numbers.put(i,num%10);
            i*=10;
            num/=10;
        }
        System.out.println(numbers);

        while (!numbers.isEmpty()) {
            Map.Entry<Integer, Integer> lastEntry = numbers.pollLastEntry();
            Integer key = lastEntry.getKey();
            Integer val = lastEntry.getValue();
            if (key == 1000){
                for (int j = 0; j < val; j++) {
                    sb.append(convert.get(key));
            }} else {
            if (val >= 5 && val < 9) {
                sb.append(convert.get(5*key));
                for (int j = 0; j < val - 5; j++) {
                    sb.append(convert.get(key));
                }
            } else if (val > 0 && val < 4) {
                for (int j = 0; j < val; j++) {
                    sb.append(convert.get(key));
                }
            } else if (val == 9) {
                sb.append(convert.get(key)).append(convert.get(10*key));
            } else if (val == 4) {
                sb.append(convert.get(key)).append(convert.get(5*key));
            }
            }
        }
        return sb.toString();
    }
}