package Seminars.Homework;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
 * что 1 человек может иметь несколько телефонов.
 */

import java.util.HashMap;
import java.util.List;

public class DZ12 {
    public static void main(String[] args) {
 
        HashMap<String, List<String>> phoneBook = new HashMap<>();    
        phoneBook.put("Иванов", List.of("111111", "222222"));
        phoneBook.put("Петров", List.of("333333", "444444"));
        phoneBook.put("Сидоров", List.of("555555", "666666"));
        phoneBook.put("Кузнецов", List.of("777777", "888888"));
        System.out.println(phoneBook.get("Иванов"));
    }
}
