package Seminars.Online.StringsAndLogger;

   
//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class FifthTask {
//    private static final Logger logger = LoggerFactory.getLogger(FifthTask.class);
//
//    public static ArrayList<String> getFiles() {
//        File file = new File("C:\\Users\\toshqaaa\\IdeaProjects\\Pets\\src");
//        File[] files = file.listFiles();
//        ArrayList<String> names;
//        try {
//            names = new ArrayList<String>(Arrays.asList(file.list()));
//            return names;
//        } catch (NullPointerException nullPointerException) {
//            logger.error("Файлы не найдены в этой папке");
//        }
//        return null;
//    }
//
//    public static void writer() throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("fifthTask.txt");
//        try {
//            ArrayList<String> files = getFiles();
//
//            for (String file : files) {
//                file += "\n";
//                fileOutputStream.write(file.getBytes());
//            }
//        } catch (NullPointerException nullPointerException) {
//            logger.error("В предыдущем методе файл вернул null");
//        }
//    }
//    /*
//    Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//    Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//    Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
//    оно должно записаться в лог-файл.
// */
//
//}
