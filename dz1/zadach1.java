// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий
// к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000


package DZ.dz1;
import java.io.*;
import java.util.Scanner;




public class zadach1 {
    public static void main(String[] args) throws Exception {
        
        double numbers = read();
        System.out.println(numbers);
        wr();      
    }
    
    
    
    public static Double read() throws Exception {
        
        Scanner scanner = new Scanner(new File("C:\\Users\\antip\\Desktop\\учеба\\java\\DZ\\dz1\\input.txt"));{
        
        return Math.pow(Integer.parseInt(scanner.nextLine().split(" ")[1])
        ,Integer.parseInt(scanner.nextLine().split(" ")[1]));}             
    }

    /**
     * 
     */
    public static void wr(){
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\antip\\Desktop\\учеба\\java\\DZ\\dz1\\output.txt");
        double res = read(); 
        //String greetings = (read());
        fileOutputStream.write((double) res);
        fileOutputStream.close();
    }

}
    


    

