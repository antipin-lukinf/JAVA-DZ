import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Ввод данных с консоли и запись их в список!

public class hm {
    static Scanner cons = new Scanner(System.in);
    static ArrayList<String> lastNames = new ArrayList<>();
    static ArrayList<String> firstNames = new ArrayList<>();
    static ArrayList<String> soNames = new ArrayList<>();
    static ArrayList<Boolean> genders = new ArrayList<>();
    static ArrayList<Integer> ages = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    public static void main(String[] args) {
        
        System.out.println("Введите количество записей :");
        int numperson = cons.nextInt();
        
        while (numperson > 0) {
            
            enterData();
            numperson--;
            
        }
        
    }

    public static void enterData() {
        Scanner name = new Scanner(System.in);
        System.out.println("Введите Фамилию Имя Отчество: ");
        String Name = name.nextLine();
        Scanner gend = new Scanner(System.in);        
        System.out.println("Введите пол: ");
        Boolean gender = gend.nextBoolean();
        genders.add(gender);
        Scanner ag = new Scanner(System.in);
        System.out.println("Введите возраст (true - Мужчина, false - Женщина): ");
        Integer age = ag.nextInt();
        ages.add(age);
        String[] fio = Name.split(" ");
        if (fio.length == 3){
            firstNames.add(fio[1]);
            lastNames.add(fio[0]);
            soNames.add(fio[2]);
        }
        
        else if (fio.length == 2){
            firstNames.add(fio[1]);
            lastNames.add(fio[0]);
            soNames.add("");
        }
        else {
            firstNames.add("");
            lastNames.add(fio[0]);
            soNames.add(" ");
        }
        linkedlist.add(ages.size()-1);

        int cnt = ages.size()-1;
        while (cnt > -1) {
            int max_age = ages.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < ages.get(linkedlist.get(i))){
                    max_age = ages.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);

            cnt--;
        }
        linkedlist.forEach(i ->
        System.out.println(lastNames.get(i)+" "+firstNames.get(i)+" "+soNames.get(i)+" "+ages.get(i)+" "+genders.get(i)));

        

    }

        
    



        
        
}

