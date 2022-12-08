import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.tree.TreeModel;

// 1. Создать словарь HashMap. Обобщение <Integer, String>.
// 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)



public class hashMap {
    public static void main(String[] args) {
        Map<Integer, String> spHashM= new HashMap<Integer, String>();
        spHashM.put(1, "white");
        spHashM.put(2, "black");
        spHashM.put(3, "green");
        spHashM.put(4, "red");
        spHashM.put(5, "yellow");
        spHashM.put(6, "blue");
        spHashM.put(7, "broun");

        System.out.println(spHashM);
        //spHashM.put(spHashM, spHashM.get(sp) + 1);
        // 3. Изменить значения дописав восклицательные знаки.

        for (String sp : spHashM.values()) {
            
            sp = sp + "!";                                   
            System.out.print(sp );
        }
        
        System.out.println(spHashM);

        //*Создать TreeMap, заполнить аналогично.
        TreeMap<Integer, String> colorTree = new TreeMap<>();

        colorTree.put(8, "white");
        colorTree.put(9, "black");
        colorTree.put(10, "green");
        colorTree.put(11, "red");
        colorTree.put(12, "yellow");
        colorTree.put(13, "blue");
        colorTree.put(14, "broun");

        System.out.println(colorTree);
        

    }
    
}
