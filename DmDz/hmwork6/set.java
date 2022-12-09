import java.util.Comparator;
import java.util.TreeSet;

public class set {
     //Объявить и инициализировать 
    //  TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.
    
    public static void main(String[] args) {
        // Реализовать множество (set) с помощью TreeMap.
        Comparator<Integer> revComparator = Comparator.reverseOrder();
        
       
        
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        // Создать метод add, добавляющий элемент в ваше множество.
        
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(8);

        System.out.println(treeSet);
        TreeSet<Integer> set = new TreeSet<>(revComparator);
        System.out.println(set);

        // Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.

        
        


        
    }
    





}
