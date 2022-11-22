package Lectures;

public class program {
    public static void main(String[] args) {
        System.out.println("world");
    }
}


// ТИПЫ ДАННЫХ


/*public class program {
    public static void main(String[] args) {
        String s = "  2";

        System.out.println(s);
    }
}*/


/*class Program {   // тип данных - целые числа
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age);      //10
        System.out.println(salary);   //123456
    }
}*/


/*class Program {   // тип данных - вещественные числа
    public static void main(String[] args) {
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);      //2.7
        System.out.println(pi);   //3.1415
    }
}*/


/*class Program {   // тип данных - char
    public static void main(String[] args) {
        char ch = '1';
        System.out.println(Character.isDigit(ch));      //true
        ch = 'a';      
        System.out.println(Character.isDigit(ch));   //false
    }
}*/


/*class Program {   // тип данных - boolean
    public static void main(String[] args) {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);      //true
        boolean flag2 = 123 >= 234 || flag1;      
        System.out.println(flag2);   //true
        boolean flag3 = flag1 ^ flag2;      
        System.out.println(flag3);   //false
    }
}*/


/*public class program {   // тип данных - строки
    public static void main(String[] args) {
        String msg = "Hello world";

        System.out.println(msg);   //Hello world
    }
}*/


/*public class program {   // тип данных - неявная типизация
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a);   //123
        var d = 123.456;
        System.out.println(d);   //123.456
    }
}*/


/*public class program {   // тип данных - неявная типизация (метод)
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a);   //123
        var d = 123.456;
        System.out.println(d);   //123.456
        System.out.println(getType(a));   //Integer
        System.out.println(getType(d));   //Integer
        d = 1022;
        System.out.println(d);   //1022
        //d = "mistake";
        //error: incomptible types:
        //String cannot be converted to double
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}*/


// КЛАССЫ-ОБЕРТКИ


/*public class program {   // Обертка - Integer
    public static void main(String[] args) {
        int i = 23_123_34;   // _ - для удобства (разрядность)
        System.out.println(Integer.MIN_VALUE);   
    }
}*/


// ОПЕРАЦИИ JAVA


/*public class program {   // Арифметические
    public static void main(String[] args) {
        int a = 123;   
        System.out.println(a++);  //123
        System.out.println(a);    //124
    }
}*/


/*public class program {   // Арифметические
    public static void main(String[] args) {
        int a = 123;   
        System.out.println(++a);  //124
        System.out.println(a);    //124
    }
}*/


/*public class program {   // Сравнения
    public static void main(String[] args) {
        boolean f = 123 <= 234;   
        System.out.println(f);  //true
    }
}*/


/*public class program {   // Побитовые сдвиги
    public static void main(String[] args) {
        int a = 8; 
        // 8 = 1000 - двоичный
        // a = a << 1;  
        System.out.println(a << 1);  // 16
        // 10000 = 16
    }
}*/


/*public class program {   // Побитовые операции
    public static void main(String[] args) {
        int a = 5; 
        int b = 2;
        System.out.println(a | b);  // 7
        // 5 - 101
        // 2 - 10 или 010
        // 111
    }
}*/


// МАССИВЫ


/*public class program {   // Одномерный массив
    public static void main(String[] args) {

        int[] arr = new int[10];   
        System.out.println(arr.length);  //10

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length);  //5
    }
}*/


/*public class program {   // Двумерный массив
    public static void main(String[] args) {

        int[] arr[] = new int[3][5]; 

        for (int[] line : arr) {
            for (int item : line) {  
                System.out.printf("%d", item);  
            }
            System.out.println(); 
        } 
    }
}*/


/*public class program {   // Массив массивов
    public static void main(String[] args) {

        int[][] arr = new int[3][5]; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  
                System.out.printf("%d", arr[i][j]);  
            }
            System.out.println(); 
        } 
    }
}*/


// ПРЕОБРАЗОВАНИЯ


/*public class program {   
    public static void main(String[] args) {

        int i = 123; double d = i; 
        System.out.println(i);      // 123
        System.out.println(d);      // 123.0
        d = 3.1415; i = (int)d; 
        System.out.println(d);      // 3.1415
        System.out.println(i);      // 3
        d = 3.9415; i = (int)d; 
        System.out.println(d);      // 3.9415
        System.out.println(i);      // 3
        byte b = Byte.parseByte("123"); 
        System.out.println(b);      // 123
        b = Byte.parseByte("1234"); 
        System.out.println(b);      // NumberFormatException: Value out of range (переполнение)
    }
}*/


/*public class program {   // ИЗУЧАЕМ ковариантность и контравариантность
    public static void main(String[] args) {
        int[] a = new int[10];   
        double[] d = a;
    }
}*/


// ПОЛУЧЕНИЕ ДАННЫХ ИХ ТЕРМИНАЛА


/*import java.util.Scanner;     //Строки
public class program {   
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);   
        System.out.println("name: ");  
        String name = iScanner.nextLine();   
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }
}*/


/*import java.util.Scanner;     //Примитивы
public class program {   
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);   
        System.out.printf("int a: ");  
        int x = iScanner.nextInt();   
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();   
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
    }
}*/


