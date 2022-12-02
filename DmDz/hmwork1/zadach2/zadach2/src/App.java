import java.util.Random;

//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class App {
    public static void main(String[] args) throws Exception {
        
        int i = new Random().nextInt(-1000, 1000);
        System.out.println(Integer.highestOneBit(i));       
        
    }
}
