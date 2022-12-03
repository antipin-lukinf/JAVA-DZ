import java.util.ArrayList;
import java.util.List;

//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
public class zadach3 {
    public static void main(String[] args) {
        int max = Short.MAX_VALUE;
            int min = Short.MIN_VALUE;
            System.out.println(min);
            kratnoe(max);
            ne_kratnoe(min);
        
    }
    public static void kratnoe(int max) {
        for (int i = 0; i < max; i++) {
            if (i%2==0){
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                System.out.print(list);
            }
        }
    }
        
    //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
     
    public static void ne_kratnoe(int min) {
        for (int i = 0; min < i; i--) {
            if (i%2!=0){
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                System.out.print(list);
            }
        
        }
    
    }
}
