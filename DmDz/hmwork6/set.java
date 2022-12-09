import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class set {
     //Объявить и инициализировать 
    //  TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.
    
    public static void main(String[] args) {
        // Реализовать множество (set) с помощью TreeMap.
        
        
        
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        
        // Создать метод add, добавляющий элемент в ваше множество.
        
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(8);
        
        System.out.println(treeSet);
        
        // Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
        //Объявить и инициализировать 
        //TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.
        
        Comparator<Integer> revComparator = Comparator.reverseOrder();
        Set<Integer> set1 = new TreeSet<>(revComparator);
        set1.add(9);
        set1.add(1);
        set1.add(6);
        set1.add(7);
        System.out.println(set1);
        
        // treeSet = treeSet(Comparator.reverseOrder());
        // //TreeSet<Integer> treeSet2 = new TreeSet<Integer>(treeSet.revComparator());
        // System.out.println(treeSet2);
        
        
        
        
        

        
    }
    





}
