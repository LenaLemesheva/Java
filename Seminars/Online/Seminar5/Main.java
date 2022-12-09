package Seminars.Online.Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(4,"v");
        myMap.put(1,"z");
        myMap.put(6,"n");
        myMap.put(2,"x");
        myMap.put(3,"c");
        myMap.put(null,null);
        myMap.put(5,"b");
        System.out.println("Начальная мапа: " + myMap);
        System.out.println("Взяли элемент с ключом 4: " + myMap.get(4));
        for(Map.Entry<Integer, String> entrySet : myMap.entrySet()) {
            System.out.println("Получить ключ: " + entrySet.getKey());
            System.out.println("Получить значение: " + entrySet.getValue());
        }


//        FirstProblem firstProblem = new FirstProblem();
//        Map<Integer, String> passports = firstProblem.fillMap(new HashMap<>());
//        Scanner in = new Scanner(System.in);
//        firstProblem.getPassportInfoByName(passports, in.next());

//        SecondProblem secondProblem = new SecondProblem();
//        String a = "paper";
//        String b = "title";
//        System.out.println(secondProblem.isIsomorphic(a,b));

//        ThirdProblem thirdProblem = new ThirdProblem();
//        thirdProblem.sortedMap("Мороз и солнце день чудесный Еще ты дремлешь " +
//                "друг прелестный Пора красавица проснись");


/*
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 * НЕ БЫВАЕТ: {a+}
 */

    }
}

