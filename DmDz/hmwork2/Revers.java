//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.

public class Revers {
    public static void main(String[] args) {
        String oneStr = "128345";
        String secondStr = "54321";
        

        secondStr = StrBld(oneStr, secondStr);
        Boolean y = Sravnit(oneStr, secondStr);
        System.out.println(y);
        if (y == true) System.out.println("Данные строки являются вращением друг друга");
        if (y == false) System.out.println("Данные строки не являются вращением друг друга"); 
    }

    public static String StrBld(String oneStr, String secondStr) {
        StringBuilder reversStr = new StringBuilder(secondStr);
        reversStr = reversStr.reverse();
               
        return reversStr.toString();        
    }

    public static Boolean Sravnit(String oneStr, String secondStr) {
        Boolean y = String.valueOf(oneStr).equals(String.valueOf(secondStr));
        return y;
    }
    
}