/*import java.util.Scanner;     //Проверка на соответствие получаемого типа
public class program {   
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);   
        System.out.printf("int a: ");  
        boolean flag = iScanner.hasNextInt();   
        System.out.println(flag);
        int i = iScanner.nextInt();   
        System.out.println(i);
        iScanner.close();
    }
}*/


// ФОРМАТИРОВАНЫЙ ВЫВОД


/*public class program {   
    public static void main(String[] args) {
        int a = 1, b = 2; 
        int c = a + b;
        String res = a + " + " + b + " = " + c;  
        System.out.println(res);  // 1 + 2 = 3
    }
}*/


/*public class program {   
    public static void main(String[] args) {
        int a = 1, b = 2; 
        int c = a + b;
        String res = String.format("%d + %d \n", a, b, c);  
        System.out.printf("%d + %d = %d \n", a, b, c); 
        System.out.println(res);   // 1 + 2 = 3
    }                              // 1 + 2
}*/


/*public class program {      // Виды спецификаторов
    public static void main(String[] args) {

        float pi = 3.1415f; 
        System.out.printf("%f\n", pi);   // 3,141500
        System.out.printf("%.2f\n", pi);   // 3,14
        System.out.printf("%.3f\n", pi);   // 3,141
        System.out.printf("%e\n", pi);   // 3,141500e+00
        System.out.printf("%.2e\n", pi);   // 3,14e+00
        System.out.printf("%.3e\n", pi);   // 3,141e+00
    }                              
}*/


// ОБЛАСТЬ ВИДИМОСТИ ПЕРЕМЕННЫХ


/*public class program {      // Виды спецификаторов
    public static void main(String[] args) {

        {
            int a = 222;
            System.out.println(a); //222
        }
        int a = 123;   
        System.out.println(a);  //123
    }                              
}*/


/*public class program {      // Виды спецификаторов
    public static void main(String[] args) {

        {
            int i = 123;
            System.out.println(i); //123
        }

        System.out.println(i);  //  error: cannot find symbol
    }                              
}*/


//  ФУНКЦИИ И  МЕТОДЫ


/*public class program {   
    public static void sayHi() {
        System.out.println("hi!");
    } 
        static int sum(int a, int b) {
            return a + b;
    }
        static double factor(int n) {
            if(n==1) return 1;
            return n * factor(n - 1); 
    }
        public static void main(String[] args) {
            sayHi();  // hi!
            System.out.println(sum(1, 3));  // 4
            System.out.println(factor(5));  // 120
    }}*/
    

//  УПРАВЛЯЮЩИЕ  КОНСТРУКЦИИ:


/*public class program {      // Условный оператор
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);  // 2
    }                              
}*/


/*public class program {      // Условный оператор
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;
        
        System.out.println(c);  // 2
    }                              
}*/

/*public class program {      // Тернарный оператор
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        int min = a < b ? a : b;
        
        System.out.println(min);  // 1
    }                              
}*/


/*public class program {      // Тернарный оператор
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        int min = a > b ? a : b;
        
        System.out.println(min);  // 2
    }                              
}*/


/*import java.util.Scanner;   // Оператор выбора
public class program {      
    public static void main(String[] args) {
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            ...
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }                              
}*/


//  ЦИКЛЫ


/*public class program {      // Цикл while
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);  // 3
    }                              
}*/


/*public class program {      // Цикл do while
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);  // 3
    }                              
}*/


/*public class program {      // Циклы continue и break (лучше не использовать)
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
        System.out.println(i);  // 1 3 5 7 9
        }                              
    }
}*/


/*public class program {      // Циклы continue и break (лучше не использовать)
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                break;
            }
        System.out.println(i);  // если цикл встречает условие, то он завершен
        }                              
    }
}*/


/*public class program {      // Цикл for
    public static void main(String[] args) {
        
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
            }
        System.out.println(s);  // 55
    }                              
}*/


/*public class program {      // Вложенные циклы
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");  
            }
            System.out.println();  
        }
        // * * * * * 
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
    }                         
}*/


/*public class program {      // for работает только для коллекций
    public static void main(String[] args) {
        
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d", item);  
            }
        System.out.println();  //0000000000
    }                              
}*/


/*public class program {      // for работает только для коллекций
    public static void main(String[] args) {
        
        int arr[] = new int[] {1,2,3,4,5,77};
        for (int item : arr) {
            System.out.println(item); // 1 2 3 4 5 77 (в столбик) 
            }
    }                              
}*/


//  РАБОТА  С  ФАЙЛАМИ


/*import java.io.FileWriter;   // Создание и запись\дозапись
import java.io.IOException;
public class program {      
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());  
        }
    } 
}*/


/*import java.io.*;   // Чтение, Вариант посимвольно
public class program {      
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);  
            } else {
                System.out.print(ch);  
            }
        } 
    }  
}*/


/*import java.io.*;   // Чтение, Вариант построчно
public class program {      
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
                System.out.printf("== %s ==\n", str);  
        } 
        br.close();
    }  
}*/