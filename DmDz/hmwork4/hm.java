import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Ввод данных с консоли и запись их в список!

public class hm {
    static Scanner cons = new Scanner(System.in);
    static ArrayList<String> Names = new ArrayList<>();
    // static ArrayList<String> firstNames = new ArrayList<>();
    // static ArrayList<String> soNames = new ArrayList<>();
    static ArrayList<Boolean> genders = new ArrayList<>();
    static ArrayList<Integer> ages = new ArrayList<>();

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
        String lastName = name.nextLine();
        Names.add(lastName);
        Scanner gend = new Scanner(System.in);
        // System.out.println("Введите имя: ");
        // String firstName = cons.nextLine();
        // firstNames.add(firstName);
        // System.out.println("Введите отчество: ");
        // String soName = cons.nextLine();
        // soNames.add(soName);
        System.out.println("Введите пол: ");
        Boolean gender = gend.nextBoolean();
        genders.add(gender);
        Scanner ag = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        Integer age = ag.nextInt();
        ages.add(age);

        
    }



        
        
}

