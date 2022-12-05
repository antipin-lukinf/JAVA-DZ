//Замените символ “=” на слово “равно”. 
//Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

public class primerRavno {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 56;
        StringBuilder num1 = new StringBuilder(number1);
        
        
        num1.append(number1).append(" ").append("+").append(" ").append(number2).append(" = ").append(number1+number2).append("; ");
        int index = num1.indexOf("=");
        num1.deleteCharAt(index).insert(index, "равно").toString();
        

       
        System.out.println(num1);



        
    }
    
}
