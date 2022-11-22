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

public class zaach1 {
    public static void main(String[] args) {
        
        rfString();
        
    }
    
    public static void rfString() {
        try(FileReader reader = new FileReader("C:\\Users\\antip\\Desktop\\учеба\\java\\DZ\\dz1\\input.txt"))
        {
            //посимвольное считывание файла
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }    
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }            
    }   

    
}
    


    

