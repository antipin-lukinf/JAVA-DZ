//Дано два числа, например 3 и 56, необходимо составить следующие строки:
//3 + 56 = 59
//3 – 56 = -53
//3 * 56 = 168
//Используем метод StringBuilder.append().

public class primer {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 56;
        StringBuilder num1 = new StringBuilder(number1);
        
        
        num1.append(number1).append(" ").append("+").append(" ").append(number2).append(" = ").append(number1+number2).append("; ");
        
        num1.append(number1).append(" ").append("-").append(" ").append(number2).append(" = ").append(number1-number2).append("; ");
        num1.append(number1).append(" ").append("*").append(" ").append(number2).append(" = ").append(number1*number2).append("; ");
        System.out.println(num1);



        
    }
    
}
