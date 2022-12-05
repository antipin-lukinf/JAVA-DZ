//package hmwork2;
//Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinWind {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первую строку: ");
        String str1 = iScanner.nextLine();
        System.out.printf("Введите вторую строку: ");
        String str2 = iScanner.nextLine();
        iScanner.close();

        // 1
        System.out.println(
                "\nНиже все наименьшие окна первой строки, содержащие все символы второй строки (при их наличии): ");
        min_window(str1, str2);
        
    }

    public static void min_window(String firstText, String secondText) {
        Pattern pattern = Pattern.compile(secondText);
        Matcher matcher = pattern.matcher(firstText);
        while (matcher.find()) {
            System.out.println(firstText.substring(matcher.start(), matcher.end()));
        
        }
    }
    
}
