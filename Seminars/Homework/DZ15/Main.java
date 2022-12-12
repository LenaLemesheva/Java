package Seminars.Homework.DZ15;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Белый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Черный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "Черный");

        System.out.println("По какому параметру выбираете ноутбук?");
        System.out.println("Если по ОЗУ, нажмите - 1");
        System.out.println("Если по SSD, нажмите - 2");

        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
            if(choice == 1){
                System.out.printf("Значение ОЗУ: ");
                Integer ram = sc.nextInt();
                if(ram > 32){
                    System.out.println("Таких ноутбуков нет");
                }else if(ram < 4){
                    System.out.printf(l1.toString());
                }else if(ram < 16){
                    System.out.printf(l1.toString() + "\n" + l2.toString());

                }else if(ram < 32){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
                }else if(ram <= 32){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
                }

            }else if(choice == 2){
                System.out.printf("Значение SSD: ");
                Integer ssd = sc.nextInt();
                if(ssd > 512){
                    System.out.println("Таких ноутбуков нет");
                }else if(ssd < 256){
                    System.out.printf(l1.toString());
                }else if(ssd < 512){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
                }else if(ssd <= 512){
                    System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");    
                }
            }
            sc.close();   
    }
}