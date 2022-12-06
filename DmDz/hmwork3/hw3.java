

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class hw3 {

    public static void main(String[] args) {
        // 1.	Создать новый список, добавить несколько строк и вывести коллекцию на экран.

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(0, 8);
        lst.add(1, 2);
        lst.add(2, 5);
        System.out.println(lst);
        System.out.println("Максимальный элемент коллекции " + Collections.max(lst));
        System.out.println("Минимальный элемент коллекции " + Collections.min(lst));

        for (Integer integer : lst) {
            integer++;                                   
            System.out.println(integer);
        }

        // 2.	Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("green");
        color.add("yelow");

        for (String col : color) {
            col = col + "!";                                   
            System.out.println(col);
        }

        // 3.	Вставить элемент в список в первой позиции.
        color.add(0, "blue");
        System.out.println(color);

        //4.	Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(color.get(2));

        //5.	Обновить определенный элемент списка по заданному индексу.

        color.set(1, "Black");
        System.out.println(color);

        //6.	Удалить третий элемент из списка.

        color.remove(2);
        System.out.println(color);

        //7.	Поиска элемента в списке по строке.

        
        System.out.println(color.indexOf("yelow"));

        //8.	Создать новый список и добавить в него несколько елементов первого списка.

        ArrayList<String> newColor = new ArrayList<>(10);
        newColor.addAll(color);  // Почему то с определенным индексом не добавляется
        System.out.println(newColor);
        color.add("white");

        //9.	Удалить из первого списка все элементы отсутствующие во втором списке.
        color.removeAll(newColor);
        System.out.println(color);

        //10.	*Сортировка списка.
        System.out.println(newColor);
        Collections.sort(newColor);
        System.out.println(newColor);









    }
   

    
}
